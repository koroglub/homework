/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahar
 */
public class palindromsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //106
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(100*i+10*j+i);
                
            }
            
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(1000*i+100*j+10*j+i);
                
            }
            
        }
    }
    
}
