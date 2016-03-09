/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author thomasdrege
 */
public class Mysql {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ConnectDB*/
        ConnectDB();
    }
    
     public static Connection ConnectDB()
            {
               try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection conn;
                   conn = DriverManager.getConnection("jdbc:mysql://mysql1.alwaysdata.com:3306/thomasdregepf_projetstage?user=107963&password=toto");
                    JOptionPane.showMessageDialog(null, "c'est ok");
                   return conn;
               } catch(ClassNotFoundException | SQLException | HeadlessException e)
                    {
                      JOptionPane.showMessageDialog(null, "Problème de connexion du : "+e);
                 
                      return null;
                    }
            
            }
     
     
  public static void creationEntreprise(String siret,String nom, String adresse, String cp,String ville, String domaine,String email, String telephone)
 {
     try
     {
    String sql ="Insert into Entreprise(siret, nom, adresse,cp,ville,domaine,email,telephone) values ('"+siret+"','"+nom+"','"+adresse+"','"+cp+"','"+ville+"','"+domaine+"','"+email+"','"+telephone+"')"; 
    Statement stmt;
    stmt = ConnectDB().createStatement();
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
    stmt = ConnectDB().createStatement();
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
    stmt = ConnectDB().createStatement();
    stmt.executeUpdate(sql);
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
    stmt = ConnectDB().createStatement();
    stmt.executeUpdate(sql);
     }catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
}

}
