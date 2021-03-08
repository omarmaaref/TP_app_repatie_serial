import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializerPersonne {
    public static void main(String[] args) {

        try {
            String filename ="p_ser.ser";
            Etudiant p=null;
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            p = (Etudiant) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("nom est " + p.getNom());
            System.out.println("prenom est " + p.getPrenom());
            System.out.println("taille est " + p.getTaille());
            System.out.println("numinscrit est :"+p.numinscrit);
            p.ad.affiche();
            System.out.println("le numero de compte "+p.CB.NumCompte);
            System.out.println("Montant est :"+p.CB.Montant);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
