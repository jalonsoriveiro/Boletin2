/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fai un programa , para o software dunha máquina, 
        //que converta una cantidade enteira de diñeiro,
        //que está en billetes de 100, 20, 5 e moedas de 1 € 
        //, no seu equivalente en euros ( exp.  2 billetes de 100, 3 -> 20 ,
        //6 moedas de 1  visualizaríamos 266 € ).
        //Billetes 100
        System.out.print("Billetes de 100 =");
        Scanner sr= new Scanner(System.in);
        float billetesCien = sr.nextFloat();  
        //Billetes 20
        System.out.print("Billetes de 20 =");
        Scanner sd= new Scanner(System.in);
        float billetesVente = sr.nextFloat();  
        //billetes 5
        System.out.print("Billetes de 5 =");
        Scanner sf= new Scanner(System.in);
        float billetesCinco = sr.nextFloat();  
        //Monedas de 1
        System.out.print("Monedas de 1 =");
        Scanner sv= new Scanner(System.in);
        float monedasUnEuro = sr.nextFloat();  
        System.out.println("******** Resultado");         
        System.out.print("El calculo de los "+billetesCien+
                " de cien mas los "+billetesVente+
                " de vente "+billetesCinco+
                " de cinco "+monedasUnEuro+"\n monedas de euro y el total es "+(billetesCien*100+
                        billetesVente*20+billetesCinco*5+monedasUnEuro*1));
    }
    
}
