
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
public class aritmetiksayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 105
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi=input.nextInt();
        int t=0;
        int s = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0) {
                t+=i;
                s+=1;
                        
                
            }
            
        }
        if (t%s==0) {
            System.out.println("aritmetik sayıdır.");
            
        }
        else{
            System.out.println("aritmetik sayı değildir.");
        }
        
    }
    
}
