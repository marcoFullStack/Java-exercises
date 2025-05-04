import java.util.LinkedList;
import java.util.Queue;

//﻿Vamos a realizar una cola dinamica en Java, estos son los métodos:
//
//        - isEmpty(): indica si la lista esta o no vacia
//  - size(): devuelve el tamaño de la lista
//  - primero(): devuelve el elemento que esta en primer lugar
//  - dequeue(): quita el primer elemento y lo devuelve
//  - enqueue(T elemento): inserta el elemento y devuelve el elemento insertado
//  - toString():
//
//La clase nodo será la misma utilizada en el video anterior.
public class main {
    public static void main(String[] args) {
        ColaDinamica<Integer>cola=new ColaDinamica<>();
        System.out.println("El tamaño es "+cola.size());
        System.out.println("Esta vacia? "+cola.isEmpty());
    cola.enqueue(3);
    cola.enqueue(2);
    cola.enqueue(10);
    cola.enqueue(25);
        System.out.println("El tamaño es "+cola.size());
        System.out.println("Esta vacia? "+cola.isEmpty());
        System.out.println("El primero es "+cola.primero());
        System.out.println("Quitamos elemento"+cola.dequeue());
        System.out.println("Quitamos elemento"+cola.dequeue());
        System.out.println("Quitamos elemento"+cola.dequeue());
        System.out.println("Quitamos elemento"+cola.dequeue());
        System.out.println("El tamaño es "+cola.size());
        System.out.println("Esta vacia? "+cola.isEmpty());
        System.out.println();
        System.out.println("Uso cola generica");
        System.out.println();
        Queue<Integer> q=new LinkedList<>();
        System.out.println("El tamaño es "+q.size());
        System.out.println("Esta vacia? "+q.isEmpty());
        q.offer(3);
        q.offer(2);
        q.offer(10);
        q.offer(25);
        System.out.println("El tamaño es "+q.size());
        System.out.println("Esta vacia? "+q.isEmpty());
        System.out.println("El primero es "+q.peek());
        System.out.println("Quitamos elemento"+q.poll());
        System.out.println("Quitamos elemento"+q.poll());
        System.out.println("Quitamos elemento"+q.poll());
        System.out.println("Quitamos elemento"+q.poll());
        System.out.println("El tamaño es "+q.size());
        System.out.println("Esta vacia? "+q.isEmpty());

    }
}
