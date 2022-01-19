using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ChoixSejour.Models
{
    public class BddContext: DbContext
    {
        public DbSet<Utilisateur> Utilisateurs { get; set; }
        public DbSet<Sejour> Sejours { get; set; }
        public DbSet<Vote> Votes { get; set; }
        public DbSet<Sondage> Sondages { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySql("server=localhost;user id=root;password=rrrrr;database=ChoixSejour");
        }

        public void InitializeDb()
        {
            this.Database.EnsureDeleted();
            this.Database.EnsureCreated();
            this.Sejours.AddRange(
                new Sejour
                {
                    Id = 1,
                    Lieu = "Disney",
                    Telephone = "0606060608"
                },
                new Sejour
                {
                    Id = 2,
                    Lieu = "Chambord",
                    Telephone = "0243056666"
                }
            );
            this.Utilisateurs.AddRange(
                new Utilisateur { Prenom = "pierre", Password= "BC-C2-8A-15-B2-66-C8-3C-D4-E2-31-7D-17-16-58-A8" }
            );
            this.SaveChanges();
        }
    }
}
