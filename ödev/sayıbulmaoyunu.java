
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
public class sayıbulmaoyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 72:
           int max = 99;
        int min=1;
        Scanner input= new Scanner(System.in);
        int randomsayı = (int)(Math.random()*(max-min-1)+min);
        int deneme=0;
        while (true) {         
            System.out.println("1-99 arası sayı giriniz:");
            int sayi=input.nextInt();
            deneme++;
            if (sayi>randomsayı) {
                System.out.println("lütfen daha küçük bir sayı giriniz:");
                
            }
            else if (randomsayı>sayi) {
                System.out.println("lütfen daha büyük bir sayı giriniz:");
                
            }
            else if (randomsayı==sayi) {
                System.out.println("tebrikler, doğru tahmin");
                break;
            }
            
        } System.out.println(deneme+"kadar tahminde doğru sonuca ulaştınız");
    }
    
}
