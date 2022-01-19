using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleAppDebug
{
    class NineMen_sMorris
    {
        static void Main(string[] args)
        {
            List<string> list = new List<string>();
            list.Add("A4");
            Console.WriteLine(list[0].Contains("A"));
        }

    }
}

//        private static int tour = 0;
//        private static string command = "";
//        private static string lastCommand = "";

//        private static List<string> lPionsJ = new List<string>();    // Liste des champs occupés par moi
//        private static List<string> lPionsA = new List<string>();    // Liste des champs occupés par l'adversaire 
//        private static List<string> lToMoulinJ = new List<string>();  // Liste du champ vide manquant pour avoir un moulin (moi)
//        private static List<string> lToMoulinA = new List<string>();  // Liste du champ vide manquant pour que l'adversaire obtienne un moulin

//        private static List<string> lVoisins = new List<string>();    // Liste complete des voisins; taille = 24; (ex : lVoisins[0] = "A1:A4;D1");   ! Attention au séparateur !

//        private static List<string> lActionDispo = new List<string>();
//        private static List<string> listCommand = new List<string>();
//        private static List<string[]> listAttack = new List<string[]>();


//        static void Main(string[] args)
//        {
//            int playerId = int.Parse(Console.ReadLine()); // playerId (0,1)
//            int fields = int.Parse(Console.ReadLine()); // number of fields

//            for (int i = 0; i < fields; i++)
//            {
//                string neighbors = Console.ReadLine(); // Voisin d'un champ (ex: "A1:A4;D1") ! Attention au séparateur !
//                lVoisins.Add(neighbors);
//            }

//            // game loop
//            while (true)
//            {
//                tour++;

//                string opMove = Console.ReadLine(); // The last move executed from the opponent
//                if (opMove != "-") lPionsA.Add(opMove);

//                string board = Console.ReadLine(); // Current Board and state(0:Player0 | 1:Player1 | 2:Empty) in format field:state and separated by ;
//                                                   // Ici on peut faire un if 0:simsalagrim, alors playerItsMe = 0, sinon playerItsMe = 1


//                listCommand.Clear();
//                lActionDispo.Clear();
//                int nbr = int.Parse(Console.ReadLine()); // Number of valid moves proposed.
//                for (int i = 0; i < nbr; i++)
//                {

//                    command = Console.ReadLine(); // An executable command line

//                    lActionDispo.Add(command);
//                    string[] tab = command.Split("&");
//                    if (tab.Count() == 2)
//                    {
//                        listCommand.Add(command);
//                        tab = command.Split(";");
//                        listAttack.Add(tab);
//                    }
//                }

//                if (listCommand.Any())
//                {
//                    Console.WriteLine(listCommand[0]);
//                    continue;
//                }

//                if (tour > 9)
//                {
//                    Random aleatoire = new Random();
//                    int r = aleatoire.Next(0, lActionDispo.Count());
//                    Console.WriteLine(lActionDispo[r]);
//                    continue;
//                }

//                Console.WriteLine(command);
//            }

//        }

//        static void ToMoulin(List<string> listPion, List<string> listToMoulin)
//        {
//            List<string> doublon = new List<string>();
//     //        List<string[]> tabVoisins = new List<string[]>();

//            for (int i = 0; i < listPion.Count(); i++)
//            {
//                for (int n = 0; n < lVoisins.Count(); n++)
//                {
//                    if (listPion[i].Equals(VoisinLigneToTab(lVoisins[n])[0]))
//                    {
//                        // && Rajouter dans la condition la méthode pour détecter un moulin complet, pour qu'il ne soit pas dans le ToMoulin
//                            // mettre dans liste moulin du joueur ou adversaire, une lettre ou un chiffre

//                    }
//                    if (listPion.Contains(VoisinLigneToTab(lVoisins[n])[1]) && !doublon.Contains(VoisinLigneToTab(lVoisins[n])[2]))
//                    {
//                    listToMoulin.Add(VoisinLigneToTab(lVoisins[n])[2]);
//                    doublon.Add(VoisinLigneToTab(lVoisins[n])[2]);
//                    //  listToMoulin.Add(listPion[i]);
//                    //  listToMoulin.Add(VoisinStringToTab(lVoisins[n])[1]));
//                }
//                    if (listPion.Contains(VoisinLigneToTab(lVoisins[n])[2]) && !doublon.Contains(VoisinLigneToTab(lVoisins[n])[1]))
//                    {
//                    listToMoulin.Add(VoisinLigneToTab(lVoisins[n])[1]);
//                    listToMoulin.Add(VoisinLigneToTab(lVoisins[n])[1]);
//                    //  listToMoulin.Add(listPion[i]);
//                    //  listToMoulin.Add(lVoisins[n][2]);
//                    }
//                }
//            }

//        }

//    // Transformer un string en Champs
//    static Champs StringToPion(string pionString)
//    {
//        string lettre = pionString[0].ToString();
//        int chiffre = int.Parse(pionString[1].ToString());
//        return Pion(lettre, chiffre);
//    }

//    static Champs Pion(string lettre, int chiffre)
//    {
//        return new Champs(lettre, chiffre);
//    }

//    static bool ContainsObject(List<Champs> listChamps, string stringChamps)
//    {
//        for (int i = 0; i < listChamps.Count(); i++)
//        {
//            if (listChamps[i].ToString().Equals(stringChamps))
//            {
//                return true;
//            }
//        }
//        return false;
//    }

//    // Bloquer Adversaire
//    static List<string> Block()
//    {
//        return null;
//        // traiter la liste de pion placée par l'adversaire ici pour sortir une liste de champs vides qui permet de bloquer l'adversaire pour l'empcher de faire un moulin
//    }

//    static List<string[]> Attack()
//    {
//        return null;
//        // traiter la liste de pion placée par l'adversaire ici pour sortir une liste de Champs associés par paire, car ils sont voisins et permmetent bientot la formation d'un moulin
//    }

//    static void Moulin(List<Champs> list)
//    {

//    }


//    static string[] VoisinLigneToTab(string voisinLigne)
//    {
//        string[] tab = voisinLigne.Replace(";", ":").Split(":");
//        return tab;
//    }


//}





//// Créer un objet Champs 
//public class Champs // objet d'un pion placé dans un champs
//{
//    private int Chiffre { get; set; }
//    private string Lettre { get; set; }

//    public Champs(string coordX, int coordY)
//    {
//        this.Lettre = coordX;
//        this.Chiffre = coordY;
//    }

//    public override string ToString()
//    {
//        return Lettre + Chiffre.ToString();
//    }

//}

//public class Commande
//{

//}

//}