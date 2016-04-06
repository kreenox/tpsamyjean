package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connexion {


	  private static Connection connect;

	  //Constructeur privé

	  private connexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
	  
	    connect = DriverManager.getConnection("jdbc:mysql://mysql1.alwaysdata.com:3306/thomasdregepf_projetstage?user=107963&password=toto");

	    } catch (SQLException e) {

	      e.printStackTrace();

	    }

	  }

	   

	  //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas

	   public static Connection getInstance(){

	    if(connect == null){
	      new connexion();
	      System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
	    }
	    else{
	      System.out.println("CONNEXION SQL EXISTANTE ! ");
	    }
	    return connect;
	  }   
}
