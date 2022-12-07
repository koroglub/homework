
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
public class oresayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 103:
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriiniz:");
        int n = input.nextInt();
        int s =0;
        double t =0;
        for (int i = 1; i <= n; i++) {
           
            if (n%i==0) {
                s+=1;
                t+=1/(double)i;    
            }  
        }
        if (s%t==0) {
            System.out.println("ore");
            
        }
        else{
            System.out.println("ore değil");
        }
    }
    
}
