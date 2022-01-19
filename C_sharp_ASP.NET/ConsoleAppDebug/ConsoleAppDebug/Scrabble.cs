using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleAppDebug
{
    class Scrabble
    { 

/*        static void Main(string[] args)
        {
            //Lecture du nombre de mot dans le dico
            int N = int.Parse(Console.ReadLine());

            // Liste des mots dans le dictionnaire
            List<string> mots = new List<string>();

            // Lecture des mots à mettre dans le dico
            for (int i = 0; i < N; i++)
            {
                string W = Console.ReadLine();
                mots.Add(W);
            }

            // Lecture de nos lettres
            string line = Console.ReadLine();

            // Liste Dynamique de nos lettres qui va servir à faire des simulation :
            // Va diminuer en fonction du nombre de lettres trouvé dans le mot
            List<char> letters;

            //Va contenir la liste des mots que l'on peut faire avec nos lettres
            List<string> possibilites = new List<string>();

            char[] point1 = { 'e', 'a', 'i', 'o', 'n', 'r', 't', 'l', 's', 'u' };
            char[] point3 = { 'b', 'c', 'm', 'p' };
            char[] point4 = { 'f', 'h', 'v', 'w', 'y' };

            // Boucle pour le nombre de mots
            for (int n = 0; n < N; n++)
            {
                // Réinitialisation du bon nombre de nos lettres pour comparer avec un nouveau mot
                // (car pendant la boucle, notre liste perd des lettres pour simuler le placement d'un mot)
                letters = line.ToCharArray().ToList();

                // Boucle qui fait passer toutes les lettres d'un mot
                for (int i = 0; i < mots[n].Length; i++)
                {

                    // Boucle qui fait passer toutes nos lettres en main
                    for (int l = 0; l < letters.Count; l++)
                    {
                        // On va comparer toutes nos lettres une à une ('l') avec LA Lettre du mot 'n' en position 'i' de ce mot
                        if (letters[l].Equals(mots[n][i]))
                        {
                            letters.RemoveAt(l);
                            break;
                        }
                    }
                    // Condition pour finaliser la comparaison du mot avec nos lettres, et l'ajouter dans les possiblités
                    if (mots[n].Length == line.Length - letters.Count)
                    {
                        possibilites.Add(mots[n]);
                        break;
                    }
                }
            }

            // Sera l'index de notre liste de mots possibles qui a le score le plus élevé
            int index = 0;
            // Score de notre meilleur mot.
            int score2 = 0;

            // Boucle qui fait passer tous les mots que l'on peut faire
            for (int n = 0; n < possibilites.Count; n++)
            {
                //Réinisialisation du score du mot possibilites[n] en cours
                int score = 0;

                // Boucle qui fait passer toutes les lettres 'i' de notre mot 'n' de la liste 'possibilites'
                for (int i = 0; i < possibilites[n].Length; i++)
                // Calcul du nombre de point apporté par chaque lettre de notre mot.
                {
                    if (point1.Contains(possibilites[n][i]))
                    {
                        score++; continue;
                    }
                    if (possibilites[n][i].Equals('d') || possibilites[n][i].Equals('g'))
                    {
                        score += 2; continue;
                    }
                    if (point3.Contains(possibilites[n][i]))
                    {
                        score += 3; continue;
                    }
                    if (point4.Contains(possibilites[n][i]))
                    {
                        score += 4; continue;
                    }
                    if (possibilites[n][i].Equals('k'))
                    {
                        score += 5; continue;
                    }
                    if (possibilites[n][i].Equals('j') || possibilites[n][i].Equals('x'))
                    {
                        score += 8; continue;
                    }
                    if (possibilites[n][i].Equals('q') || possibilites[n][i].Equals('z'))
                    {
                        score += 10;
                    }
                }

                // Si le score du mot actuel est supérieur au score du mot précédent
                if (score > score2)
                // On retient le score est l'index du nouveau mot, qui a plus de point que le mot précédent
                {
                    score2 = score;
                    index = n;
                }
            }
            // Le resultat du mot avec le plus de point, sa position est retenue dans 'index'
            Console.WriteLine(possibilites[index]);
        }
    }


//    var words = GetWords().ToList().OrderByDescending(t => t.Item2).Select(t => t.Item1);
//    char[] letters = Console.ReadLine().ToCharArray();
//    Array.Sort(letters);

//        Console.WriteLine(words.First(w => CanPlayWord(w, letters)));
//    }

//static bool CanPlayWord(string word, char[] letters)
//{
//    var wordLetters = word.ToCharArray();
//    Array.Sort(wordLetters);

//    for (int wi = 0, li = 0; wi < wordLetters.Length; wi++, li++)
//    {
//        while (li < letters.Length && letters[li] != wordLetters[wi])
//        {
//            li++;
//        }

//        if (li >= letters.Length)
//        {
//            return false;
//        }
//    }

//    return true;
//}

//static int Score(string word)
//{
//    var sum = 0;
//    foreach (char c in word) sum += Score(c);
//    return sum;
//}

//static IEnumerable<Tuple<string, int>> GetWords()
//{
//    int numWords = int.Parse(Console.ReadLine());
//    for (int i = 0; i < numWords; i++)
//    {
//        var word = Console.ReadLine();
//        yield return new Tuple<string, int>(word, Score(word));
//    }
//}

//static int Score(char c)
//{
//    switch (c)
//    {
//        case 'e':
//        case 'a':
//        case 'i':
//        case 'o':
//        case 'n':
//        case 'r':
//        case 't':
//        case 'l':
//        case 's':
//        case 'u':
//            return 1;
//        case 'd':
//        case 'g':
//            return 2;
//        case 'b':
//        case 'c':
//        case 'm':
//        case 'p':
//            return 3;
//        case 'f':
//        case 'h':
//        case 'v':
//        case 'w':
//        case 'y':
//            return 4;
//        case 'k':
//            return 5;
//        case 'j':
//        case 'x':
//            return 8;
//        case 'q':
//        case 'z':
//            return 10;
//    }

//    throw new ArgumentException("Unrecognized: " + c, "c");






    //{
    //    var scoreLetters = new Dictionary<char, int>();
    //    foreach (var c in "eaionrtlsu") scoreLetters[c] = 1;
    //    foreach (var c in "dg") scoreLetters[c] = 2;
    //    foreach (var c in "bcmp") scoreLetters[c] = 3;
    //    foreach (var c in "fhvwy") scoreLetters[c] = 4;
    //    scoreLetters['k'] = 5;
    //    foreach (var c in "jx") scoreLetters[c] = 8;
    //    foreach (var c in "qz") scoreLetters[c] = 10;
        
    //    var N = int.Parse(Console.ReadLine());
    //var words = Enumerable.Range(0, N).Select(_ => Console.ReadLine()).Select(line => new { Word = line, Lookup = line.ToLookup(x => x) }).ToArray();
    //var LETTERS = Console.ReadLine().ToLookup(x => x);
    //var word = words.Where(w => w.Lookup.All(l => l.Count() <= LETTERS[l.Key].Count())).OrderByDescending(w => w.Lookup.Sum(l => l.Count() * scoreLetters[l.Key])).First();
    //Console.WriteLine(word.Word);
    


*/

    }

}
