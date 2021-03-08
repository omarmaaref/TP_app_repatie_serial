public class Adresse implements java.io.Serializable{
String ville,rue;
int num;
Adresse(String v,String r,int n){
    ville=v;
    num=n;
    rue=r;
}
public void affiche(){
    System.out.println(num+" Rue "+rue+","+ville);
}
}
