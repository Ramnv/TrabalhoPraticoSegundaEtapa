/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmc_teste;

import java.util.Scanner;

/**
 *
 * @author Guilherme Graeff
 */
public class teste_MMC {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    public int mmc (){
        int num1 =0, num2 =0;
        int mmc = 0, aux, i;
         Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o primeiro número: "); 
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();
        
        for (i =2; i <= num2; i++){
            aux = num1 * i;
            if ((aux % num2)==0){
                mmc = aux;
                i = num2 + 1;
            }
             System.out.println(mmc);
        }
        return mmc;
       
    }
}
