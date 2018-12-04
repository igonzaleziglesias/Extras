package extracapicua;

import PedirDatos.pedir;

public class ExtraCapicua {

    public static void main(String[] args) {

        int numero = pedir.pedirInt("Introduzca un numero");

        int aux = numero, numInverso = 0, cifra;

        while (aux != 0) {
            cifra = aux % 10;
            numInverso = numInverso * 10 + cifra;
            aux = aux / 10;
        }

        if (numero == numInverso) {
            System.out.println(numero + "->" + numInverso + " Es capicua");
        } else {
            System.out.println(numero + "->" + numInverso + " No es capicua");
        }
    }

}
