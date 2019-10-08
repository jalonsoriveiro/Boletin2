/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // saque por pantalla a porcentaxe descontada nunha compra. 
        //Introducindo, por teclado, o prezo da tarifa e o prezo pagado.
        
        System.out.print("Tarifa =");
        Scanner sr= new Scanner(System.in);
        float tarifa = sr.nextFloat();  
        System.out.print("Prezo =");
        Scanner sd= new Scanner(System.in);
        float prezoPagado = sd.nextFloat();  
        System.out.println("");         
        System.out.print("Diferencia="+(prezoPagado/100)*100);
        
        
        
        
    }
    
}
