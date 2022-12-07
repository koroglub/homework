
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
public class mükemmelsayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 91
        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = inp.nextInt();
        int t=0;
        for (int i = 1; i <= sayi-1; i++) {
            if (sayi%i==0) {
                t+=i;
                
            }
            
        }
        if (sayi==t) {
            System.out.println("Mükemmel sayıdır.");
            
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }
       
    }
    
}
