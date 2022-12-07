
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
public class negafiibonaccisayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //114
        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int n = inp.nextInt();
        int f1=1,f2=-1;
        System.out.println(f1);
        System.out.println(f2);
        for (int i = 1; i <= n-2; i++) {
            int f3=f1-f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
            
        }
    }
    
}
