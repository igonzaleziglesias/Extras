package extracadrado;

import PedirDatos.pedir;

public class Metodo {

    public Metodo() {
        int largo = pedir.pedirInt("Introduce el largo: ");
        int ancho = pedir.pedirInt("Introduce el ancho: ");

         for (int i = 1; i <= ancho; i++) {
            for (int j = 1; j <= largo; j++) {
                if (j == 1) {
                    System.out.print("\n");
                }
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.println("");
        int aux;

        aux = largo;

        for (int i = 1; i <= ancho; i++) {
            for (int j = 1; j <= largo; j++) {
                if (j == 1) {
                    System.out.print("\n");
                }
                if (j < aux) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            aux--;
        }
    }

}
