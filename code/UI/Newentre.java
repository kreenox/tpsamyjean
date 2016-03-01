
import javax.swing.*;

package UI;

class newentre extends JFrame
{
	//base de la fenetre
	private JButton val = new JButton("valider");
	private Jbutton anule = new JButton("annuler");
	private JPanel pane;
	private Jlabel = new JLabel("Veuillez entrer les donnés de l'entreprise");
	//formulaire de création d'entreprise
	//forme label/zone de texte
	//siret
	private JLabel labsir = new JLabel("SIRET");
	private JTextField textsir = new JTextField(14);
	//raison sociale
	private JLabel labrais = new JLabel("Raison sociale");
	private JTextField textrais = new JTextField();
	//adresse
	private JLabel labadr = new JLabel("Adresse");
	private JTextField textadr = new JTextField();
	//code postal
	private JLabel labcode = new JLabel("Code postal");
	private JTextField textcode = new JTextField();//voir si il n'y as pas un meilleur widget
	//ville
	private JLabel labvill = new JLabel("Ville");
	private JTextField textvill = new JTextField();
	//domaine de production
	private JLabel labdom = new JLabel("Domaine");
	private JTextField textdom = new JTextField();
	//email
	private JLabel labemai = new JLabel("eMail");
	private JTextField textemai = new JTextField();
	//telephone
	private JLabel labtel = new JLabel("N° de telephone");
	private JTextField texttel = new JTextField();
	//fin du formulaire

	public Newentre()
	{
		this.setTitle("GestStage - Nouvelle entreprise");
		this set size(640, 480);

	}

}
