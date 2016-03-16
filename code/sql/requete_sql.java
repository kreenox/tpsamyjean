import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class requete_sql {
	
	 public static void creationEntreprise(String siret,String nom, String adresse, String cp,String ville, String domaine,String email, String telephone)
	 {
	     try
	     {
	    String sql ="Insert into Entreprise(siret, nom, adresse,cp,ville,domaine,email,telephone) values ('"+siret+"','"+nom+"','"+adresse+"','"+cp+"','"+ville+"','"+domaine+"','"+email+"','"+telephone+"')"; 
	    Statement stmt;
	    stmt = connexion.getInstance().createStatement();
	    stmt.executeUpdate(sql);
	     }catch(Exception e)
	     {
	         JOptionPane.showMessageDialog(null,e);
	     }
	}
	  
	  public static void AjoutStage(String nom, String cp,String ville, String domaine,String email, String telephone, String siret)
	 {
	     try
	     {
	    String sql ="Insert into Entreprise(siret, nom, adresse,cp,ville,domaine,email,telephone) values ('"+nom+"','"+cp+"','"+ville+"','"+domaine+"','"+email+"','"+telephone+"','"+siret+"')"; 
	    Statement stmt;
	    stmt = connexion.getInstance().createStatement();
	    stmt.executeUpdate(sql);
	     }catch(Exception e)
	     {
	         JOptionPane.showMessageDialog(null,e);
	     }
	}
	  
	   public static void consultationStage(int idStage)
	 {
	     try
	     {
	    String sql ="select Entreprise.siret, Stage.ville, Stage.email, Stage.domaine, Stage.nom, Stage.date_debut, Stage.date_fin, Stage.description FROM Entreprise, Stage WHERE Stage.siret=Entreprise.siret and Stage.idStage = '"+idStage+"'"; 
	    Statement stmt;
	    stmt = connexion.getInstance().createStatement();
	    ResultSet rs = stmt.executeQuery(sql);
	    while (rs.next())
	    {
	    	System.out.println(rs.getString(0));
	    	
	    }
	     }catch(Exception e)
	     {
	         JOptionPane.showMessageDialog(null,e);
	     }
	}
	   
	    public static void listeStage(int idStage)
	 {
	     try
	     {
	    String sql ="select idStage, nom FROM Stage"; 
	    Statement stmt;
	    stmt = connexion.getInstance().createStatement();
	    ResultSet rs = stmt.executeQuery(sql);
	    while (rs.next())
	    {
	    	System.out.println(rs.getString(0));
	    	System.out.println(rs.getString(1));
	    }
	     }catch(Exception e)
	     {
	         JOptionPane.showMessageDialog(null,e);
	     }
	}
}
