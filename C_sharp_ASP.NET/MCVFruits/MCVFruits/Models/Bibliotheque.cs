using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace MCVFruits.Models
{
    public class Bibliotheque
    {
        public static List<Livre> biblio = new List<Livre>(){
            new Livre(){Nom="Voyage au bout de la nuit", Autheur="Louis-Ferdinand Celine", Annee=1972 },
            new Livre(){Nom="A la recherche du temps perdu", Autheur="Marcel Proust", Annee=1999 },
            new Livre(){Nom="La horde du Contrevent", Autheur="Alain Damasio", Annee=2014 },
            new Livre(){Nom="Mémoires d'Hadrien", Autheur="Marguerite Yourcenar", Annee=2019 },
            new Livre(){Nom="Orgueil et Préjugés", Autheur="Jane Austen", Annee=2012 },
            new Livre(){Nom="Le petit prince", Autheur="Antoine de Saint-Exupéry", Annee=1943 },
            };
        public static List<Livre> VoirBiblio()
        {
            return biblio;
        }


    }
}
