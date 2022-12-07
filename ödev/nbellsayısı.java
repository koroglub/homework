
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
public class nbellsayısı 
{
    public static double fak(int c)
    {
    int a =1;
        for (int i = 1; i <= c; i++) {
            a*=i;
            
        }
        return a;
    }
    public static double comb(int x, int y)
    {
        
       return fak(x)/(fak(y)*fak(x-y));
    
    }
    public static double s(int n,int k)
    {
        double t=0;
        for (int i = 0; i <=k ; i++) {
            t+=Math.pow(-1, i)*comb(k, i)*Math.pow(k-i, n);
            
        }
        return t*1/fak(k);
        
    
    }
    public static void main(String[] args)
    {
        Scanner inp= new Scanner(System.in);
        System.out.println("n i gir:");
        int n = inp.nextInt();
        int t=0;
        for (int i = 1; i <= n; i++) {
            t+=s(n, i);
        }
        System.out.println(t);
    }
    
}
