public class CifradoPlayfair {
    // Ajusta el texto para eliminar caracteres no deseados y reemplazar 'J' por 'I'
    private static String ajustarTexto(String texto) {
        return texto.toUpperCase().replaceAll("J", "I").replaceAll("[^A-Z]", "");
    }

    // Genera la matriz de Playfair a partir de una clave
    private static char[][] generarMatrizPlayfair(String clave) {
        char[][] matriz = new char[5][5];
        boolean[] usada = new boolean[26];
        clave = ajustarTexto(clave + "ABCDEFGHIKLMNOPQRSTUVWXYZ"); // Agrega la clave y el alfabeto
        int index = 0;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (!usada[c - 'A']) {
                matriz[index / 5][index % 5] = c;
                usada[c - 'A'] = true;
                index++;
            }
        }
        return matriz;
    }

    // Cifrado Playfair
    public static String cifrarPlayfair(String texto, String clave) {
        texto = ajustarTexto(texto);
        char[][] matriz = generarMatrizPlayfair(clave);
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i += 2) {
            char c1 = texto.charAt(i);
            char c2 = (i + 1 < texto.length()) ? texto.charAt(i + 1) : 'X'; // Si es impar, agrega 'X'

            // Si las letras son iguales, insertamos un 'X' entre ellas
            if (c1 == c2) {
                resultado.append(c1);
                i--;
                continue;
            }

            // Encuentra las posiciones de las letras en la matriz
            int[] pos1 = encontrarPosicion(matriz, c1);
            int[] pos2 = encontrarPosicion(matriz, c2);

            if (pos1[0] == pos2[0]) { // Si están en la misma fila
                resultado.append(matriz[pos1[0]][(pos1[1] + 1) % 5]);
                resultado.append(matriz[pos2[0]][(pos2[1] + 1) % 5]);
            } else if (pos1[1] == pos2[1]) { // Si están en la misma columna
                resultado.append(matriz[(pos1[0] + 1) % 5][pos1[1]]);
                resultado.append(matriz[(pos2[0] + 1) % 5][pos2[1]]);
            } else { // Si están en diferentes filas y columnas
                resultado.append(matriz[pos1[0]][pos2[1]]);
                resultado.append(matriz[pos2[0]][pos1[1]]);
            }
        }
        return resultado.toString();
    }

    // Descifrado Playfair
    public static String descifrarPlayfair(String texto, String clave) {
        texto = ajustarTexto(texto);
        char[][] matriz = generarMatrizPlayfair(clave);
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i += 2) {
            char c1 = texto.charAt(i);
            char c2 = texto.charAt(i + 1);

            // Encuentra las posiciones de las letras en la matriz
            int[] pos1 = encontrarPosicion(matriz, c1);
            int[] pos2 = encontrarPosicion(matriz, c2);

            if (pos1[0] == pos2[0]) { // Si están en la misma fila
                resultado.append(matriz[pos1[0]][(pos1[1] + 4) % 5]); // Desplazar hacia atrás
                resultado.append(matriz[pos2[0]][(pos2[1] + 4) % 5]);
            } else if (pos1[1] == pos2[1]) { // Si están en la misma columna
                resultado.append(matriz[(pos1[0] + 4) % 5][pos1[1]]); // Desplazar hacia atrás
                resultado.append(matriz[(pos2[0] + 4) % 5][pos2[1]]);
            } else { // Si están en diferentes filas y columnas
                resultado.append(matriz[pos1[0]][pos2[1]]);
                resultado.append(matriz[pos2[0]][pos1[1]]);
            }
        }
        return resultado.toString();
    }

    // Encuentra la posición de un carácter en la matriz de Playfair
    private static int[] encontrarPosicion(char[][] matriz, char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == c) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String clave = "PLAYFAIR";
        String mensaje = "HOLA PLAYFAIR";

        // Cifrado Playfair
        String cifrado = cifrarPlayfair(mensaje, clave);
        System.out.println("Cifrado Playfair: " + cifrado);

        // Descifrado Playfair
        String descifrado = descifrarPlayfair(cifrado, clave);
        System.out.println("Descifrado Playfair: " + descifrado);
    }
}
