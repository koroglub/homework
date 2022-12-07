
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
public class bağdaşıksayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.99:
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int a = input.nextInt();
        System.out.println("bir sayı daha giriniz:");
        int b = input.nextInt();
        int a1= (a/10);
        int a0= a%10;
        int b1=b/10;
        int b0=b%10;
        if (a1==b1&&(a0+b0==10)) {
            System.out.println("bağdaşık sayılardır");
            
        }
        else{
            System.out.println("bağdaşık sayı değildir");
        }
    }
    
}
