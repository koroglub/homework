
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
public class stirlingsayısı {

    public static int fak(int x){//f(5)
    int c =1;
        for (int i = 1; i <=x; i++) {
            c=c*i;
            
        }
        return c;
    }
    public static int comb(int y,int z)
    {
        return fak(y)/(fak(y-z)*fak(z));
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("n i giriniz");
        int n = inp.nextInt();
        System.out.println("k yı gir:");
        int k = inp.nextInt();
        double t =0;
        for (int i = 0; i <=k; i++)
        {
            
            t+=Math.pow(-1, i)*comb(k, i)*Math.pow(k-i, n);
        }
        System.out.println(t*1/fak(k));
        
    }
    
}
