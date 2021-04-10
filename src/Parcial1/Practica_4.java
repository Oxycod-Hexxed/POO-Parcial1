package Parcial1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author neutroms
 */
public class Practica_4 {
    public static void main (String[] args) {
    BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
    Scanner sc = new Scanner (System.in);


        float suma = 0;
        float numeros[] = new float[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            numeros[i] = Integer.parseInt(sc.nextLine());

        }
        for (int x = 0; x < numeros.length; x++) {
            suma = suma + numeros[x];

        }
        float promedio = suma / numeros.length;
        System.out.printf(" El promedio es: %f", promedio);
    
        
        
    }
}
