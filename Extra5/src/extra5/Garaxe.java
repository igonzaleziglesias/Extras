package extra5;

public class Garaxe {

    public static int numeroCoches = 0;
    private String matricula = "0000AAA";
    private String marca = "SIN MARCA";
    private int num = 0;

    public boolean aparcar() {
        if ((numeroCoches < 3) && (numeroCoches >= 0)) {
            System.out.print("\nPLAZAS DISPONIBLES");
            return true;
        } else {
            System.out.println("\nCOMPLETO");
            return false;
 
        }
    }

    public Garaxe() {
        if (aparcar() == true) {
            num = ++numeroCoches;
        }

    }

    public Garaxe(String matricula, String marca) {
        if (aparcar() == true) {
            this.matricula = matricula;
            this.marca = marca;
            num = ++numeroCoches;
        }
    }

    //setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //getters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void verCoche() {
        System.out.println("\nMatricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("numero: " + num);
     
    }

}
