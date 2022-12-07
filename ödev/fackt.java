
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
public class fackt {

    public static int  kombinasyon(int x){
        int c =1;
        for (int i = 1; i <= x; i++) {
            c*=i;
            
        }
        return c;
    
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("n i gir:");
        int n = inp.nextInt();
        System.out.println("r yi gir:");
        int r = inp.nextInt();
        System.out.println(kombinasyon(n)/kombinasyon(n)*kombinasyon(n-r));
    }
    
}
