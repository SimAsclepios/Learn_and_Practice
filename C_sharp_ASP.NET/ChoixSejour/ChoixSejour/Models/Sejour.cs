using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace ChoixSejour.Models
{
    public class Sejour
    {
        public int Id { get; set; }
        [Required(ErrorMessage = "Le séjour doit être rempli.")]
        public string Lieu { get; set; }
        [Display(Name = "Téléphone")]
        [RegularExpression(@"^\d{10}$", ErrorMessage = "le numéro n'est pas valide")]
        public string Telephone { get; set; }
    }
}
