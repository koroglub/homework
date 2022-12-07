
import java.util.Random;
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
public class montrecarloyöntemiylePIdeğeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //79
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("n değerini giriniz:");
        int n = input.nextInt();
        int m =0;
        for (int i =1; i <= n; i++) {
            double x=rastgele.nextDouble();
            double y=rastgele.nextDouble();
            if (Math.pow(x, 2)+ Math.pow(y, 2)<1) {
                m+=1;
                
            }
                    
            
        }
        System.out.println(4*m/(double)n);
    }
    
}
