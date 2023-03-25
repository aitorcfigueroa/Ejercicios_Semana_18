import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ejercicio1 test1 = new Ejercicio1();
        boolean resultado1 = test1.saveData("Hola mundo!", "fichero_de_almacenamiento.txt");
        System.out.println(resultado1);

        Ejercicio2 test2 = new Ejercicio2();
        String resultado2 = test2.fileReader("fichero_de_almacenamiento.txt");
        System.out.println(resultado2);

        Ejercicio3 test3 = new Ejercicio3();
        boolean resultado3 = test3.saveData("\nEsta es otra línea.", "fichero_de_almacenamiento.txt", true);
        System.out.println(resultado3);

        Ejercicio4 test4 = new Ejercicio4();
        Coche coche = new Coche(6, "0000DKZ", 120);
        boolean resultado4 = test4.saveData(coche, "fichero_de_bytes.txt", false);
        System.out.println(resultado4);

        Ejercicio5 test5 = new Ejercicio5();
        String resultado5 = test5.objectReader("fichero_de_bytes.txt");
        System.out.println(resultado5);

        Ejercicio6 test6 = new Ejercicio6();
        ArrayList<Object> coches = new ArrayList<>();
        coches.add(new Coche(6, "0000DKZ", 120));
        coches.add(new Coche(5, "1111AAA", 120));
        coches.add(new Coche(4, "2222BBB", 120));
        String Ejercicio6 = test6.objectWriter(coches, "fichero_de_bytes.txt", false);
        System.out.println(Ejercicio6);

        Ejercicio7 test7 = new Ejercicio7();
        String resultado7 = test7.objectReader("fichero_de_bytes.txt");
        System.out.println(resultado7);
    }
}
