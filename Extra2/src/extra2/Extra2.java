
package extra2;
import java.util.Scanner;

public class Extra2 {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float pc=0.0f,pv=0.0f;
        int marxe=0;
        final float IVE=0.12f;
        
        System.out.println("Introduzca o prezo de compra do artigo: ");
        pc=ler.nextFloat();
        System.out.println("Introduzca a marxe que se desexa obter: ");
        marxe=ler.nextInt();
        
        pv=pc+(pc*((float)marxe/100))+(pc*IVE);
        System.out.println("O prezo de venda do artigo é: "+pv);
        
    }
    
}
