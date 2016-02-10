import java.util.Date;



class Entreprise{

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
 
  
  String getSiret() {
	return siret;
}

void setSiret(String siret) {
	this.siret = siret;
}

String getNom() {
	return nom;
}

void setNom(String nom) {
	this.nom = nom;
}

String getAdresse() {
	return adresse;
}

void setAdresse(String adresse) {
	this.adresse = adresse;
}

int getCodePostal() {
	return codePostal;
}

void setCodePostal(int codePostal) {
	this.codePostal = codePostal;
}

String getVille() {
	return ville;
}

void setVille(String ville) {
	this.ville = ville;
}

String getDomaine() {
	return domaine;
}

void setDomaine(String domaine) {
	this.domaine = domaine;
}

String getTelephone() {
	return telephone;
}

void setTelephone(String telephone) {
	this.telephone = telephone;
}

String geteMail() {
	return eMail;
}

void seteMail(String eMail) {
	this.eMail = eMail;
}

/*action*/
  public void creerStage(String siret, String idStage, String titre, Date dateDebut,
			Date dateFin, String nomEntreprise, boolean remunererPossible,
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
