package control;

import UI.*;
import model.*;
import javax.swing.*;
import java.awt.event.*;

public class Contr implements ActionListener{

	Princ		fenprinc;
	ConsultStage	fenconsult;
	Newstage	fennouvstage;
	Newentre	fennouventre;
	

	public Contr()
	{
	}

	public void actionPerformed(ActionEvent e)
	{
		switch(e.getActionCommand())
		{
		//newentre button
		case "valide - newentre":
			break;
		case "annule - newentre":
			fennouventre.setVisible(false);
			fenprinc.setVisible(true);
			break;
		//newstage
		case "val - newstage":
			break;
		case "annule - newstage":
			fennouvstage.setVisible(false);
			fenprinc.setVisible(true);
			break;
		//consultstage
		case "retour":
			fenconsult.setVisible(false);
			fenprinc.setVisible(true);
			break;
		//princ
		case "entre - princ":
			fenprinc.setVisible(false);
			if(fenprinc.getEntrepriseUser().isEmpty())
				fennouventre.setVisible(true);
			else fennouvstage.setVisible(true);

			break;
		case "consult - princ":
			fenprinc.setVisible(false);
			fenconsult.setVisible(true);
			break;
		case "anule - princ":
			System.exit(0);
			break;
		default:
			break;

		}
	}

	public void setfen(Princ fen, ConsultStage cnsstg, Newstage nwstg, Newentre nwntr)
	{
		fenprinc = fen;
		fenconsult = cnsstg;
		fennouvstage = nwstg;
		fennouventre = nwntr;
	}



}
