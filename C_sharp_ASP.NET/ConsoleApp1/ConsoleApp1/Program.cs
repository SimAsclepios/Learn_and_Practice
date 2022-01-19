using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            CompteConsumer compteAcheteur1 = new CompteConsumer(5648541, 5000);
            CompteConsumer compteAcheteur2 = new CompteConsumer(5877561, 5000);
            CompteConsumer compteAcheteur3 = new CompteConsumer(7865441, 5000);
            CompteConsumer compteAcheteur4 = new CompteConsumer(8645541, 5000);

            CompteProvider compteVendeur1 = new CompteProvider(67567868, 5000);
            CompteProvider compteVendeur2 = new CompteProvider(67567868, 5000);
            CompteProvider compteVendeur3 = new CompteProvider(67567868, 5000);
            CompteProvider compteVendeur4 = new CompteProvider(67567868, 5000);


            Compte compteTest = new Compte { solde = 1000 };

            List<Compte> comptes = new List<Compte>()
            {
                compteVendeur1,
                compteVendeur2,
                compteVendeur3,
                compteVendeur4,
                compteAcheteur1,
                compteAcheteur2,
                compteAcheteur3,
                compteAcheteur4,
            };

            compteAcheteur1.virer(compteVendeur1, 500);

            foreach (Compte compte in comptes)
            {
                Console.WriteLine(compte.ToString());
            }

            Console.ReadKey();

        }
    }
}
