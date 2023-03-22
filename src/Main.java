public class Main {
    public static void main(String[] args) {
        Ejercicio1 test = new Ejercicio1();
        boolean resultado = test.saveData("Hola mundo", "fichero_de_almacenamiento.txt");
        System.out.println(resultado);
    }
}
