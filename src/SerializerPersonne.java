import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializerPersonne {
    public static void main(String[] args){
        Personne p = new Etudiant("jean","duPOnt",1,2541,"Bardo","hanniball",2000,4451,200);
        String filename ="p_ser.ser";
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(p);
            out.close();
            file.close();
            System.out.println("l'Object est serialized");




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
