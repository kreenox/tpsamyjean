
package UI;
import javax.swing.*;


public class Newentre extends JFrame
{
	//base de la fenetre
	private JButton val = new JButton("valider");
	private JButton anule = new JButton("annuler");
	private JPanel pane;
	private JLabel text = new JLabel("Veuillez entrer les donnés de l'entreprise");
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
		//mise en place de la fentre
		this.setTitle("GestStage - Nouvelle entreprise");
		this.setSize(640, 480);
		//gestion des panels et mise en place des composants
		pane = new JPanel();
		this.getContentPane().add(pane);
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		//ajout des elements de presentation
		pane.add(text);
		//ajout du siret
		JPanel horizon = new JPanel();//panels horizontaux pour les composantsant du formulaire
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labsir);
		horizon.add(textsir);
		pane.add(horizon);
		//ajout de la raison sociale
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labrais);
		horizon.add(textrais);
		pane.add(horizon);
		//ajout de l'adresse
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labadr);
		horizon.add(textadr);
		pane.add(horizon);
		//ajout du code postal
		//a  voir avec l'eventuelle remplacement du composant
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labcode);
		horizon.add(textcode);
		pane.add(horizon);
		//ajout de la ville
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labvill);
		horizon.add(textvill);
		pane.add(horizon);
		//ajout du domaine
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labdom);
		horizon.add(textdom);
		pane.add(horizon);
		//ajout de l'email
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labemai);
		horizon.add(textemai);
		pane.add(horizon);
		//ajout du telehpone
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labtel);
		horizon.add(texttel);
		pane.add(horizon);
		//ajout des bouton ok annule
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(val);
		horizon.add(anule);
		pane.add(horizon);
		//affichage de la fenetre
		this.setVisible(true);
	}

}
