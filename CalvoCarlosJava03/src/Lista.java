
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carlo
 */
public class Lista <T>{

    private Nodo inicio;
    private Nodo fin;
    private Nodo actual;

    public Lista() {
    }
    
    //Getter
    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public Nodo getActual() {
        return actual;
    }

    //Setter
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public void setActual(Nodo actual) {
        this.actual = actual;
    }
    

    //Insertar cuentas
    public int insertar(int num, int saldo, String titular) {
        Nodo nuevo = new Nodo(new Cuenta(num, saldo, titular));

        if (inicio == null) {
            inicio = nuevo;
            actual=nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
        num++;
        return num;
    }

    public int insertar(int num, int saldo, String titular, int d, int m, int a) {
        Nodo nuevo = new Nodo(new Cuenta(num, saldo, titular, d, m, a));

        if (inicio == null) {
            inicio=nuevo;
            actual=nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
        num++;
        return num;
    }

    //Crea cuentas base
    public int crearCuenta(int num) {
        int num2 = num;
        num2 = insertar(num2, 1800, "Carlos", 15, 12, 2022);
        num2 = insertar(num2, 29000, "Pablo", 9, 3, 2020);
        num2 = insertar(num2, 15000, "Alberto");
        num2 = insertar(num2, 23000, "Rafa", 18, 4, 2021);
        num2 = insertar(num2, 45678, "Paula");

        return num2;
    }

    //Añadir una cuenta         //Beta
    public int nuevaCuenta(int num) {
        int num2 = num;
        num2 = insertar(num2, 1800, "Carlos", 15, 12, 2022);

        return num2;
    }

    //Avanzar
    public Nodo avanza(Nodo aux) {
        aux = aux.getSiguiente();

        return aux;
    }

    //Retroceder
    public Nodo retrocede(Nodo aux) {

        aux = aux.getAnterior();

        return aux;
    }

    //toString
    public String toStringSiguiente() {
        String lista = "";
        Nodo aux = inicio;

        while (aux != null) {
            lista = aux.toString() + "\n\n" + lista;
            aux = avanza(aux);
        }

        return lista;
    }

    public String toStringAnterior() {
        String lista = "";
        Nodo aux = fin;

        while (aux != null) {
            lista = aux.toString() + "\n\n" + lista;
            aux = retrocede(aux);
        }

        return lista;
    }

}
