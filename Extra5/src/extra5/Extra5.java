package extra5;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        Garaxe coche1 = new Garaxe();
        coche1.setMatricula("5421ASD");
        coche1.setMarca("PEUGEOT");
        coche1.verCoche();
        Garaxe coche2 = new Garaxe("4214ASV", "OPEL");
        coche2.verCoche();
        Garaxe coche3 = new Garaxe("5132FBD", "CITROEN");
        coche3.verCoche();
        Garaxe coche4 = new Garaxe();

    }

}
