package Arreglos;

public class Arreglos {
  public static void main(String[] args) {

    // =============== ARREGLOS UNIDIMENSIONALES ===============
    // Declaracion de un arreglo
    int[] edades;

    // Inicializacion al momento de declarar
    int[] edades2 = new int[5];

    // Inicializacion con valores especificos
    // 0 1 2 3 4
    int[] edades3 = { 12, 51, 23, 56, 2 };
    System.out.println(edades3[1]); // Imprime el valor de 51
    System.out.println(edades3[4]); // Imprime el valor de 2

    // Inicializacion con operador new
    int[] edades4 = new int[] { 56, 32, 67, 32, 12, 126 };

    // =============== ARREGLOS MULTIDIMENSIONALES ===============
    // Declaracion
    int[][] matriz;
    // Inicializacion
    int[][] matriz1 = new int[5][15];
    // Inicializacion con valores especificos
    int[][] matriz2 = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
    };
    // Inicializacion con operador new
    int[][] matriz3 = new int[][] {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
    };

    // =============== ARREGLOS DE OBJETOS ===============
    Persona[] personas = new Persona[3];
    personas[0] = new Persona("Juan");
    personas[1] = new Persona("Maria");
    personas[2] = new Persona("Alejandro");

    int[] numeros = { 1, 2, 3, 4, 5 };

    // Acceder a los elementos de un arreglo
    int primerNumero = numeros[0];
    int segundoNumero = numeros[1];

    // Modificar un elemento de un arreglo
    numeros[0] = 13;
    System.out.println("El nuevo valor de la posicion 0 es: " + numeros[0]);

    // Bucle for
    for(int i = 0; i < numeros.length; i++) { // Define i con el valor de 0; mientras i sea menor a la longitud del arreglo numeros; incremente i en 1
      System.out.println("for: " + numeros[i]); // Imprime el valor de la posicion i del arreglo numeros
    }
    // Bucle for-each
    for (int numero : numeros) {
      System.out.println("for-each: " + numero);
    }
    // Bucle while
    int i = 0;
    while (i < numeros.length) {
      System.out.println("while: " + numeros[i]);
      i++; // Incrementa i en 1, evita bucle infinito
    }
  }
}