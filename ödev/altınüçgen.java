
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahar
 */
public class altınüçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.84:
        Scanner input = new Scanner(System.in);
        System.out.println("üçgenin kısa kenarını giriniz:");
        double a = input.nextDouble();
        double b =a*(1+Math.pow(5, 1/2)/2);
        System.out.println("üçgenin kenarlari:"+a+" "+b+" "+b);
       
        
    }
    
}
