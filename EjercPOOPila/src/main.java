import java.util.Stack;

//Crea una pila dinamica propia con valores genericos (T), la pila debe tener estos metodos:
//
//        - isEmpty(): indica si la pila esta o no vacia
//  - size(): indica el tamaño de la pila
//  - pop(): devuelve el primer elemento y lo elimina.
//  - push(T elemento): introduce un elemento en la pila.
//        - top(): devuelve el primer elemento (no elimina nada)
//  - toString(): muestra el estado de la pila
//
//Necesitaremos un objeto Nodo para todo esto, el nodo contiene:
//
//        - El elemento (T)
//  - Direccion del proximo nodo (null, significa que es el ultimo)
public class main {
    public static void main(String[] args) {
        PilaDinamica<Integer> pilaNumeros = new PilaDinamica<>();
        System.out.println("¿Está vacía la pila? " + pilaNumeros.isEmpty());
        pilaNumeros.push(1);
        pilaNumeros.push(7);
        pilaNumeros.push(2);
        pilaNumeros.push(9);
        System.out.println("¿Está vacía la pila? " + pilaNumeros.isEmpty());
        System.out.println("El tamaño de la pila es " + pilaNumeros.size());
        System.out.println("El top es " + pilaNumeros.top());
        int elemento = pilaNumeros.pop();
        System.out.println("He sacado el numero " + elemento);
        System.out.println("El tamaño de la pila es " + pilaNumeros.size());
        System.out.println("El top es " + pilaNumeros.top());
        System.out.println(pilaNumeros);
        System.out.println();
        System.out.println("Stack de JAVA");
        Stack<Integer> pilastack = new Stack<>();
        pilastack.push(5);
        pilastack.push(4);
        pilastack.push(9);
        pilastack.push(12);
        System.out.println("¿La pila está vacia? " + pilastack.isEmpty());
        System.out.println("El top es "+ pilastack.peek());
        int elemento2=pilastack.pop();
        System.out.println("He sacado el numero " + elemento2);
        System.out.println("El tamaño es "+ pilastack.size());
        System.out.println("El top es "+ pilastack.peek());

    }
}

