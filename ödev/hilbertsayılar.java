
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
public class hilbertsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.96:
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int n = input.nextInt();
        if ((n-1)%4==0) {
            System.out.println("Hilbert sayıdır");
            
        }
        else{
            System.out.println("Hilbert sayı değildir");
        }
    }
    
}
