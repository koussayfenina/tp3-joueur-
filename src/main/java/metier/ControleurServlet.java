package metier;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Joueur;
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
	private ImetierCatalogue metier;
@Override
public void init() throws ServletException {
	metier=new MetierImpl();
}
@Override
protected void doPost(HttpServletRequest request,
HttpServletResponse response)throws ServletException, IOException {
	String mc=request.getParameter("motCle");
	JoueurModele mod = new JoueurModele();
	mod.setMotCle(mc);
	List<Joueur> prods = metier.getJoueurParMotCle(mc);
	mod.setJoueurs(prods);
	request.setAttribute("modele", mod);
	request.getRequestDispatcher("JoueursView.jsp").forward(request,response);
	}
}

