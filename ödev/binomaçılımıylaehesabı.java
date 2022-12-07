
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
public class binomaçılımıylaehesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.75:
        Scanner input = new Scanner(System.in);
        System.out.println("x değerini girin:");
        int x = input.nextInt();
        System.out.println("n değerini girin:");
        int n = input.nextInt();
        int sonuc= (1+x/n)^n;
        System.out.println("sonuc:"+sonuc);
        
    }
    
}
