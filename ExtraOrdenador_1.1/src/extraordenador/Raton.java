package extraordenador;

public class Raton {

    private boolean inhalambrico = false;
    private String modelo = " ";

    //constructores
    public Raton() {

    }

    public Raton(boolean inhalambrico, String modelo) {
        this.inhalambrico = inhalambrico;
        this.modelo = modelo;
    }

    //setters
    public void setInhalambrico(boolean inhalambrico) {
        this.inhalambrico = inhalambrico;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //getters
    public boolean getInhalambrico() {
        return inhalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Raton{" + "inhalambrico=" + inhalambrico + ", modelo=" + modelo + '}';
    }
}
