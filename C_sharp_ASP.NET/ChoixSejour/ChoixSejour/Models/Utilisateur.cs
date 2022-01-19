﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace ChoixSejour.Models
{
    public class Utilisateur
    {
        public int Id { get; set; }
        [Required]
        [MaxLength(20)]
        public string Prenom { get; set; }

        [Required]
        [MaxLength(50)]
        public string Password { get; set; }
    }
}
