package appli.maven.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Panier {

//	@OneToMany(mappedBy="Panier") @JoinColumn
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "panier") @JoinColumn
	private List<Article> listArticle; // = new LinkedList<>();

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_panier")  
	private Long idPanier;

	private String libelle;
	
//	@Basic(optional=false)  
	@Column(name="date_Creation")
	@Temporal(TemporalType.DATE)
	private Date dateCreation;

	@Basic(optional=false)
	@Column(name="date_paiement")
	@Temporal(TemporalType.DATE)
	private Date datePaiement;

	@Column(name="quantite_articles")
	private int qteArticle;
	
	@Column(name="prix_Panier")
	private Float prixPanier;
	
	@Enumerated(EnumType.STRING)
	private Categorie statut;
	
	public enum Categorie {
		En_Cours, Valide;
		}

	public Panier() {};
	
	
	
	
	public Panier(List<Article> listArticle, Long idPanier, String libelle, Date dateCreation, Date datePaiement,
			int qteArticle, Float prixPanier, Categorie statut) {
		super();
		this.libelle = libelle;
		this.listArticle = listArticle;
		this.idPanier = idPanier;
		this.dateCreation = dateCreation;
		this.datePaiement = datePaiement;
		this.qteArticle = qteArticle;
		this.prixPanier = prixPanier;
		this.statut = statut;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(libelle, idPanier);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Panier other = (Panier) obj;
		return Objects.equals(libelle, other.libelle) && Objects.equals(idPanier, other.idPanier);
	}

	public List<Article> getListArticle() {
		return listArticle;
	}

	public void setListArticle(List<Article> listArticle) {
		this.listArticle = listArticle;
	}	

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public int getQteArticle() {
		return qteArticle;
	}

	public void setQteArticle(int qteArticle) {
		this.qteArticle = qteArticle;
	}

	public Float getPrixPanier() {
		return prixPanier;
	}

	public void setPrixPanier(Float prixPanier) {
		this.prixPanier = prixPanier;
	}

	public Categorie getStatut() {
		return statut;
	}

	public void setStatut(Categorie statut) {
		this.statut = statut;
	}

	public Long getIdPanier() {
		return idPanier;
	}
	
	
	
	
}
