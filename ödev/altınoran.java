
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
public class altınoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.83: altın oran 228
        Scanner input = new Scanner(System.in);
        System.out.println("ab doğrusunun uzunluğunu giriniz:");
        double ab = input.nextDouble();
        double cb = 2*ab/(1+(Math.pow(5, 0.5)));
        double ac = ab-cb;
        System.out.println(ac);
        System.out.println(cb);
    }
    
}
