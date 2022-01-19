using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    interface ITransaction
    {
        
        double Total(double prixU, int qte);
        double Location(double prixJ, int jour);
        double Formation(double prixH, double heure);

        double nbreTicket(double PrixT, int nbreT);

    }
}
