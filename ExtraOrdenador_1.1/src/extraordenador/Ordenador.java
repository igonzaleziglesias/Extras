package extraordenador;
import PedirDatos.pedir;
import javax.swing.JOptionPane;

public class Ordenador {

    private Cpu procesador = new Cpu();
    private Raton unRaton = new Raton();
    private Teclado unTeclado = new Teclado();
    private Monitor pantalla = new Monitor();

    public void pedirDatos() {
        
        procesador.setNucleos(pedir.pedirInt("Numero de nucleos de la CPU: "));
        procesador.setRam(pedir.pedirInt("Memoria RAM de la CPU: "));

        String[] opciones = {"true", "false"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "Raton Inhalambrico",
                null,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                null
        );

        switch (opcion) {
            case 0:
                unRaton.setInhalambrico(true);
                break;
            case 1:
                unRaton.setInhalambrico(false);
                break;

        }

        unRaton.setModelo(JOptionPane.showInputDialog("Indicar modelo del raton: "));
        unTeclado.setNumTeclas(pedir.pedirInt("Numero de teclas del teclado? "));
        pantalla.setMarca(JOptionPane.showInputDialog("Modelo de monitor? "));
        pantalla.setPulgadas(pedir.pedirFloat("Numero de pulgadas del monitor: "));
    }

    public void visualizarAtributros() {
        JOptionPane.showMessageDialog(null,
                "Numero de nucleos: " + procesador.getNucleos()
                + "\nRAM :" + procesador.getRam()
                + "\nRaton inhalambrico: " + unRaton.getInhalambrico()
                + "\nModelo de raton: " + unRaton.getModelo()
                + "\nNumero de teclas del teclado: " + unTeclado.getNumTeclas()
                + "\nMarca del monitor: " + pantalla.getMarca()
                + "\nNumero de pulgadas del monitor: " + pantalla.getPulgadas()
        );
        
        /*JOptionPane.showMessageDialog(null, "\n" + procesador.toString()
                + "\n" + unRaton.toString()
                + "\n" + unTeclado.toString()
                + "\n" + pantalla.toString()
        );*/
    }

    public void calcularPrecio() {
        double precio;
        precio = procesador.getRam() * 5 + unTeclado.getNumTeclas() * 0.7 + pantalla.getPulgadas() * 12;

        if (unRaton.getInhalambrico() == true) {
            precio = precio + 1.5;

        } else {
            precio = precio + 1;
        }

        JOptionPane.showMessageDialog(null, "Precio: " + precio);
    }

}
