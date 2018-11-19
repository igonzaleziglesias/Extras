package extraordenador;

import javax.swing.JOptionPane;

public class Ordenador {

    private Cpu procesador = new Cpu();
    private Raton unRaton = new Raton();
    private Teclado unTeclado = new Teclado();
    private Monitor pantalla = new Monitor();

    public void pedirDatos() {
        procesador.setNucleos(Integer.parseInt(JOptionPane.showInputDialog("Numero de nucleos de la CPU: ")));
        procesador.setRam(Integer.parseInt(JOptionPane.showInputDialog("Memoria RAM de la CPU: ")));

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
        unTeclado.setNumTeclas(Integer.parseInt(JOptionPane.showInputDialog("Numero de teclas del teclado? ")));
        pantalla.setMarca(JOptionPane.showInputDialog("Modelo de monitor? "));
        pantalla.setPulgadas(Float.parseFloat(JOptionPane.showInputDialog("Numero de pulgadas del monitor: ")));
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
