package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Personne;

/**
 * Servlet implementation class AjoutPersonneServlet
 */
@WebServlet(name = "ajoutPersonne", urlPatterns = {"/ajoutPersonne"})
public class AjoutPersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public AjoutPersonneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutPersonne.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		Personne personne = new Personne(nom,prenom);
	//	PersonneDaoImpl daop = new PersonneDaoImpl();
	//	Personne insertedPersonne = daop.save(personne);
		request.setAttribute("personne", personne);
		this.getServletContext().getRequestDispatcher("/WEB-INF/confirmation.jsp").forward(request, response);
		
		
		
	}

}
