package UI;
import javax.swing.*;

//Merci Kreenox pour le DVD

public class Newstage extends JFrame
{
	//base de la fenetre
	private JButton val = new JButton("valider");
	private JButton anule = new JButton("annuler");
	private JPanel pane;
	private JLabel text = new JLabel("Veuillez entrer les donnés du stage");
	//formulaire de création d'entreprise
	//forme label/zone de texte
	//siret
	private JLabel labsir = new JLabel("SIRET");
	private JTextField textsir = new JTextField(14);
	//nom de l'offre
	private JLabel laboff = new JLabel("Nom de l'offre");
	private JTextField textoff = new JTextField();
	//nom de l'entreprise
	private JLabel labent = new JLabel("Nom de l'entreprise");
	private JTextField textent = new JTextField();
	//date de début
	private JLabel labdebu = new JLabel("Date de début");
	private JTextField textdebu = new JTextField();// trouvé autre chose
	//date de fin
	private JLabel labfin = new JLabel("Date de fin");
	private JTextField textfin = new JTextField();//ouais, autre chose
	//remunération possible?
	private JLabel labrem = new JLabel("Rémunération");
	JRadioButton radio1 = new JRadioButton("Oui", true);
	JRadioButton radio2 = new JRadioButton("Non");
	ButtonGroup group = new ButtonGroup();
	//paie
	private JLabel labpaie = new JLabel("Salaire journalier");
	private JTextField textpaie = new JTextField();
	//fin du formulaire

	public Newstage(ActionListener a)
	{
		//mise en place de la fentre
		this.setTitle("GestStage - Nouveau Stage");
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
		//ajout du nom de l'offre
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(laboff);
		horizon.add(textoff);
		pane.add(horizon);
		//ajout du nom de l'entreprise
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labent);
		horizon.add(textent);
		pane.add(horizon);
		//ajout de la date de début
		//a  voir avec l'eventuelle remplacement du composant
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labdebu);
		horizon.add(textdebu);
		pane.add(horizon);
		//ajout de la date de fin
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labfin);
		horizon.add(textfin);
		pane.add(horizon);
		//ajout de la rémunération RadioButton
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labrem);
		horizon.add(radio1);
		horizon.add(radio2);
		group.add(radio1);
		group.add(radio2);
		pane.add(horizon);
		//ajout de la paie
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(labpaie);
		horizon.add(textpaie);
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

	//get des zones de text

	public String getSIRET()
	{return textsir.getText();}
	public String getOffre()
	{return textoff.getText();}
	public String getNom()
	{return textent.getText();}
	public String getDateDebut()
	{return textdebu.getText();}
	public String getDateFin()
	{return textfin.getText();}
	public boolean isPaid()
	{
		if(radio1.isSelected())
			return true;
		else return false;
	}
	public String getPaie()
	{
		if(ispaid())
			return textsir.getText();
		else return null;
	}
}
