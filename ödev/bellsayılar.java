
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
public class bellsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 121
        Scanner inp = new Scanner( System.in);
        System.out.println("bir sayı giriniz:");
        double n = inp.nextDouble();
        double e =2.71828;
        for (int i = 1; i <= n; i++) {
            double t =0;
            double f=1;
            for (int j = 1; j <= 100; j++) {
                f*=j;
                t+=(double)Math.pow(j, i)/f;
                
                
            }
            System.out.println(t/e);
            
        }
    }
    
}
