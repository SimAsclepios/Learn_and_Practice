package appli.maven.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("applimaven");
	}
	
	public static EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}

/**
 * Classe utilitaire qui permet d'initialiser Hibernate et la
 * {@link SessionFactory}.<br>
 * C'est une classe d'aide qui facilite l'utilisation de Hibernate.<br>
 * Ce n'est pas utilisable en l'état pour un vrai projet mais pour faire des
 * exemples rapides ça fait l'affaire.
 * 
 */