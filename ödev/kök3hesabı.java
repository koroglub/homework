
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
public class kök3hesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.81:
        Scanner input= new Scanner(System.in);
        System.out.println("bölme sayısını girin:");
        int n = input.nextInt();
        double t =1;
        for (int i = 1; i < n-1; i++) {
            t=t+1/(2+1/t);
            
        }
        System.out.println(Math.sqrt(3)+(1+1/t));
    }
    
}
