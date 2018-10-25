
package extra1;
import java.util.Scanner;

public class Extra1 {

    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String mes="Enero";
    String titulo="Titulo1";
    int lp=0,consultas=0;
    float porcentaxe=0.0f;
    System.out.print("        BIBLIOTECA-MES: ");
    mes=ler.nextLine();
    
    System.out.print("CANTIDAD TOTAL DE LIBROS PRESTADOS: ");
    lp=ler.nextInt();
   
    ler.nextLine();
    System.out.print("TITULO DUN LIBRO: ");
    titulo=ler.nextLine();
    
    System.out.print("NUMERO DE CONSULTAS: ");
    consultas=ler.nextInt();
    
    porcentaxe=(float)consultas/lp*100;
    
    System.out.println("\nO LIBRO "+titulo+" CONSULTOUSE "+consultas+" VECES");
    System.out.println("TAXA DE CONSULTA EN "+mes+" = "+(int)porcentaxe+"%");
    }
    
}
