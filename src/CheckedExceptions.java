import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("C:\\test\\test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader fileInput = new BufferedReader(file);
        for(int counter = 0; counter<3; counter++){
            System.out.println(fileInput.readLine());
        }
    }
}
