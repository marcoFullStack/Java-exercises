import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Definicion e Instanciacion
        int[] misNumeros = new int[10];

//Asignacion
        misNumeros[0] = 3;
        misNumeros[1] = 1;
        misNumeros[2] = 100;
        misNumeros[3] = 33;
        misNumeros[4] = 22;
        misNumeros[5] = 78;
        misNumeros[6] = 90;
        misNumeros[7] = 55;
        misNumeros[8] = 53;
        misNumeros[9] = 12;

//Mostramos el Array sin Ordenar
        System.out.println("Array sin ordenar");
        for (int numero : misNumeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nArray Ordenado");
//1. Mediante esta sentencia ordenamos el Array
        Arrays.sort(misNumeros);
//Mostramos el resultado del Array ordenado
        for (int numero : misNumeros) {
            System.out.print(numero + " ");
        }
//2.        Busqueda elemento en arrays
        //Vamos a realizar una busqueda binaria
        Arrays.sort(misNumeros);
        int posicionElemento = Arrays.binarySearch(misNumeros, 33);
        System.out.println("La posicion del elemento es: " + posicionElemento);
//Buscamos un elemento que no existe
        posicionElemento = Arrays.binarySearch(misNumeros, 35);
        System.out.println("La posicion del elemento es: " + posicionElemento);

//3. Redimensionar un Array copiando todos los valores
        //Definicion e Instanciacion
        int[] misNumeroscop = new int[10];
        //Realizamos la copia y redimensión
        misNumeroscop = Arrays.copyOf(misNumeros, 20);
//Imprimimos los valores
        for (int numero : misNumeroscop) {
            System.out.print(numero + " ");
        }
        System.out.println();
//Rellenamos todas las posiciones restantes hasta 20
        misNumeroscop[10] = 7;
        misNumeroscop[11] = 10;
        misNumeroscop[12] = 13;
        misNumeroscop[13] = 16;
        misNumeroscop[14] = 19;
        misNumeroscop[15] = 22;
        misNumeroscop[16] = 25;
        misNumeroscop[17] = 28;
        misNumeroscop[18] = 31;
        misNumeroscop[19] = 34;

//Imprimimos de nuevo los valores
        for (int numero : misNumeroscop) {
            System.out.print(numero + " ");
        }
        System.out.println();

//    4. Comparar si un Array es igual a otro Array
        //Comparamos los arrays
        if (Arrays.equals(misNumeros, misNumeroscop) == true) {
            System.out.println("Los arrays son iguales");
        }

//cambiamos un valor
        misNumeros[2] = 9;
//Volvemos a comparar ambos Arrays
        if (Arrays.equals(misNumeros, misNumeroscop) == false) {
            System.out.println("Los arrays NO son iguales");
        }
    }
}
