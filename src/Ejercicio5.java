import java.io.*;
public class Ejercicio5 {
    public String objectReader(String file) {
        FileInputStream reader;
        ObjectInputStream objectReader;
        Object object;
        try {
            reader = new FileInputStream(file);
            objectReader = new ObjectInputStream(reader);
            object = objectReader.readObject();
            objectReader.close();
            reader.close();
        } catch (IOException | ClassNotFoundException ex) {
            object = ex.toString();
        }

        return object.toString();
    }
}
