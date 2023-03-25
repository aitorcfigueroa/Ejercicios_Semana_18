import java.io.Serializable;

public class Coche implements Serializable {
    private int marchas = 5;
    private String matrícula;
    private int potencia;

    public Coche() {

    }

    public Coche(int marchas, String matrícula, int potencia) {
        this.marchas = marchas;
        this.matrícula = matrícula;
        this.potencia = potencia;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marchas=" + marchas +
                ", matrícula='" + matrícula + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
