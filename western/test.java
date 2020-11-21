package western;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test {
    



    public static void main(String[]args) throws IOException {

        try {

            File f = new File("C:/Users/husso/Downloads/Cours/4ème année/Module/Semestre 1/Java/Projet_Munchkin/Projet_Java2/western/nomPersonnageFemme.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}

