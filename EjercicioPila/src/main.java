public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila(5); // Crea una pila con capacidad para 5 elementos

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        pila.push(60); // Intento de agregar un elemento a una pila llena

        // Ver el elemento en la parte superior
        System.out.println("Elemento en la parte superior de la pila: " + pila.peek());

        // Sacar elementos de la pila
        System.out.println("Eliminando elemento: " + pila.pop());
        System.out.println("Eliminando elemento: " + pila.pop());

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        // Vaciar la pila
        while (!pila.isEmpty()) {
            System.out.println("Eliminando elemento: " + pila.pop());
        }

        // Intentar sacar un elemento de la pila vacía
        System.out.println("Eliminando elemento: " + pila.pop());
    }
}
