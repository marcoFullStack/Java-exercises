class ArbolBinario {
    private String[] arbol; // Array para almacenar el árbol
    private int tamaño; // Tamaño del árbol

    // Constructor que recibe la altura del árbol y calcula su tamaño total
    public ArbolBinario(int altura) {
        this.tamaño = (int) Math.pow(2, altura + 1) - 1;
        this.arbol = new String[this.tamaño]; // Inicializamos el array
    }

    // Método para insertar un valor en una posición específica
    public void insertar(int index, String valor) {
        if (index >= 0 && index < tamaño) {
            arbol[index] = valor;
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    // Método para mostrar el árbol almacenado en el array
    public void mostrar() {
        for (int i = 0; i < arbol.length; i++) {
            if (arbol[i] != null) {
                System.out.print(arbol[i] + " ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    // Método para obtener el padre de un nodo dado su índice
    public String obtenerPadre(int index) {
        if (index > 0 && index < tamaño) {
            int padre = (index - 1) / 2;
            return arbol[padre];
        }
        return null;
    }

    // Método para obtener el hijo izquierdo de un nodo dado su índice
    public String obtenerHijoIzquierdo(int index) {
        int hijoIzq = 2 * index + 1;
        if (hijoIzq < tamaño) {
            return arbol[hijoIzq];
        }
        return null;
    }

    // Método para obtener el hijo derecho de un nodo dado su índice
    public String obtenerHijoDerecho(int index) {
        int hijoDer = 2 * index + 2;
        if (hijoDer < tamaño) {
            return arbol[hijoDer];
        }
        return null;
    }

    // Recorrido en PREORDEN: Nodo -> Izquierda -> Derecha
    public void recorrerPreorden(int index) {
        if (index >= tamaño || arbol[index] == null) {
            return;
        }
        System.out.print(arbol[index] + " ");  // Visitar nodo
        recorrerPreorden(2 * index + 1);       // Recorrer hijo izquierdo
        recorrerPreorden(2 * index + 2);       // Recorrer hijo derecho
    }

    // Recorrido en INORDEN: Izquierda -> Nodo -> Derecha
    public void recorrerInorden(int index) {
        if (index >= tamaño || arbol[index] == null) {
            return;
        }
        recorrerInorden(2 * index + 1);       // Recorrer hijo izquierdo
        System.out.print(arbol[index] + " "); // Visitar nodo
        recorrerInorden(2 * index + 2);       // Recorrer hijo derecho
    }

    // Recorrido en POSTORDEN: Izquierda -> Derecha -> Nodo
    public void recorrerPostorden(int index) {
        if (index >= tamaño || arbol[index] == null) {
            return;
        }
        recorrerPostorden(2 * index + 1);     // Recorrer hijo izquierdo
        recorrerPostorden(2 * index + 2);     // Recorrer hijo derecho
        System.out.print(arbol[index] + " "); // Visitar nodo
    }


    public static void main(String[] args) {
        // Crear un árbol de altura 3 (15 nodos)
        ArbolBinario arbol = new ArbolBinario(3);

        // Insertar nodos en orden de nivel
        String[] nodos = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        for (int i = 0; i < nodos.length; i++) {
            arbol.insertar(i, nodos[i]);
        }

        // Mostrar el array resultante
        System.out.println("Árbol en array:");
        arbol.mostrar();

        // Mostrar relaciones de un nodo específico (ejemplo con "B")
        int index = 1; // Nodo "B" está en la posición 1
        System.out.println("\nInformación del nodo '" + nodos[index] + "':");
        System.out.println("Padre: " + arbol.obtenerPadre(index));
        System.out.println("Hijo Izquierdo: " + arbol.obtenerHijoIzquierdo(index));
        System.out.println("Hijo Derecho: " + arbol.obtenerHijoDerecho(index));
//        recorridos
        // Crear un árbol de altura 3 (15 nodos)
        ArbolBinario arbol2 = new ArbolBinario(3);

        // Insertar nodos en orden de nivel
        String[] nodos2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        for (int i = 0; i < nodos2.length; i++) {
            arbol.insertar(i, nodos2[i]);
        }

        // Mostrar el array representando el árbol
        System.out.println("Árbol en array:");
        arbol.mostrar();

        // Realizar los recorridos
        System.out.println("\nRecorrido Preorden:");
        arbol.recorrerPreorden(0);

        System.out.println("\n\nRecorrido Inorden:");
        arbol.recorrerInorden(0);

        System.out.println("\n\nRecorrido Postorden:");
        arbol.recorrerPostorden(0);
    }
}
