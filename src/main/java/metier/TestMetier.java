package metier;

import java.util.List;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Joueur> prods = metier.getJoueurParMotCle("messi");
for (Joueur p : prods)
	System.out.println(p.getNomJoueur());
}
}
