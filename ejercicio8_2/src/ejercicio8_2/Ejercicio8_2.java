/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_2;

import java.util.Scanner;

/**
 *
 * @author LABMOVIL
 */
public class Ejercicio8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension;
        do{
            System.out.println("cuantas posiciones se usaran");
            dimension = teclado.nextInt();
        }while(dimension == 0);
        int[] puntero = new int [dimension];
        for(int i = 0; i <dimension; i++){
            puntero[i] = (int) (Math.random()*300+1);
        }
        System.out.println("cual es el digito a buscar: ");
        int digito = teclado.nextInt();
        int coincidencias = 0;
        for(int y = 0 ; y < dimension; y++){
            if(puntero[y] % 10 == digito){
                coincidencias++;
            }
        }  
        int indice = 0;
        int[] resultado = new int [coincidencias];
        System.out.println("los numeros que coinciden con la busqueda son,");
        for(int x = 0; x < dimension; x++){
            if(puntero[x]% 10 == digito){
                resultado[indice] = puntero[x];
                System.out.println(puntero[x]);
                indice++;
                
            }
        }
        
    }
    
}
