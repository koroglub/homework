
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
public class fonksüyonlu {

   public static int fackt(int x)
   {
       int c=1;
       for (int i = 1; i <= x; i++) {
           c*=i;
           
       }
       return c;
   }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("sayı gir:");
        int n =inp.nextInt();
        System.out.println("bir sayı daha gir");
        int a = inp.nextInt();
        System.out.println(fackt(n)*fackt(a));
        
    }
    
}
