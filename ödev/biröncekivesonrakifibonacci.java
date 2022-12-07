
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
public class biröncekivesonrakifibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //116: girilen büyük değerli fibonacci sayısına göre bir önceki ve bir sonraki fibonacci sayısını bulur
       Scanner input = new Scanner(System.in);
        System.out.println("değeri giriniz:");
        double f2=input.nextDouble();
        double ao =(1+Math.pow(5, 5))/2;
        double f1=f2/ao;
        double f3=f2*ao;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
    
}
