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
			if(fenprinc.getEntrepriseUser() == "0")
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
