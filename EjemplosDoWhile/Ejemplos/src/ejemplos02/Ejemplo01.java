/*
1
2
3
4
5
6
7
8
9
10

Y presente la suma
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int contador = 1;
        int suma;
        String cadena = "";
        suma = 0;
        do {
            suma = suma + contador;
            System.out.printf("%s%d\n",cadena,contador);
            contador = contador + 1;
        } while (contador <= 10); 
        System.out.printf("\n%d\n", suma);
    }

}
