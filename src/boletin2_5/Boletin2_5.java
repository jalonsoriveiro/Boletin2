/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fai o algoritmo e programa  que calcule o soldo bruto e líquido, a percibir, por unha persoa .
        //Sabendo que o soldo total inclue os seguintes conceptos :
        //soldo fixo. 
        //• Comisión : 5% sobre importe total de vendas
        //• Quilometraxe : 2 € por km
        //• Dietas : 30 € por día de desprazamento .
        //Para calcular o soldo líquido debemos descontarlle ao soldo bruto :
        //• I.R.P.F. = 18 % do soldo total .
        //• Retención a seguridade social : 36 € .
        //Dietas
        final float SOLDO= 1500;
        final float COMISION= 5;
        final float IRPF = 18;
        final float RETENCION =36;
              float totalBruto;
        //dietas
        System.out.print("Total dias de dietas =");
        Scanner sr= new Scanner(System.in);
        float totalDietas = sr.nextFloat();  
        System.out.print("El total en dietas "+totalDietas*30);
        System.out.println(" ");
        //Ventas
        System.out.print("Total Ventas =");
        Scanner sd= new Scanner(System.in);
        float totalVentas = sr.nextFloat();  
        System.out.print("El total en ventas "+(totalVentas*5)/100);
        System.out.println(" ");
        //KIlometos
        System.out.print("Total kilometos=");
        Scanner sf= new Scanner(System.in);
        float totalKilometros = sr.nextFloat(); 
        System.out.print("El total en kilometos "+totalKilometros*2);
        System.out.println(" ");
        System.out.println("******** Resultado");         
        System.out.print("SOldo brutos "+(SOLDO+totalDietas*30+(totalVentas*5/100)+totalKilometros*2));
        totalBruto = SOLDO+totalDietas*30+(totalVentas*5/100)+totalKilometros*2;
        System.out.println(" Restado IRPF y Retencion = " +(totalBruto -(totalBruto*IRPF/100)-RETENCION));
        
        
    }
    
}
