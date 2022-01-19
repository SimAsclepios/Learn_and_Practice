using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class CompteConsumer : Compte
    {
        public CompteConsumer() : base() { }                       //Constructeur par défaut
        public CompteConsumer(int code, double solde) : base(code, solde) { }      //Constructeur d'initialisation

        public override void recevoir(Compte acheteur, double somme)               //méthode virtuelle qui peut être redéfinie dans une classe dérivée
        {
            virer(acheteur, 50);
            solde += somme-5;
            acheteur.solde -= somme-5;
        }



        public override string ToString()                        //ToString redéfinie
        {
            return "CompteConsumer: " + base.ToString();
        }
    }
}

