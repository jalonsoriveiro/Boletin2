/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // que reciba como dato de entrada o valor dunha temperatura expresada en graos centígrados
        //e calcule o seu equivalente en graos Fahrenheit e graos Kelvin.
        
        System.out.print("Temperatura en grados centígrado =");
        Scanner sr= new Scanner(System.in);
        float grados = sr.nextFloat();  
        float fahr = 32;
        float kl = 32;
        //resultado
        System.out.println("");         
        System.out.print("Fahrenheit="+grados*fahr+" Kelvin ="+grados*kl);
        
        
    }
    
}
