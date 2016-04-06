package model;


import java.util.Date;



public class Entreprise{

  private String siret;
  private String nom;
  private String adresse;
  private int codePostal;
  private String ville;
  private String domaine;
  private String telephone;
  private String eMail;
  
  /*constructeur*/
  public Entreprise(String siret, String nom, String adresse, int codePostal,
			String ville, String domaine, String telephone, String eMail) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.domaine = domaine;
		this.telephone = telephone;
		this.eMail = eMail;
	}
  
 public Entreprise(){
		this.siret = "";
		this.nom = "";
		this.adresse = "";
		this.codePostal = 0;
		this.ville = "";
		this.domaine = "";
		this.telephone = "";
		this.eMail = "";
 }

/*set et get*/
 
  
  public String getSiret() {
	return siret;
}

public void setSiret(String siret) {
	this.siret = siret;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public int getCodePostal() {
	return codePostal;
}

public void setCodePostal(int codePostal) {
	this.codePostal = codePostal;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getDomaine() {
	return domaine;
}

public void setDomaine(String domaine) {
	this.domaine = domaine;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public String geteMail() {
	return eMail;
}

public void seteMail(String eMail) {
	this.eMail = eMail;
}

/*action*/
  public void creerStage(String titre, Date dateDebut,
			Date dateFin, boolean remunererPossible,
			double paie){
	  
  }
  public void ModifierStage(Stage s){}
  public void RetirerStage(Stage s){}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Entreprise other = (Entreprise) obj;
	if (adresse == null) {
		if (other.adresse != null)
			return false;
	} else if (!adresse.equals(other.adresse))
		return false;
	if (codePostal != other.codePostal)
		return false;
	if (domaine == null) {
		if (other.domaine != null)
			return false;
	} else if (!domaine.equals(other.domaine))
		return false;
	if (eMail == null) {
		if (other.eMail != null)
			return false;
	} else if (!eMail.equals(other.eMail))
		return false;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (siret == null) {
		if (other.siret != null)
			return false;
	} else if (!siret.equals(other.siret))
		return false;
	if (telephone == null) {
		if (other.telephone != null)
			return false;
	} else if (!telephone.equals(other.telephone))
		return false;
	if (ville == null) {
		if (other.ville != null)
			return false;
	} else if (!ville.equals(other.ville))
		return false;
	return true;
}

}
