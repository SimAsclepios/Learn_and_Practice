package appli.maven.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="LISTE_ARTICLE")
public class Article {

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_article")  
	private Long idArticle;

	@Basic(optional=false)  
	@Column(length = 150)
	private String libelle;
	
	@Column(length = 512, name = "desc_courte")
	private String descriptionCourte;
	
	// @Column(columnDefinition="TEXT")
	@Column(name="desc_longue")
	// @Lob @Basic(fetch=FetchType.LAZY)  	// Pour les champs volumineux (texte ou binaire)
	private String descriptionLongue;
	
	@Column(name="en_stock")
	private Boolean enStock;
	
	@Basic(optional=false)
	private int quantite;
	
	@Basic(optional=false)  
	@Column(name="date_parution")
	@Temporal(TemporalType.DATE)
	private Date dateParution;

	@Column(name="date_validate")
	@Temporal(TemporalType.DATE)
	private Date dateValidate;

	@Column(name="prix_unitaire")
	private Float prixUnitaire;
	
	@ManyToOne @JoinColumn
	private Panier panier;
	
	public Article() {
	}
	
	@Enumerated(EnumType.STRING)
	private Categorie etat;
	
	public enum Categorie {
		LIVRES, JEUX, MUSIQUE, CONSO, COSMETIQUE;
		}
	
	
	public Article(String libelle, String descriptionCourte, String descriptionLongue, Boolean enStock, int quantite,
			Date dateParution, Float prixUnitaire, Categorie etat) {
		super();
		this.libelle = libelle;
		this.descriptionCourte = descriptionCourte;
		this.descriptionLongue = descriptionLongue;
		this.enStock = enStock;
		this.quantite = quantite;
		this.dateParution = dateParution;
		this.prixUnitaire = prixUnitaire;
		this.etat = etat;
	}




	

		

	
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Article [idArticle=");
			builder.append(idArticle);
			builder.append(", libelle=");
			builder.append(libelle);
			builder.append(", descriptionCourte=");
			builder.append(descriptionCourte);
			builder.append(", descriptionLongue=");
			builder.append(descriptionLongue);
			builder.append(", enstock=");
			builder.append(enStock);
			builder.append(", quantite=");
			builder.append(quantite);
			builder.append(", dateParution=");
			builder.append(dateParution);
			builder.append(", dateValidate=");
			builder.append(dateValidate);
			builder.append(", prixUnitaire=");
			builder.append(prixUnitaire);
			builder.append(", etat=");
			builder.append(etat);
			builder.append("]");
			return builder.toString();
		}

		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dateParution == null) ? 0 : dateParution.hashCode());
			result = prime * result + ((idArticle == null) ? 0 : idArticle.hashCode());
			result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Article other = (Article) obj;
			if (dateParution == null) {
				if (other.dateParution != null)
					return false;
			} else if (!dateParution.equals(other.dateParution))
				return false;
			if (idArticle == null) {
				if (other.idArticle != null)
					return false;
			} else if (!idArticle.equals(other.idArticle))
				return false;
			if (libelle == null) {
				if (other.libelle != null)
					return false;
			} else if (!libelle.equals(other.libelle))
				return false;
			return true;
		}


		
		public Long getIdArticle() {
			return idArticle;
		}

/*	Ne pas faire le setter pour l'ID !
		public void setIdArticle(Long idArticle) {
			this.idArticle = idArticle;
		}
*/
		
		public String getLibelle() {
			return libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

		public String getDescriptionCourte() {
			return descriptionCourte;
		}

		public void setDescriptionCourte(String descriptionCourte) {
			this.descriptionCourte = descriptionCourte;
		}

		public String getDescriptionLongue() {
			return descriptionLongue;
		}

		public void setDescriptionLongue(String descriptionLongue) {
			this.descriptionLongue = descriptionLongue;
		}

		public Boolean getEnStock() {
			return enStock;
		}

		public void setEnStock(Boolean enStock) {
			this.enStock = enStock;
		}

		public int getQuantite() {
			return quantite;
		}

		public void setQuantite(int quantite) {
			this.quantite = quantite;
		}

		public Date getDateParution() {
			return dateParution;
		}

		public void setDateParution(Date dateParution) {
			this.dateParution = dateParution;
		}

		public Date getDateValidate() {
			return dateValidate;
		}

		public void setDateValidate(Date dateValidate) {
			this.dateValidate = dateValidate;
		}

		public Float getPrixUnitaire() {
			return prixUnitaire;
		}

		public void setPrixUnitaire(Float prixUnitaire) {
			this.prixUnitaire = prixUnitaire;
		}

		public Categorie getEtat() {
			return etat;
		}

		public void setEtat(Categorie etat) {
			this.etat = etat;
		}

	
	
	
		
		
}
