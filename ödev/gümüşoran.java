
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
public class gümüşoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.85:  
        Scanner input = new Scanner(System.in);
        double u = input.nextDouble();
        double b = u/(2+Math.pow(2, 5));
        double a = u-b;
        System.out.println(a);
        System.out.println(b);
    }
    
}
