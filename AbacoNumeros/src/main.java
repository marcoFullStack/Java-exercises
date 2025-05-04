public class main {

    public static void main(String[] args) {
        String[] abaco = {
                "O---OOOOOOOO",
                "OOO---OOOOOO",
                "---OOOOOOOOO",
                "OO---OOOOOOO",
                "OOOOOOO---OO",
                "OOOOOOOOO---",
                "---OOOOOOOOO"
        };

        String resultado = leerAbaco(abaco);
        System.out.println("Resultado: " + resultado);
    }

    public static String leerAbaco(String[] abaco) {
        StringBuilder numero = new StringBuilder();

        // Iteramos sobre cada elemento del array de ábaco
        for (String elemento : abaco) {
            // Contamos cuántas "O" hay a la izquierda del alambre
            int count = elemento.indexOf("---"); // encontrar el índice del alambre
            int cantidad = count; // cantidad de "O" es el mismo índice
            numero.append(cantidad); // Agregar al número
        }

        // Formateo del número con puntos de mil
        String numeroFormateado = formatearNumero(numero.toString());
        return numeroFormateado;
    }

    private static String formatearNumero(String numero) {
        StringBuilder formateado = new StringBuilder();
        int longitud = numero.length();

        // Insertar puntos cada 3 dígitos desde la derecha
        for (int i = 0; i < longitud; i++) {
            if (i > 0 && (longitud - i) % 3 == 0) {
                formateado.append("."); // Agregar un punto cada 3 dígitos
            }
            formateado.append(numero.charAt(i));
        }

        return formateado.toString();
    }
}
