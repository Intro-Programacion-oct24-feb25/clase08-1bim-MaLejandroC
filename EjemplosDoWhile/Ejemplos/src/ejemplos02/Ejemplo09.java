/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 del estudiante rené
Calificación 7 del estudiante rolando

Promedio de calificaciones: 8,50
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaFinal;
        int nota;
        int salida;
        String nombre; 
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;
        String cadena = "";
        
        cadenaFinal = "Listado de Notas\n";
        
        do {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese calificacion, solo valor entero");
            nota = entrada.nextInt();
            
            // agrego valor al acumulador
            suma = suma + nota;
            // agrego una unidad al contador para luego sacar el promedio
            contador_calificaciones = contador_calificaciones + 1;
            
            cadena = String.format("%sCalificacion %d del estudiante %s\n",
                    cadena,
                    nota,
                    nombre);
            
            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();

            if (salida == -111) {
                bandera = false;
            }
            // atención
            entrada.nextLine(); // se limpia el buffer, pues el primer valor
                               // que se solicita al inicio del ciclo es una
                               // cadena

        } while (bandera); // (bandera==true)
        
        // promedio = suma / contador_calificaciones;
        promedio = (double)suma / contador_calificaciones;
        cadenaFinal = String.format("Listado de Notas\n%s\nPromedio de calificaciones: %.2f",
                cadena,
                promedio);
        System.out.printf("%s\n", cadenaFinal);
    }
}
