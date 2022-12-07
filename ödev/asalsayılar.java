
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
public class asalsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.86: klavyeden girilen üst sınıra kadar olan asal sayıları sıralar
        Scanner input = new Scanner(System.in);
        int üst_sinir;
        do {  
            System.out.println("üst siniri giriniz:");
            üst_sinir=input.nextInt();
            
        } while (üst_sinir<2);
        System.out.println("asal sayılar:" + "2");
        for (int i = 2; i <= üst_sinir; i++) {
            for (int j = 1; j < i; j++) {
                if (i%j==0) {
                    i=i+1;
                    
                }
                 if (i==2) {
                    System.out.println(i);
                    
                }
            }
            System.out.println(i);
            }
           
        }
      
    }  

