
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
public class fibonacciasalsayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 113
        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int n= inp.nextInt();
        int f1=1,f2=1,s2=0;
        int f3= f1+f2;
        f1=f2;
        f2=f3;
        int s1=0;
        for (int i = 2; i <= f3-1; i++) {
            if (f3%i==0) {
                s1+=1;
                
            }
            
        }
        if (s1==0) {
            s2+=1;
            System.out.println(f3);
            
        }
        else if (s2<n) {
            
        }
    }
    
}
