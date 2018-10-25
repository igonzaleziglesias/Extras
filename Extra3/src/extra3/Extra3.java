
package extra3;
import java.util.Scanner;
public class Extra3 {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       final float PI=3.14f;
       System.out.println("Introduce o radio da circunferencia: ");
       float r=ler.nextFloat();
       System.out.println("Longitud = "+2*PI*r+"\nArea = "+PI*r*r+"\nVolumen = "+4/3*PI*Math.pow(r,3));
    }
    
}
