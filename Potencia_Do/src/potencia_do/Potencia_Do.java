/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia_do;


import java.util.Scanner;
public class Potencia_Do {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        
        
        do
        {
         int p = (int) Math.pow(3,i);
         System.out.println(p);
         i = i + 1;
        }while (i<=15);
        
    }
    
}
