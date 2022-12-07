
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
public class Cosxfonksiyonumaclauriserisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.69: cos(x) maclaruin serisine göre açılıml
        Scanner input=new Scanner(System.in);
        System.out.println("x'i giriniz:");
        int x = input.nextInt();
        System.out.println("n'i giriniz:");
        int n = input.nextInt();
        int T=1;
        for (int i = 1; i < n-1; i++) {
            int F=1;
            for (int j = 1; j < 2*i; j++) {
                F=F*j;
                T=T+((-1)^i)*(x^(2*i))/F;
                
            }
            System.out.println("sonuc:"+T);   
        }
    }
    
}
