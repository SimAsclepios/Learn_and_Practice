using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace ChoixSejour.Models
{
    public class Dal: IDal
    {
        private BddContext _context;
        public Dal()
        {
            _context = new BddContext();
        }

        public void DeleteCreateDatabase()
        {
            _context.Database.EnsureDeleted();
            _context.Database.EnsureCreated();
        }

        public List<Sejour> ObtientTousLesSejours()
        {
            return _context.Sejours.ToList();
        }

        public void Dispose()
        {
            _context.Dispose();
        }

        public int CreerSejour(string lieu, string telephone)
        {
            Sejour sejour = new Sejour { Lieu = lieu, Telephone = telephone };
            _context.Sejours.Add(sejour);
            _context.SaveChanges();
            return sejour.Id;
        }

        public void ModifierSejour(int id, string lieu, string telephone)
        {
            Sejour sejour = _context.Sejours.Find(id);
            if(sejour != null)
            {
                sejour.Lieu = lieu;
                sejour.Telephone = telephone;
                _context.SaveChanges();
            }
        }

        public void SuppressionSejour(int id)
        {
            Sejour sejour = _context.Sejours.Find(id);
            if (sejour != null)
            {
                _context.Sejours.Remove(sejour);
                _context.SaveChanges();
            }
        }

        public int AjouterUtilisateur(string prenom, string password)
        {
            string motDePasse = EncodeMD5(password);
            Utilisateur user = new Utilisateur() { Prenom = prenom,  Password = motDePasse };
            this._context.Utilisateurs.Add(user);
            this._context.SaveChanges();

            return user.Id;
        }

        public Utilisateur Authentifier(string prenom, string password)
        {
            string motDePasse = EncodeMD5(password);
            Utilisateur user = this._context.Utilisateurs.FirstOrDefault(u => u.Prenom == prenom && u.Password == motDePasse);
            return user;
        }

        public Utilisateur ObtenirUtilisateur(int id)
        {
            return this._context.Utilisateurs.Find(id);
        }

        public Utilisateur ObtenirUtilisateur(string idStr)
        {
            int id;
            if (int.TryParse(idStr, out id))
            {
                return this.ObtenirUtilisateur(id);
            }
            return null;
        }

        private string EncodeMD5(string motDePasse)
        {
            string motDePasseSel = "ChoixResto" + motDePasse + "ASP.NET MVC";
            return BitConverter.ToString(new MD5CryptoServiceProvider().ComputeHash(ASCIIEncoding.Default.GetBytes(motDePasseSel)));
        }
    }
}
