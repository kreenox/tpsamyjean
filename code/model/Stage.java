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
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getIdStage() {
		return idStage;
	}
	public void setIdStage(String idStage) {
		this.idStage = idStage;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public boolean isRemunererPossible() {
		return remunererPossible;
	}
	public void setRemunererPossible(boolean remunererPossible) {
		this.remunererPossible = remunererPossible;
	}
	public double getPaie() {
		return paie;
	}
	public void setPaie(double paie) {
		this.paie = paie;
	}
	public String getDescriptif(){
		return descriptif;
	}
	public void setDescriptif(String descriptif){
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

