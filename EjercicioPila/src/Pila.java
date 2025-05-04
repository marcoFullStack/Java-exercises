// Clase que representa una pila
class Pila {
    private int maxSize; // Capacidad máxima de la pila
    private int[] stackArray; // Array que actúa como la pila
    private int top; // Índice del elemento en la parte superior de la pila

    // Constructor
    public Pila(int size) {
        this.maxSize = size; // Establece el tamaño máximo de la pila
        this.stackArray = new int[maxSize]; // Inicializa el array para la pila
        this.top = -1; // Inicializa el índice del elemento superior
    }

    // Método para agregar un elemento a la pila
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("La pila está llena. No se puede agregar el elemento: " + value);
        } else {
            stackArray[++top] = value; // Incrementa el índice y agrega el valor
            System.out.println("Elemento agregado a la pila: " + value);
        }
    }

    // Método para quitar el elemento de la parte superior de la pila
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede realizar la operación pop.");
            return -1; // Retorna -1 si la pila está vacía
        } else {
            return stackArray[top--]; // Retorna el valor y decrementa el índice
        }
    }

    // Método para obtener el elemento en la parte superior de la pila sin quitarlo
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1; // Retorna -1 si la pila está vacía
        } else {
            return stackArray[top]; // Retorna el valor en la parte superior
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == -1; // Verdadero si no hay elementos en la pila
    }

    // Método para verificar si la pila está llena
    public boolean isFull() {
        return top == maxSize - 1; // Verdadero si la pila está llena
    }
}
