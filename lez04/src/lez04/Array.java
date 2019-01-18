/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez04;


/**
 *
 * @author tss
 */
public class Array {

    public static void main(String[] args) {
        int[] numeri;

        //creazione di un array di 100 numeri
        numeri = new int[100];

        //forma abbreviata 1
        int[] numeri1 = new int[100];
        
        //forma abbreviata 2 
        int[] numeri2 ={10,20,30,40};
                stampa(numeri2);
          System.out.println("..............................");      

        //stampa array
        
        stampa(numeri);
        
        //carica array
        int valore = 1;
        for (int i = 0; i < 100; i++) {
            numeri[i] = valore;
            valore = valore + 1;

        }

        System.out.println("..............................");
        
        //stampa array
        stampa(numeri);
        
        

    }

    //function in Java
    public static void stampa(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int el = array[i];
            System.out.println(String.format("array[%s] = %s",i,el));
        }
    }

}
