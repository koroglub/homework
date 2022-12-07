
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
public class fibonacciserisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 111
           Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int n=input.nextInt();
        int s1=0;
        int s2=1;
        int toplam;
         System.out.println("fibonacci dizisi:");
        for (int i = 0; i <= n; i++) {
            toplam=s1+s2;
            s1=s2;
            s2=toplam;
            System.out.print(s1);
    
        }
    }
    
}
