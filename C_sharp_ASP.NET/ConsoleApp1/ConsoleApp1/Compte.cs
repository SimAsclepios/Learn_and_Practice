using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class Compte
    {

        public int code { get; set; }
        public double solde { get; set; }



        public Compte(int code, double solde)
        {

            this.solde = solde;
            this.code = code;
        }

        public double DeterminerTaux(double montant)
        {
            if (montant < 20)
            { return 10; }

            if (montant < 50)
            { return 8; }

            else { return 6; }
        }
          
        public double calculTTC(double montantProvider)
        {
            double taux = DeterminerTaux(montantProvider);

            return montantProvider + montantProvider * (taux / 100);
            
        }
        

        public Compte()
        {
        }

        public virtual void recevoir(Compte acheteur, double somme)               //méthode virtuelle qui peut être redéfinie dans une classe dérivée
        {
            solde += somme;
            acheteur.solde -= somme;
        }

        public virtual void virer(Compte vendeur, double somme)             ////méthode virtuelle qui peut être redéfinie dans une classe dérivée
        {
            double taux = DeterminerTaux(somme);
            solde -= somme*(taux/100);
            vendeur.solde += solde;

        }

       // public void Transaction(Compte vendeur, double somme)
        //{
          //  virer(vendeur, double somme)
       // }

        public override string ToString()
        {
            return "Code: " + code + " Solde: " + solde;
        }
    }
}
