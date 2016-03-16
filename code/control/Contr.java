package controle;

import UI.*;
import model.*;
import javax.swing.*;

public class Contr implements ActionListener{

	Princ		fenprinc;
	ConsultStage	fenconsult;
	Newstage	fennouvstage;
	NewEntre	fennouventre;
	

	public Contr(Princ fen, ConsultStage cnsstg, NewStage nwstg, NewEntre nwntr)
	{
		fenprinc = fen;
		fenconsult = cnsstg;
		fennouvstage = nwstg;
		fennouventre = nwntr;
	}

	public void actionPerformed(ActionEvent e)
	{
		switch(e.getActionCommand())
		{
		//newentre button
		case "valide - newentre":
			break;
		case "annule - newentre":
			break;
		//newstage
		case "val - newstage":
			break;
		case "annule - newstage":
			break;
		//consultstage
		case "retour":
			break;
		//princ
		case "entre - princ":
			fenprinc.setVisible(false);
			if(fenprinc.getEntrepriseUser() == "0";
				fennouventre.setVisible(true);
			else fennouvstage.setvisible(true);

			break;
		case "consult - princ":
			fenprinc.setVisible(false);
			fenconsult.setvisible(true);
			break;
		case "anule - princ":
			System.exit(0);
			break;
		default:
			break;

		}
	}


}
