package extranumeros;

import PedirDatos.pedir;
import javax.swing.JOptionPane;

public class ExtraNumeros {

    public static void main(String[] args) {
        /*
        //usando STRING
        int contador = 0;
        int veces = pedir.pedirInt("Cuantos numeros va a introducir?");

        for (int i = 1; i <= veces; i++) {

            String numero = pedir.pedirString("INTRODUZCA UN NUMERO: ");

            char dos = numero.charAt(numero.length() - 1);

            System.out.println(dos);

            String comparacion = "" + dos;

            if (comparacion.equalsIgnoreCase("2")) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, contador + " numero acaban en 2");
         */

        //usando int
        int contador = 0;
        int veces = pedir.pedirInt("Cuantos numeros va a introducir?");
        for (int i = 1; i <= veces; i++) {
            int numero = pedir.pedirInt("INTRODUZCA UN NUMERO: ");
          
                numero = numero % 10;
           
            System.out.println(numero);

            if (numero == 2) {
                contador++;
            }

        }
        JOptionPane.showMessageDialog(null, contador + " numero acaban en 2");
    }

}
