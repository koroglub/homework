
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
public class cosx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //6.69: cosx
        Scanner input = new Scanner(System.in);
        System.out.println("açıyı giriniz:");
        int aci= input.nextInt();
        System.out.println("terim sayısını giriniz:");
        int n = input.nextInt();
        double t =0;
        for (int i = 0; i < n; i++) {
            int temp=2*i;
            double faktoriyel=1;
            for (int j = 1; j < temp; j++) {
                faktoriyel*=j;
                
            }
            if (i%2==0) {
                  t+=(double)Math.pow(aci, temp)/faktoriyel;
                
            }
            else{
              t-=(double)Math.pow(aci, temp)/faktoriyel;
            }
        }
        System.out.println(t);
      
    }
    
}
