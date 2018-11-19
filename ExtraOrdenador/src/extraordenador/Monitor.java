package extraordenador;

public class Monitor {

    private String marca = " ";
    private float pulgadas = 0.0f;

    //constructores
    public Monitor() {

    }

    public Monitor(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    //getters
    public String getMarca() {
        return marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

}
