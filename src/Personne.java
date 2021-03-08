public class Personne implements java.io.Serializable {
    private String nom = "";
    transient private String prenom = "";
    transient private int taille = 0;
    public Adresse ad;
    public CompteBancaire CB;
    public Personne(String nom, String prenom, int taille,String ville,String rue,int n,int numcompte,int montant)
    { this.nom = nom;
    this.taille = taille;
    this.prenom = prenom;
    ad= new Adresse(ville,rue,n);
    CB=new CompteBancaire(numcompte,montant);}
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public int getTaille() { return taille; }
    public void setTaille(int taille) { this.taille = taille; }
    public String getPrenom()   { return prenom; }
    public void setPrenom(String prenom) { this.prenom =
            prenom; }
}