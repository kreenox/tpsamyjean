

package UI;

import contr.*;
import javax.swing.*;

public class GestEntre extends JFrame
{

	private JButton ret = new JButton("Retour");
	private JButton modif = new JButton("modifier");
	private JButton ajout = new JButton("creer");
	private JButton supp = new JButton("supprimer");
	private JList liste;
	private JPanel pane = new JPanel();

	public GestEntre()
	{
		this.setSize(600, 400);
		this.setDefaultCloseOperation(CLOSE_ON_EXIT);
		this.setTitle("GestStage - Espace entreprise");

		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		pane.add(new JLabel("Gestion des Stages"));
		pane.add(liste);
		
		JPanel horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, LINE_AXIS));
		horizon.add(ret);
		horizon.add(ajout);
		horizon.add(modif);
		horizon.add(supp);

		pane.add(horizon);
		this.setContentPane(pane);
		//ajout des commandes de boutons
		ret.setActionCommand("gestentre - retour");
		modif.setActionCommand("gestentre - modifier");
		ajout.setActionCommand("gestentre - ajouter");
		supp.setActionCommand("gestentre - supprimer");
	}

}
