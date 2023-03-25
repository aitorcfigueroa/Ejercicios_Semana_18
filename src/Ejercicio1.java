import java.io.*;

public class Ejercicio1 implements Serializable {
    public boolean saveData(String str, String file) {
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            writer.write(str);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
            return false;
        }
        return true;
    }
}
