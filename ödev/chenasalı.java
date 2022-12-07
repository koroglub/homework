
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
public class chenasalı {
    
    public static boolean asalmi(int x)
    {
        for (int i = 2; i < x; i++)
        {
            if(x%i==0)
            {
                return false;
            }
            
        }
        
        return true;
    }
    public static void main(String[] args) {
        // 89
        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int n = inp.nextInt();
        if (asalmi(n))
        {
            System.out.println("asaldır");
        }
        if (asalmi(n+2)) {
            System.out.println("chen asalıdır");
            
        }
        else{
            System.out.println("chen asalı değil");
        }
    }
    
}
