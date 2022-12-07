
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
public class eüzerixhesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.74:
        Scanner input = new Scanner(System.in);
        System.out.print("x değerini giriniz:");
        double x = input.nextDouble();
        System.out.print("terim sayısını giriniz:");
        int n = input.nextInt();
        double T=1;
        double F=1;
        for ( int i = 1; i < n-1; i++) {
            F*=i;
            T+=Math.pow(x,i)/F;
            
        }
        System.out.printf("\nSeri açılımı ile e uzeri x değeri: %.5f\n",T);
        System.out.printf("Komutla e üzeri x değeri: %.5f\n",Math.exp(x));
    }
    
}
