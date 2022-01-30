package appli.maven.main;

import java.util.Date;
import java.util.Optional;

import javax.persistence.EntityManager;

import appli.maven.dao.ArticleRepository;
import appli.maven.model.Article;
import appli.maven.utils.HibernateUtil;

public class LanceurMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager entityManager = HibernateUtil.createEntityManager();
		ArticleRepository ar = new ArticleRepository();
		
		//TEster CRUD ici
		Article articleTest = new Article();
		ar.ajouter(articleTest);
		
		ar.ajouter(new Article("écran pc", "écran 24 pouces","écran FHD 144hz 2ms", true, 4, new Date(2019, 10, 25), 199.99F, Article.Categorie.JEUX));
		
		Optional<Article> optionalArticle = ar.rechercheParId(1L);
		
		if (optionalArticle.isPresent())
		{
			Article articleToModif = optionalArticle.get();
			articleToModif.setPrixUnitaire(149.99F);
			ar.modifierArticle(articleToModif);
		}
		
		ar.supprimerArticle(articleTest.getIdArticle());
		
		
		
		entityManager.close();
		
		//Faire uniquement en mode test
		
		System.exit(0);
	}

}
