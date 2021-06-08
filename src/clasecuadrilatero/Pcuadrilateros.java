package clasecuadrilatero;
import java.util.Scanner;
public class Pcuadrilateros {
    public static void main(String[] args){
        irregulares c2;
        Scanner entrada = new Scanner(System.in);
        
        int lado1,lado2;
        
        System.out.println("Ingrese el primer lado: ");
        lado1 = entrada.nextInt();
        
        
        System.out.println("Ingrese el segundo lado: ");
        lado2 = entrada.nextInt();
        
        
        if(lado1 == lado2){
            c2 = new irregulares(lado1);
        }
        else{
            c2 = new irregulares(lado1, lado2);
        }
        System.out.println("El perimetro del cuadrilatero es: "+c2.cperim());
        System.out.println("El area del cuadrilatero es: "+c2.carea());
    }
}
