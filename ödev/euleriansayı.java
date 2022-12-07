
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
public class euleriansayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //108
        Scanner input = new Scanner(System.in);
        System.out.println("m sayısını giriniz:");
        double m = input.nextDouble();
        System.out.println(" n sayısını giriniz:");
        double n = input.nextDouble();
        double t=Math.pow(n +1, m);
        for (int i = 1; i <= n; i++) {
            int f1=1;
            int f2=1;
            int f3=1;
            for (int j = 1; j <= m+1; j++) {
                f1*=j;
                
            }
            for (int j = 1; j <= i; j++) {
                f2*=j;
                
            }
            for (int j = 1; j <= m+1-i; j++) {
                f3*=j;
                
            }
            int c= f1/(f2*f3);
            t+=Math.pow(-1, i)*c*Math.pow(n+1-i, m);
            
        }
        System.out.println(t);
    }
    
}
