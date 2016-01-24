 
class Adresse{
  
  public int numero;
  public String rue;
  public int code;
  public String Ville;
  
  /*constructeurs*/
  public Adresse()
  {
    numero = 0;
    rue = new String("");
    code = 0;
    ville = new String("");
  }
  
  public Adresse(int num, String rue, int codePostal, String ville)
  {
    numero = num;
    this.rue = new String(rue);
    code = codePostal;
    this.ville = new String(ville);
  }
  /*set get*/
  public void setNumero(int val)
  {numero = val;}
  public void setCode(int val)
  {code = val;}
  public void setRue(String val)
  {rue = new String(val);}
  public void setVille(String val)
  {ville = new String(val);}
  
  public int getNumero()
  {return numero;}
  public int getCode()
  {return code;}
  public String getRue()
  {return new String(rue);}
  public String getVille()
  {return new String(ville);}
  
  public String toString()
  {
    return  "" + numero + rue + code + ville;
  }
}