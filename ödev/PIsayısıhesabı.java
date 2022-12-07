
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
public class PIsayısıhesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.77: klavyeden girilen  terim sayısı için PI sayısını hesaplar
        Scanner input = new Scanner(System.in);
        System.out.println("n sayısını girin:");
        int n = input.nextInt();
        int t =0;
        for (int i = 0; i < n-1; i++) {
            t = t+(-1)^i/((2*i+1)*3^i);
            
        }
        System.out.println(Math.pow(12, 1/2)*t);
    }
    
}
