/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Nodo<T> {

    private T datos;
    private Nodo siguiente;
    private Nodo anterior;

    //CONSTRUCTOR
    public Nodo(T dat) {
        this.datos = dat;
        this.siguiente = null;
        this.anterior = null;
    }

    //GETTER
    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public T getDatos() {
        return datos;
    }

    //SETTER
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return datos.toString();
    }

}
