package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
@Override
public List<Joueur> getJoueurParMotCle(String mc) {
List<Joueur> prods= new ArrayList<Joueur>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from joueurs where NOM_joueur LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
	Joueur p = new Joueur();
	p.setIdJoueur(rs.getLong("ID_joueur"));
	p.setNomJoueur(rs.getString("NOM_joueur"));
	p.setPrix(rs.getDouble("PRIX"));
	prods.add(p);
}
} catch (SQLException e) {
	e.printStackTrace();
}
return prods;
}

@Override
public void addJoueur(Joueur p) {
	// TODO Auto-generated method stub
	
}
}
