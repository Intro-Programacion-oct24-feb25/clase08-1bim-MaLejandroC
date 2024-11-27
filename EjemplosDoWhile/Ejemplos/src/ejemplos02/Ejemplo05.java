/*
 Este programa genera el resultado de
 4 elevado a la potencia 3
 Donde número = 4 y potencia = 3

 Agregar los cambios necesarios para que tanto número y potencia 
 sean ingresados por teclado por el usuario.
 */
package ejemplos02;

import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        
        int potencia;
        int resultado;
        int teclado;
        resultado = 1;
        int contador = 1;
        
        System.out.print("Ingrese el numero a elevar: ");
        teclado = valores.nextInt();
        System.out.print("Ingrese a que valore elevamos a"+teclado+": ");
        potencia = valores.nextInt();
        
        
        do {
            resultado = resultado * teclado;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
