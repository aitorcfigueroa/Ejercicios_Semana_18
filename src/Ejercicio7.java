import java.io.*;
import java.util.ArrayList;

public class Ejercicio7 {
    public String objectReader(String file) {
        ArrayList<Object> objectArrayList = new ArrayList<>();
        FileInputStream reader;
        ObjectInputStream objectReader;
        Object object;
        try {
            reader = new FileInputStream(file);
            objectReader = new ObjectInputStream(reader);
            do {
                try {
                    object = objectReader.readObject();
                    objectArrayList.add(object);
                } catch (EOFException ex) {
                    object = null;
                }
            } while (object != null);
            objectReader.close();
            reader.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
            return ex.toString();
        }

        return objectArrayList.toString();
    }
}
