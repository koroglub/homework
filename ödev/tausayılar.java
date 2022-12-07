
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
public class tausayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 101:
        Scanner input = new Scanner(System.in);
        System.out.println("üst sınırı giriniz:");
        int  ust_sinir=input.nextInt();
        for (int i = 1; i <= ust_sinir; i++) {
            int s =0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    s += +1;
                    
                }
                                           }
            if (i%s==0) {
                    System.out.println(i);
                    
                }

             
           

           
        }
    }
    
}
