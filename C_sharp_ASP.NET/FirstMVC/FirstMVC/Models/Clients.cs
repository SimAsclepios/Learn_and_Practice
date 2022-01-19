using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace FirstMVC.Models
{
    public static class Clients
    {
        public static List<Client> clients = new List<Client>(){
            new Client(){Nom="Jacques", Age=25},
            new Client(){Nom="Léon", Age=35},
            new Client(){Nom="Joseph", Age=45},
            new Client(){Nom="Paul", Age=55}
            };
        public static List<Client> ObtenirClients()
        {
            return clients;
        }
    }
}
