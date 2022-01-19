using System;
using System.Text;

namespace ConsoleApp1
{
    public class CompteProvider : Compte
    {
        private double tauxPTF = 10;

        public double Tauxinteret
        {
            get { return tauxPTF; }
        }

        public CompteProvider() : base() { }                  //constructeur par défaut

        public CompteProvider(int code, double solde) : base(code,  solde) { } //constructeur d'initialisation

        public void Calculertaux()                      //une nouvelle méthode qui utilise une méthode héritée
        {
           // recevoir((solde * tauxPTF) / 100);
        }

        public override string ToString()                  //redéfinition de la méthode ToString()
        {
            return "Compte Provide: " + base.ToString() + " Taux de Platefporme: " + tauxPTF;
        }
    }

}
