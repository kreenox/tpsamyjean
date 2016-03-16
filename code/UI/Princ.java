package UI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Princ extends JFrame
{
	
	private JButton entre = new JButton("Gestion entreprise");//permet de gerer les entreprise
	private JButton consult = new JButton("consulter\nles offres de stage");//permet de voir les offres
	private JButton anule = new JButton("quitter");//quitte l'application
	private JPanel pane;
	private JLabel text = new JLabel("Gestion des offres de stage\nUniversite d'Evry Val d'Essone");
	private JTextField entrepriseUser = new JTextField("Identification siret", 14); //si il veut creer une nouvelle entreprise : mettre un 0
	private JLabel conseil = new JLabel("Pour créer une nouvelle entreprise : mettez 0");
	public Princ(ActionListener a)
	{
		
		this.setTitle("GestStage - menu principal");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//si on veut pas utiliser l'application on arrete tout
		//debut de l'affichage
		//
		//	TITRE
		//      
		//	gestion entreprise		consultation des stages
		//	siretidentification
		// 	conseil
		//				quitter l'application
		//


		//gestion des panels
		pane = new JPanel();
		this.getContentPane().add(pane);
		JPanel horizon = new JPanel();//panel horizontal pour les boutons entre et consult
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
	
		JPanel pane2 = new JPanel();
		pane2.setLayout( new BoxLayout(pane2, BoxLayout.PAGE_AXIS));
		pane2.add(entre);
		pane2.add(entrepriseUser);
		pane2.add(conseil);

		//assemblage
		horizon.add(pane2);
		horizon.add(consult);
		pane.add(text);
		pane.add(horizon);
		pane.add(anule);
		entre.addActionListener(a);
		entre.setActionCommand("entre - princ");
		consult.addActionListener(a);
		consult.setActionCommand("consult - princ");
		anule.addActionListener(a);
		anule.setActionCommand("anule - princ");
		//affichage
		this.setVisible(true);
	}
 //metttre get quelquechose 
	public String getEntrepriseUser(){ return entrepriseUser.getText();}

}
