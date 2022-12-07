
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
public class kök5hesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.82:       
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double t =1;
        for (int i = 1; i <= n; i++) {
            t=4+1/t;
            
        }
        System.out.println(Math.sqrt(5)+(2+1/t));
    }
    
}
