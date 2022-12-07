
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
public class ln2hesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.71:
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayisini girin:");
        int n = input.nextInt();
        int t =0;
        for (int i = 0; i < n-1; i++) {
            t=t+1/((2*i+1)*(2*i+2));
           
        }
      System.out.println(t);
    }
    
}
