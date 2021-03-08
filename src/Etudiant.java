import java.io.Serializable;

public class Etudiant extends Personne implements Serializable {
    public int numinscrit;
  public Etudiant(String n,String P,int t,int num,String v,String r,int nu,int numcompte,int montant){
      super(n,P,t,v,r,nu,numcompte,montant);
      numinscrit=num;
  }

}
