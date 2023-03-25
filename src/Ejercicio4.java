import java.io.*;

public class Ejercicio4 {
    public boolean saveData(Object object, String file, boolean bool) {
        FileOutputStream writer;
        ObjectOutputStream byteObject;
        try {
            writer = new FileOutputStream(file, bool);
            byteObject = new ObjectOutputStream(writer);
            byteObject.writeObject(object);
            byteObject.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
            return false;
        }
        return true;
    }
}
