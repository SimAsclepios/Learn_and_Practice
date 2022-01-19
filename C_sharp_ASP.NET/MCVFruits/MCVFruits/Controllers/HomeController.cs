using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using MCVFruits.Models;

namespace MCVFruits.Controllers
{
    public class HomeController : Controller
    {

        public IActionResult Index(string id)
        {
            if (string.IsNullOrEmpty(id))
            {
                return View("Error");
            }
            else return Biblio();
        }


        public IActionResult Connection()
        {
            return View();
        }

        public IActionResult Biblio()
        {
            List<Livre> biblio = Bibliotheque.VoirBiblio();
            ViewData["biblio"] = biblio;
            return View();
        }

        /*
        public IActionResult Biblio(string action, string nom, string autheur, int annee)
        {
            ViewData["action"] = action;
            ViewData["nom"] = nom;
            ViewData["autheur"] = autheur;
            ViewData["annee"] = annee;

            if (action.Equals("Remettre"))
            {
                Remettre(nom, autheur, annee);
            }

            else
            {
                Prendre(nom);
            }
            return View();
        }
        */


        public IActionResult Remettre(string nom, string autheur, int annee)
        {

            ViewData["nom"] = nom;
            ViewData["autheur"] = autheur;
            ViewData["annee"] = annee;


            Console.WriteLine("Remettre instancié");
            Livre livreAj = new Livre { Nom = nom, Autheur = autheur, Annee = annee };

            Bibliotheque.biblio.Add(livreAj);

            return View();
        }


        public IActionResult Prendre(string nom)
        {
            ViewData["nom"] = nom;

            Console.WriteLine("Prendre instancié");
            Livre livreSup = Bibliotheque.biblio.FirstOrDefault(l => l.Nom == nom);

            if (livreSup != null)
            {
                Bibliotheque.biblio.Remove(livreSup);
                ViewData["livreExist"] = true;
            }
            else
            {
                ViewData["livreExist"] = false;
            }

            return View();
        }

    }
}
