public class Nodo<T> {

    //<T>significa tipo generico, valdria cualquier tipo
    private T elemento;
    private Nodo<T> siguiente;
    public Nodo(T elemento, Nodo<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "elemento=" + elemento +
                ", siguiente=" + siguiente +
                '}';
    }
}
