/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez04;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Scambio {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        int op1 = s.nextInt();

        System.out.println("Inserisci il secondo numero");
        int op2 = s.nextInt();

        int z = op1;

        op1 = op2;
        op2 = z;
        
        System.out.println("op1" +op1 + " op2" +op2) ;
        System.out.println(String.format("op1 vale %s,op2 vale %s",op1,op2));
        
 
                
        
                
    }
}
