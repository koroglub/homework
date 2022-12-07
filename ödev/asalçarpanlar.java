
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
public class asalçarpanlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.88: asal çarpanları
        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir tam sayı giriniz:");
        int n= input.nextInt();
        int b =2;
        while (n>1) {
            if (n%b==0) {
                System.out.println(b);
                n=n/b;
                
            }
            else{
            b=b+1;
            }
            
            
        }
    }
    
}
