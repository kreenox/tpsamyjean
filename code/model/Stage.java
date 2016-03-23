package model;

import java.util.Date;

public class Stage {


	/*Attributs*/
	private String siret;
	private String idStage;
	private String titre;
	private Date dateDebut;
	private Date dateFin;
	private String nomEntreprise;
	private boolean remunererPossible;
	private double paie; //l'argent obtenu par jour
	private String descriptif;

	/*constructeur*/
	public Stage(String siret, String idStage, String titre, Date dateDebut,
			Date dateFin, String nomEntreprise, boolean remunererPossible,
			double paie, String descriptif) {
		this.siret = siret;
		this.idStage = idStage;
		this.titre = titre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nomEntreprise = nomEntreprise;
		this.remunererPossible = remunererPossible;
		this.paie = paie;
		this.descriptif=descriptif;
	}
	public Stage() {
		this.siret = "";
		this.idStage = "";
		this.titre = "";
		this.dateDebut = null;
		this.dateFin = null;
		this.nomEntreprise = "";
		this.remunererPossible = false;
		this.paie = 0.;
		this.descriptif="";
	}

	/*get et set*/
	String getSiret() {
		return siret;
	}
	void setSiret(String siret) {
		this.siret = siret;
	}
	String getIdStage() {
		return idStage;
	}
	void setIdStage(String idStage) {
		this.idStage = idStage;
	}
	String getTitre() {
		return titre;
	}
	void setTitre(String titre) {
		this.titre = titre;
	}
	Date getDateDebut() {
		return dateDebut;
	}
	void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	Date getDateFin() {
		return dateFin;
	}
	void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	String getNomEntreprise() {
		return nomEntreprise;
	}
	void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	boolean isRemunererPossible() {
		return remunererPossible;
	}
	void setRemunererPossible(boolean remunererPossible) {
		this.remunererPossible = remunererPossible;
	}
	double getPaie() {
		return paie;
	}
	void setPaie(double paie) {
		this.paie = paie;
	}
	String getDescriptif(){
		return descriptif;
	}
	void setDescriptif(String descriptif){
		this.descriptif=descriptif;
	}
	/*Methode*/
	public double CalculerRémuneration(Date dd, Date df){
		if(remunererPossible== false)
			return 0.;
		else
			return df.getTime()-dd.getTime();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stage other = (Stage) obj;
		if (dateDebut == null) {
			if (other.dateDebut != null)
				return false;
		} else if (!dateDebut.equals(other.dateDebut))
			return false;
		if (dateFin == null) {
			if (other.dateFin != null)
				return false;
		} else if (!dateFin.equals(other.dateFin))
			return false;
		if (descriptif == null) {
			if (other.descriptif != null)
				return false;
		} else if (!descriptif.equals(other.descriptif))
			return false;
		if (idStage == null) {
			if (other.idStage != null)
				return false;
		} else if (!idStage.equals(other.idStage))
			return false;
		if (nomEntreprise == null) {
			if (other.nomEntreprise != null)
				return false;
		} else if (!nomEntreprise.equals(other.nomEntreprise))
			return false;
		if (Double.doubleToLongBits(paie) != Double
				.doubleToLongBits(other.paie))
			return false;
		if (remunererPossible != other.remunererPossible)
			return false;
		if (siret == null) {
			if (other.siret != null)
				return false;
		} else if (!siret.equals(other.siret))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}


}

