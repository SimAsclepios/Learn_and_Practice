using FirstMVC.Models;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace FirstMVC.Controllers
{
    public class HomeController : Controller
    {
        public HomeController()
        {
            Console.WriteLine("home controller instancié");
        }
        //public string Index(string id)
        //{
        //    return "Bonjour " + id;
        //}

        public IActionResult Index(string id)
        {
            if (string.IsNullOrEmpty(id))
            {
                return View("Error");
            }
            else
            {
                ViewData["Nom"] = id;
                return View();
            }
        }

        public IActionResult ListeClients()
        {
            List<Client> clients = Clients.ObtenirClients();
            ViewData["Clients"] = clients;
            return View();
        }

        public IActionResult ChercheClient(string id)
        {
            ViewData["Nom"] = id;
            Client client = Clients.ObtenirClients().FirstOrDefault(c => c.Nom == id);
            if (client != null)
            {
                ViewData["Age"] = client.Age;
                return View("Trouve");
            }
            return View("NonTrouve");
        }

        public IActionResult AjouterClient(string id, int age)
        {
            Client clientToAdd = new Client { Nom = id, Age = age };

            Clients.clients.Add(clientToAdd);
            
            ViewData["Nom"] = id;
            ViewData["Age"] = age;

            return View();
        }

        public IActionResult SupprimerClient(string id)
        {
            ViewData["Nom"] = id;

            Client clientToRemove = Clients.clients.FirstOrDefault(c => c.Nom == id);

            if(clientToRemove != null)
            {
                Clients.clients.Remove(clientToRemove);
                ViewData["clientExist"] = true;
            }
            else
            {
                ViewData["clientExist"] = false;
            }

            return View();
        }
    }
}
