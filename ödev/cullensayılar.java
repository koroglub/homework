
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
public class cullensayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 93
        Scanner inp = new Scanner(System.in);
        System.out.println("Terim sayısını giriniz:");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i*(Math.pow(2, i))+1);
            
        }
    }
    
}
