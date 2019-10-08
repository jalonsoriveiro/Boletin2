/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realiza un algoritmo e codifica o programa correspondente  que lea,
        //dende o teclado, unha cantidade enteira en euros e amose ,
        //por pantalla, o seu desglose en billetes de 100, 20, 5 e moedas de 1 € .
         System.out.print("Euros en billetes de 100 =");
        Scanner sr= new Scanner(System.in);
        float billetesCien = sr.nextFloat();  
        //Billetes 20
        System.out.print("Euros en billetes de 20 =");
        Scanner sd= new Scanner(System.in);
        float billetesVente = sr.nextFloat();  
        //billetes 5
        System.out.print("Euros en billetes de 5 =");
        Scanner sf= new Scanner(System.in);
        float billetesCinco = sr.nextFloat();  
        //Monedas de 1
        System.out.print("Euros en moneda de 1 =");
        Scanner sv= new Scanner(System.in);
        float monedasUnEuro = sr.nextFloat();  
        System.out.println("******** Resultado");         
        System.out.print("El calculo de los "+billetesCien%100+
                " de cien mas los "+billetesVente%20+
                " de vente "+billetesCinco%5+
                " de cinco "+monedasUnEuro%1+"\n monedas de euro y el total es "+(billetesCien%100)+
                        (billetesVente%20)+(billetesCinco%5+monedasUnEuro%1));
    }
    
}
