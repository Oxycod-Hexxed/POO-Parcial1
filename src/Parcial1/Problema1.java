package Parcial1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author neutroms
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader (new InputStreamReader(System.in));
        Scanner sc = new Scanner (System.in);
        
        
        int cantidad=0;
        String As = "*";
        String Ass="";
        
        System.out.print("Introduzca el numero de filas que desee para crear la piramide: ");
        cantidad = sc.nextInt();
        sc.nextLine();
        
        
        for(int i=1; i<=cantidad;i=i+1){
        System.out.println(As+Ass);
        Ass = Ass + As;

        }
                
        
        
    }
    
}
