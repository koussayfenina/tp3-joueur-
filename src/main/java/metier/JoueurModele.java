package metier;

import java.util.ArrayList;
import java.util.List;

public class JoueurModele {
    private String motCle;
    private List<Joueur> joueurs = new ArrayList<>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
}
