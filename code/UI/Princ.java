package UI;

import javax.swing.*;

public class Princ extends JFrame
{

	private JButton entre = new JButton("Gestion entreprise");//permet de gerer les entreprise
	private JButton consult = new JButton("consulter\nles offres de stage");//permet de voir les offres
	private JButton anule = new JButton("quitter");//quitte l'application
	private JPanel pane;
	private JLabel text = new JLabel("Gestion des offres de stage\nUniversite d'Evry Val d'Essone");
	//private JTextField VOID; juste pou plus tard aucun interet
	public Princ()
	{
		this.setTitle("GestStage - menu principal");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//si on veut pas utiliser l'application on arrete tout
		//debut de l'affichage
		//
		//	TITRE
		//
		//	gestion entreprise		consultation des stages
		//				quitter l'application
		//

		//gestion des panels
		pane = new JPanel();
		this.getContentPane().add(pane);
		JPanel horizon = new JPanel();//panel horizontal pour les boutons entre et consult
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));

		//assemblage
		horizon.add(entre);
		horizon.add(consult);
		pane.add(text);
		pane.add(horizon);
		pane.add(anule);
		//affichage
		this.setVisible(true);
	}

}