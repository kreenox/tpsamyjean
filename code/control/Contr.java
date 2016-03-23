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
	GestEntre	fengestentre;
	GestStage	fengeststage;
	

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
			fenprinc.setVisible(false); //penser à corriger
			fengestentre.setVisible(true);
			break;
		case "consult - princ":
			fenprinc.setVisible(false);
			fengeststage.setVisible(true);
			break;
		case "anule - princ":
			System.exit(0);
			break;
		//gestentre
		case "gestentre - retour":
			fengestentre.setVisible(false);
			fenprinc.setVisible(true);
			break;
		case "gestentre - modifier":
			break;
		case "gestentre - ajouter":
			break;
		case "gestentre - supprimer":
			break;
		//geststage
		case "geststage - retour":
			fengeststage.setVisible(false);
			fenprinc.setVisible(true);
			break;
		case "geststage - valider":
			break;
		default:
			break;

		}
	}

	public void setfen(Princ fen, ConsultStage cnsstg, Newstage nwstg, Newentre nwntr, GestStage nwgsst, GestEntre nwgsnt)
	{
		fenprinc = fen;
		fenconsult = cnsstg;
		fennouvstage = nwstg;
		fennouventre = nwntr;
		fengestentre = nwgsnt;
		fengeststage = nwgsst;
	}



}
