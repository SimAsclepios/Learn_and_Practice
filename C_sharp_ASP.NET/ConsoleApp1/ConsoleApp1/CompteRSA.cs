using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    class CompteRSA : Compte
    {
        
            

            

            public CompteRSA() : base() { }                  //constructeur par défaut

            public CompteRSA(int code, double solde) : base(code, solde) { } //constructeur d'initialisation

            public void Calculertaux()                      //une nouvelle méthode qui utilise une méthode héritée
            {
               // recevoir((solde * taux) / 100);
            }

            //public override string ToString()                  //redéfinition de la méthode ToString()
           // {
                //return "Compte Provide: " + base.ToString() + " Taux de Platefporme: " + taux;
           // }
        }

    }


