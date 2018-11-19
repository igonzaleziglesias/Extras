package extraordenador;

public class Cpu {

    private int nucleos = 0;
    private int ram = 0;

    //constructores
    public Cpu() {

    }

    public Cpu(int nucleos, int ram) {
        this.nucleos = nucleos;
        this.ram = ram;

    }

    //setters
    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //getters
    public int getNucleos() {
        return nucleos;
    }

    public int getRam() {
        return ram;
    }

}
