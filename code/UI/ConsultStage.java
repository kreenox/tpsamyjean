

package UI;

import javax.swing.*;

public class ConsultStage extends JFrame{

	private JLabel text = new JLabel("Consultation des stages");
	private JLabel inti = new JLabel("Intitule : ");
	private JLabel inticont = new JLabel("");
	private JLabel code = new JLabel("code postal :");
	private JLabel codecont = new JLabel("");
	private JLabel ville = new JLabel("ville : ");
	private JLabel villecont = new JLabel("");
	private JLabel dom = new JLabel("domaine : ");
	private JLabel domcont = new JLabel("");
	private JLabel email = new JLabel("email : ");
	private JLabel emailcont = new JLabel("");
	private JLabel tel = new JLabel("telephone : ");
	private JLabel telcont = new JLabel("");
	//bouton retour
	private JBouton ret = new JBouton("retour");
	private JPanel pane = new JPanel();


	public ConsultStage(ActionListener A){
		
		this.setSize(600, 400);
		this.setTitle("GestStage - consultation d'offre");

		//debut de l'affichage
		pane.setContentPane(pane);
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		pane.add(text);
		//ajout des elements du stage
		//intitule du stage
		JPanel horizon = new JPanel();//panels horizontaux pour les composant horizontaux
		horizon.setLayout(nex BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(inti);
		horizon.add(inticont);
		pane.add(horizon);
		//code postal
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(code);
		horizon.add(codecont);
		pane.add(horizon);
		//ville
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(ville);
		horizon.add(villecont);
		pane.add(horizon);
		//domaine
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(dom);
		horizon.add(domcont);
		pane.add(horizon);
		//email
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(email);
		horizon.add(emailcont);
		pane.add(horizon);
		//telephone
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(tel);
		horizon.add(telcont);
		pane.add(horizon);
		//affichage
		this setVisible(true);
		//actions
		ret.addActionListener(A);
		ret.addActionCommand("retour - consultstage");

	}

	//set des elements de la fenetre
	public void setIntitule(String s)
	{inticont.setText(s);}
	public void setCode(String s)
	{codecont.setText(s);}
	public void setVille(String s)
	{villecont.setText(s);}
	public void setDomaine(String s)
	{domcont.setText(s);}
	public void setEmail(String s)
	{emailcont.setText(s)}
	public void setTelephone(String s)
	{telcont.setText(s);}


}
