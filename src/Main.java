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
    }
}
