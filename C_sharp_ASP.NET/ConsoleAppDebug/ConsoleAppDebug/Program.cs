using System;
using System.Collections.Generic;

namespace ConsoleAppDebug
{
    class Program
    {




        //static void Main(string[] args)
        //{
        //    string[] inputs;
        //    int chemin = 0;
        //    List<string> jeu = new List<string>();

        //    // game loop
        //    while (true)
        //    {

        //        inputs = Console.ReadLine().Split(' ');
        //        string opponentRow = inputs[0];
        //        string opponentCol = inputs[1];
        //        jeu.Add(opponentRow + " " + opponentCol);
        //        int validActionCount = int.Parse(Console.ReadLine());



        //        for (int i = 0; i < validActionCount; i++)
        //        {

        //            inputs = Console.ReadLine().Split(' ');
        //            string Row = inputs[0];
        //            string Col = inputs[1];
        //            jeu.Add(opponentRow + " " + opponentCol);

        //            //    jeu.Add(Console.ReadLine() + " x"); 

        //        }

        //        // Write an action using Console.WriteLine()
        //        // To debug: Console.Error.WriteLine("Debug messages...");
        //        if (!jeu.Contains("1 1"))
        //        {
        //            Console.WriteLine("1 1");
        //        }

        //        /*
        //                    if (!jeu.Contains("0 0 o") && chemin == 0 && !jeu.Contains("2 2 o") && !jeu.Contains("1 0 o") && !jeu.Contains("2 0 o")  && !jeu.Contains("0 1 o") && !jeu.Contains("0 2 o"))
        //                    {
        //                        Console.WriteLine("0 0");
        //                        chemin = 1;
        //                    }

        //                    if (!jeu.Contains("0 2 o") && chemin == 0 && !jeu.Contains("2 0 o") && jeu.Contains("2 2 o") || jeu.Contains("2 2 o"))
        //                    {
        //                        Console.WriteLine("0 0");
        //                        chemin = 2;
        //                    }

        //                    if (!jeu.Contains("2 0 o") && chemin == 0 && !jeu.Contains("0 2 o"))
        //                    {
        //                        Console.WriteLine("0 0");
        //                        chemin = 3;
        //                    }

        //                    if (!jeu.Contains("2 2 o") && chemin == 0 && !jeu.Contains("0 0 o"))
        //                    {
        //                        Console.WriteLine("0 0");
        //                         chemin = 4;
        //                    }


        //                    if (chemin == 1)
        //                    {
        //                        if (!jeu.Contains("2 2 o"))
        //                        {
        //                            Console.WriteLine("2 2");
        //                        }
        //                        if (!jeu.Contains("1 0") || !jeu.Contains("2 0"))
        //                        {
        //                            if (!jeu.Contains("1 2") && !jeu.Contains("1 2"))
        //                            Console.WriteLine():
        //                        }
        //                    }
        //        */

        //        if (!jeu.Contains("0 0"))
        //        {
        //            Console.WriteLine("0 0");
        //            continue;
        //        }

        //        if (!jeu.Contains("0 1"))
        //        {
        //            Console.WriteLine("0 1");
        //            continue;
        //        }

        //        if (!jeu.Contains("1 0"))
        //        {
        //            Console.WriteLine("1 0");
        //            continue;
        //        }

        //        if (!jeu.Contains("2 0"))
        //        {
        //            Console.WriteLine("2 0");
        //            continue;
        //        }

        //        if (!jeu.Contains("0 2"))
        //        {
        //            Console.WriteLine("0 2");
        //            continue;
        //        }

        //        if (!jeu.Contains("2 1"))
        //        {
        //            Console.WriteLine("2 1");
        //            continue;
        //        }

        //        if (!jeu.Contains("1 2"))
        //        {
        //            Console.WriteLine("1 2");
        //            continue;
        //        }

        //        if (!jeu.Contains("2 2"))
        //        {
        //            Console.WriteLine("2 2");
        //            continue;
        //        }

        //    }
        //}














        //static void main(string[] args)
        //{
        //    string[] inputs;
        //    int chemin = 0;
        //    list<string> jeu = new list<string>();

        //    game loop
        //    while (true)
        //    {

        //        inputs = console.readline().split(' ');
        //        string opponentrow = inputs[0];
        //        string opponentcol = inputs[1];
        //        jeu.add(opponentrow + " " + opponentcol);
        //        int validactioncount = int.parse(console.readline());



        //        for (int i = 0; i < validactioncount; i++)
        //        {

        //            inputs = console.readline().split(' ');
        //            string row = inputs[0];
        //            string col = inputs[1];
        //            jeu.add(row + " " + col);

        //            jeu.add(console.readline() + " x");

        //        }

        //        write an action using console.writeline()
        //         to debug: console.error.writeline("debug messages...");
        //        if (!jeu.contains("1 1"))
        //        {
        //            console.writeline("1 1");
        //        }

        //        /*
        //                    if (!jeu.contains("0 0 o") && chemin == 0 && !jeu.contains("2 2 o") && !jeu.contains("1 0 o") && !jeu.contains("2 0 o")  && !jeu.contains("0 1 o") && !jeu.contains("0 2 o"))
        //                    {
        //                        console.writeline("0 0");
        //                        chemin = 1;
        //                    }

        //                    if (!jeu.contains("0 2 o") && chemin == 0 && !jeu.contains("2 0 o") && jeu.contains("2 2 o") || jeu.contains("2 2 o"))
        //                    {
        //                        console.writeline("0 0");
        //                        chemin = 2;
        //                    }

        //                    if (!jeu.contains("2 0 o") && chemin == 0 && !jeu.contains("0 2 o"))
        //                    {
        //                        console.writeline("0 0");
        //                        chemin = 3;
        //                    }

        //                    if (!jeu.contains("2 2 o") && chemin == 0 && !jeu.contains("0 0 o"))
        //                    {
        //                        console.writeline("0 0");
        //                         chemin = 4;
        //                    }


        //                    if (chemin == 1)
        //                    {
        //                        if (!jeu.contains("2 2 o"))
        //                        {
        //                            console.writeline("2 2");
        //                        }
        //                        if (!jeu.contains("1 0") || !jeu.contains("2 0"))
        //                        {
        //                            if (!jeu.contains("1 2") && !jeu.contains("1 2"))
        //                            console.writeline():
        //                        }
        //                    }
        //        */

        //        if (!jeu.contains("0 0"))
        //        {
        //            console.writeline("0 0");
        //            continue;
        //        }

        //        if (!jeu.contains("0 1"))
        //        {
        //            console.writeline("0 1");
        //            continue;
        //        }

        //        if (!jeu.contains("1 0"))
        //        {
        //            console.writeline("1 0");
        //            continue;
        //        }

        //        if (!jeu.contains("2 0"))
        //        {
        //            console.writeline("2 0");
        //            continue;
        //        }

        //        if (!jeu.contains("0 2"))
        //        {
        //            console.writeline("0 2");
        //            continue;
        //        }

        //        if (!jeu.contains("2 1"))
        //        {
        //            console.writeline("2 1");
        //            continue;
        //        }

        //        if (!jeu.contains("1 2"))
        //        {
        //            console.writeline("1 2");
        //            continue;
        //        }

        //        if (!jeu.contains("2 2"))
        //        {
        //            console.writeline("2 2");
        //            continue;
        //        }

        //    }
        //}
    }
}
