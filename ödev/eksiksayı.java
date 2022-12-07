
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
public class eksiksayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.100
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int n = input.nextInt();
        int t=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                t+=i;
            }
            
        }
        if (t<2*n) {
            System.out.println("eksik sayidir ve eksiklik miktarı:"+(2*n-t));
            
        }
        else{
            System.out.println("eksik sayi değildir");
        }
    }
    
}
