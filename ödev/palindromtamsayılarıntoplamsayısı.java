
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
public class palindromtamsayılarıntoplamsayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 107
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriiniz:");
        double sayi=input.nextDouble();
        System.out.println(Math.pow(9*10, (sayi-1)/2));
        
    }
    
}
