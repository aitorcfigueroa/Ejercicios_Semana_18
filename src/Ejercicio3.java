import java.io.*;

public class Ejercicio3 {
    public boolean saveData(String str, String file, boolean bool) {
        FileWriter writer;
        try {
            writer = new FileWriter(file, bool);
            writer.write(str);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
            return false;
        }
        return true;
    }
}
