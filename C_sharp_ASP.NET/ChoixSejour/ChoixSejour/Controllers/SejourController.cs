using ChoixSejour.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ChoixSejour.Controllers
{
    [Authorize]
    public class SejourController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }


        [AllowAnonymous]
        public IActionResult ModifierSejour(int id)
        {
            if (id != 0)
            {
                using (IDal dal = new Dal())
                {
                    Sejour sejour = dal.ObtientTousLesSejours().Where(r => r.Id == id).FirstOrDefault();
                    if (sejour == null)
                    {
                        return View("Error");
                    }
                    return View(sejour);
                }
            }
            return View("Error");
        }

        //[HttpPost]
        //public IActionResult ModifierSejour(int id, string lieu, string telephone)
        //{

        //    if (id != 0)
        //    {
        //        using (Dal ctx = new Dal())
        //        {
        //            ctx.ModifierSejour(id, lieu, telephone);
        //            return RedirectToAction("ModifierSejour", new { @id = id });
        //        }
        //    }
        //    else
        //    {
        //        return View("Error");
        //    }
        //}

        [HttpPost]
        public IActionResult ModifierSejour(Sejour sejour)
        {

            if (!ModelState.IsValid)
            {
                return View(sejour);
            }


            if (sejour.Id != 0)
            {
                using (Dal ctx = new Dal())
                {
                    ctx.ModifierSejour(sejour.Id, sejour.Lieu, sejour.Telephone);
                    return RedirectToAction("ModifierSejour", new { @id = sejour.Id });
                }
            }
            else
            {
                return View("Error");
            }
        }

    }
}
