using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleAppDebug
{
    class Test
    {
        private static int tour = 0;
        private static int choix = 0;
        private static string command = "";


        private static List<string> lPionsJ = new List<string>();    // Liste des champs occupés par moi
        private static List<string> lPionsA = new List<string>();    // Liste des champs occupés par l'adversaire 
        private static List<string> lToMoulinJ = new List<string>();  // Liste du champ vide manquant pour avoir un moulin (moi)
        private static List<string> lToMoulinA = new List<string>();  // Liste du champ vide manquant pour que l'adversaire obtienne un moulin

        private static List<string> lVoisins = new List<string>();    // Liste complete des voisins; taille = 24; (ex : lVoisins[0] = "A1:A4;D1");   ! Attention au séparateur !

        //   private static List<string> lActionDispo = new List<string>();
        private static List<string> listCommand = new List<string>();
        private static List<string[]> lTabAttack = new List<string[]>();


        static void Main(string[] args)
        {
            int playerId = int.Parse(Console.ReadLine()); // playerId (0,1)
            int fields = int.Parse(Console.ReadLine()); // number of fields

            for (int i = 0; i < fields; i++)
            {
                string neighbors = Console.ReadLine(); // Voisin d'un champ (ex: "A1:A4;D1") ! Attention au séparateur !
                lVoisins.Add(neighbors);
            }

            // game loop
            while (true)
            {
                tour++;

                string opMove = Console.ReadLine(); // The last move executed from the opponent
                opMove.Length();
                if (opMove != "-") lPionsA.Add(PionAdversaire(opMove));

                string board = Console.ReadLine(); // Current Board and state(0:Player0 | 1:Player1 | 2:Empty) in format field:state and separated by ;
                                                   // Ici on peut faire un if 0:simsalagrim, alors playerItsMe = 0, sinon playerItsMe = 1


                lTabAttack.Clear();
                //          lActionDispo.Clear();
                listCommand.Clear();
                int nbr = int.Parse(Console.ReadLine()); // Number of valid moves proposed.
                for (int i = 0; i < nbr; i++)
                {

                    command = Console.ReadLine(); // An executable command line
                    listCommand.Add(command);
                    //               lActionDispo.Add(command);
                    string[] tab = command.Split("&");
                    if (tab.Count() == 2)
                    {
                        tab = command.Split(";");
                        lTabAttack.Add(tab);
                    }
                }

                if (lTabAttack.Any())
                {

                    Console.WriteLine(AttackTabToString(lTabAttack[0]));
                    continue;
                }

                Console.WriteLine(MonVoisin());

                /*
                            if (tour <= 9)
                            {
                                Random aleatoire = new Random();
                                int r = aleatoire.Next(0, listCommand.Count());
                                Console.WriteLine(Placement());
                                continue;
                                Console.WriteLine(listCommand[r]);
                            }
                */
                Console.WriteLine(command);
            }

        }

        public static string Placement()
        {
            if (tour == 1)
            {
                if (!lPionsA.Any())
                {
                    choix = 1;
                    return "Place;D2";
                }
                else if (!lPionsA.Contains("Place;D6"))
                {
                    choix = 2;
                    return "Place;D6";
                }
                else return "";
            }

            if (tour == 2 && choix == 1 && !lPionsA.Contains("D1"))
            {
                choix = 3;
                return "Place;D1";
            }
            else if (tour == 2 && choix == 2 && !lPionsA.Contains("D7"))
            {
                choix = 4;
                return "Place D7";
            }
            else return "";
        }

        public static string MonVoisin()
        {
            //    string goodPlace = "";
            List<string> mesVoisins = new List<string>();
            string[] tab = new string[3];

            for (int i = 0; i < lPionsJ.Count(); i++)
            {
                for (int n = 0; n < lVoisins.Count(); n++)
                {
                    if (lPionsJ[i].Equals(VoisinLigneToTab(lVoisins[n])[0]))
                    {
                        // A Ameliorer ici
                        tab = lVoisins[n].Split(":");

                        if (!lPionsA.Contains(tab[1]) && !lPionsJ.Contains(tab[1]))
                        {
                            if (!Play(tab[1]).Equals(""))
                            {
                                return Play(tab[1]);
                            }
                        }
                        else if (!lPionsA.Contains(tab[2]) && !lPionsJ.Contains(tab[2]))
                        {
                            if (!Play(tab[2]).Equals(""))
                            {
                                return Play(tab[2]);
                            }
                        }
                    }
                }
            }
            return command;
            //    if goodplace
        }

        public static string Play(string monVoisin)
        {
            for (int i = 0; i < listCommand.Count(); i++)
            {
                if (listCommand[i][1].Equals(monVoisin))
                {
                    return listCommand[i];
                }
            }
            return "";
        }


        public static string CommandToPlace(string command)
        {
            string[] tab = command.Split(";");

            if (command.Contains("Move"))
            {
                return tab[2].ToString();
            }
            return tab[1].ToString();
        }

        public static string AttackTabToString(string[] attTab)
        {
            if (attTab.Count() == 2)
            {
                return attTab[0] + ";" + attTab[1];
            }
            else return attTab[0] + ";" + attTab[1] + ";" + attTab[2];
        }

        public static string PionAdversaire(string attaque)
        {
            string[] tab = attaque.Split(";");
            return tab[1];
        }

        public static void ToMoulin(List<string> listPion, List<string> listToMoulin)
        {
            List<string> doublon = new List<string>();
            //        List<string[]> tabVoisins = new List<string[]>();

            for (int i = 0; i < listPion.Count(); i++)
            {
                for (int n = 0; n < lVoisins.Count(); n++)
                {
                    if (listPion[i].Equals(VoisinLigneToTab(lVoisins[n])[0]))
                    {
                        // && Rajouter dans la condition la méthode pour détecter un moulin complet, pour qu'il ne soit pas dans le ToMoulin
                        // mettre dans liste moulin du joueur ou adversaire, une lettre ou un chiffre
                        if (listPion.Contains(VoisinLigneToTab(lVoisins[n])[1]) && !doublon.Contains(VoisinLigneToTab(lVoisins[n])[2]))
                        {
                            doublon.Add(VoisinLigneToTab(lVoisins[n])[1]);
                            listToMoulin.Add(listPion[i]);
                            listToMoulin.Add(VoisinLigneToTab(lVoisins[n])[1]);
                        }
                        if (listPion.Contains(VoisinLigneToTab(lVoisins[n])[2]) && !doublon.Contains(VoisinLigneToTab(lVoisins[n])[1]))
                        {
                            doublon.Add(VoisinLigneToTab(lVoisins[n])[2]);
                            listToMoulin.Add(listPion[i]);
                            listToMoulin.Add(VoisinLigneToTab(lVoisins[n])[2]);
                        }
                    }

                }
            }

        }

        // Bloquer Adversaire
        public static List<string> Block()
        {
            return null;
            // traiter la liste de pion placée par l'adversaire ici pour sortir une liste de champs vides qui permet de bloquer l'adversaire pour l'empcher de faire un moulin
        }

        public static List<string[]> Attack()
        {
            return null;
            // traiter la liste de pion placée par l'adversaire ici pour sortir une liste de Champs associés par paire, car ils sont voisins et permmetent bientot la formation d'un moulin
        }

        public static void Moulin(List<string> list)
        {

        }


        public static string[] VoisinLigneToTab(string voisinLigne)
        {
            string[] tab = voisinLigne.Replace(";", ":").Split(":");
            return tab;
        }

        public static bool Dispo(string place)
        {
            if (lPionsJ.Contains(place) || lPionsA.Contains(place))
            {
                return false;
            }
            else return true;
        }
    }


