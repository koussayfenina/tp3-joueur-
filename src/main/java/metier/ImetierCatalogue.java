package metier;

import java.util.List;
public interface ImetierCatalogue {
	public List<Joueur> getJoueurParMotCle(String mc);
	public void addJoueur(Joueur p);
}
