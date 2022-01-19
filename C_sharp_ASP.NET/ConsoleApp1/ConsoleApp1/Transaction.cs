using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class Transaction : ITransaction
    {
        
        
        double ITransaction.Total(double prixU, int qte)
        {
            return prixU * qte;
        }
        double ITransaction.Location(double prixJ, int jour)
        {
            return prixJ * jour;
        }

        double ITransaction.Formation(double prixH, double heure)
        {
            return prixH * heure;
        }
        double ITransaction.nbreTicket(double prixT, int nbreT)
        {
            return prixT * nbreT;
        }
    }
}
