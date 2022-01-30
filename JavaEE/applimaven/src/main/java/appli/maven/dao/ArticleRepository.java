package appli.maven.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import appli.maven.model.Article;
import appli.maven.utils.*;

public class ArticleRepository {

	private EntityManager entityManager;
	
	//private EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Test");
	
	public ArticleRepository() {
		this.entityManager = HibernateUtil.createEntityManager();
	}
	
	/*
	  On appelle la méthode close pour fermer l'entity manager 
	  mais uniquement à la fin de l'application car c'est en mode "standalone"
	 */
	public void closeEntityManager() {
		entityManager.close();
	}
	

	public Long ajouter(Article article) {
		EntityTransaction transaction = this.entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(article);
		transaction.commit();
		return article.getIdArticle();
	}
	
	public Article modifierArticle(Article article) {
		EntityTransaction transaction = this.entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(article);
		transaction.commit();	
		return article;
	}
	
	public Optional<Article> rechercheParId(Long articleId) {
		// Recherche un article par l'id donné en entrée
		EntityTransaction transaction = this.entityManager.getTransaction();
		transaction.begin();
		Article article = entityManager.find(Article.class, articleId);
		transaction.commit();		
	    return Optional.ofNullable(article);
				
	}
	
	public void supprimerArticle(Long articleId) {
		// Supprime un article en base de données
		EntityTransaction transaction = this.entityManager.getTransaction();
		transaction.begin();
		Article articleR = entityManager.find(Article.class, articleId);
		entityManager.remove(articleR);
		transaction.commit();	
		
	}
	
	
}
