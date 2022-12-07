
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
public class kökiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.80:
        Scanner input = new Scanner(System.in);
        System.out.println("bölüm sayisini girin:");
        int n = input.nextInt();
        int t =1;
        for (int i = 1; i < n; i++) {
            t = 2+1/t;
            
        }
        System.out.println(1+1/t);
    }
    
}
