import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            Copier copier = new Copier();
            copier.copyImage(copier.readImage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}