import java.io.*;

public class Ejercicio6 {
    public String objectWriter(Object[] objectList, String file, boolean bool) {
        FileOutputStream writer;
        ObjectOutputStream byteObject;

        try {
            writer = new FileOutputStream(file, bool);
            byteObject = new ObjectOutputStream(writer);
            byteObject.writeObject(objectList);
            byteObject.close();
            writer.close();
        } catch (IOException ex) {
            return ex.toString();
        }

        return "Object save";
    }
}
