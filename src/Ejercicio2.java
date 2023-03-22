import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public String fileReader(String file) {
        FileReader reader;
        String result = "";
        try {
            reader = new FileReader(file);
            int caracter = reader.read();
            while (caracter != -1) {
                result += (char) caracter;
                caracter = reader.read();
            }
            reader.close();
        } catch (IOException ex) {
            result = ex.toString();
        }
        return result;
    }
}
