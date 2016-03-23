
package UI;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class GestStage extends JFrame
{
	
	private JButton ret = new JButton("retour");
	private JButton val = new JButton("voir");
	private JList entre;
	private JList stage;
	private JPanel pane = new JPanel();
	private JComboBox dom;

	public GestStage()
	{

		/*temporaire v*/
		entre = new JList();
		stage = new JList();
		dom = new JComboBox();
		/*don't forget ^*/

		this.setTitle("GestStage - consultation des stage");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//montage des elements
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		pane.add(new JLabel("Consultation des stages"));
		//panel horizontal
		JPanel horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(dom);
		horizon.add(entre);
		horizon.add(stage);
		//ajout du panel horizontal
		pane.add(horizon);
		//nouveau panel horizontal
		horizon = new JPanel();
		horizon.setLayout(new BoxLayout(horizon, BoxLayout.LINE_AXIS));
		horizon.add(ret);
		horizon.add(val);
		pane.add(horizon);
		this.setContentPane(pane);


		ret.setActionCommand("geststage - retour");
		val.setActionCommand("geststage - valider");
		

	}




	public void setListeners(ActionListener a){
		val.addActionListener(a);
		ret.addActionListener(a);
	}

}
