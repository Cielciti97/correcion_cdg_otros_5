package org.generation;

import java.util.Scanner;
/**
 * Este código fue corregido por Charly
 * 
 * Descripción breve del presente código:
 * 
 * Este código es un programa en Java que determina si un número es “afortunado” o no, según una regla específica.

 * Pasos del código:
 * 
1. Solicita al usuario que introduzca un número.

2. Lee el número introducido por el usuario.

3. Inicializa dos "contadores le podríamos decir", uno para los “afortunados” (afo) y otro para los dígitos “no afortunados” (noAfo).

4. Entra en un bucle mientras el número sea mayor que 0.

5. En cada iteración del ciclo, extrae el último dígito del número (ni % 10).

6. Si el dígito resulante es igual 3, 7, 8 o 9, incrementa el contador de dígitos “afortunados”. De lo contrario, incrementa el contador de dígitos “no afortunados”.

7. Divide el número entre 10 para eliminar el último dígito (ni /= 10).

8. Una vez que todos los dígitos han sido procesados, compara los contadores de dígitos “afortunados” y “no afortunados”.

9. Finalmente, si “afortunados” es mayor que “no afortunados”, imprime un mensaje diciendo que el número es afortunado. De lo contrario, imprime un mensaje diciendo que el número no es afortunado.
 * 
 * 
 */
public class CodigoOtros5 {

	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int ni = s.nextInt();
        int c = ni;

        int afo = 0;
        int noAfo = 0;

        while (ni > 0) {
            int digito = ni % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }

            ni /= 10;
        }
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
    }
	
}

/* Correciones aplicadas.
 * 
1. Hacia falta la clase Scanner así que la import´e.
2. Moví el código a un método main para que pueda ser ejecutado.
3. Corregí la sintaxis de la declaración del Scanner, si no mal recuerdo faltaba un system.in.
4. Corregí la sintaxis de la línea que imprime el mensaje para introducir un número (' -> ").
5. Siento que para los fines del código es más facil trabajar la varibale en int, por ello cambié la variable ni a un int en lugar de un String.
6. Le faltaba una t en los printLn finales, corregí la sintaxis de la línea que imprime si el número es afortunado o no.
 * 
 * */

//Mejoras a futuro.
/*
 * Renombrar las variables para que den más contexto del que almacenan ó para que van a ser utilizadas
 * utilizar tipo de Datos Int para evitar la conversión que tenia en el cpodigo original.
 * Utilizar la liberia Rand() para generar números aleatorios y cambiar las posibilidades en cada ejecución.
 */
