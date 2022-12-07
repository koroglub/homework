
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
public class leylandsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 95
        Scanner inp = new Scanner(System.in);
        System.out.println("x değerini giriniz:");
        System.out.println("y değerini giriniz:");
        int x=inp.nextInt();
        int y =inp.nextInt();
        for (int i = 2; i <= x; i++) {
            for (int j = 2; j <= y; j++) {
                System.out.println(Math.pow(i, j)+Math.pow(j, i));
                
            }
            
        }
    }
    
}
