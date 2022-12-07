
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
public class exdeğeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.75:binom açılımıyla hesaplar
        Scanner input = new Scanner(System.in);
        System.out.println("x değerini giriniz:");
        double x = input.nextInt();
        System.out.println("n değerini giriniz:");
        double n = input.nextInt();
        double sonuc=Math.pow(1+x/n, n);
        System.out.println("sonuc:"+sonuc);
    }
    
}
