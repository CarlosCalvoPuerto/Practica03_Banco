
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author carlo
 */
public class Cuenta {

    //ATRIBUTOS
    private int num;
    private int saldo;
    private GregorianCalendar fecha;
    private String titular;

    Cuenta() {
        this.num = 0;
        this.saldo = 0;
        this.titular = "";
        this.fecha = new GregorianCalendar();
    }

    
    Cuenta(int n, int s, String t) {
        this();
        this.num = n;
        this.saldo = s;
        this.titular = t;
    }

    Cuenta(int n, int s, String t, int d, int m, int a) {
        this(n, s, t);
        this.fecha = new GregorianCalendar(d, m, a);
    }

    public String toString() {
        String imprime = "Numero Cuenta: \t" + getNum();
        imprime += "\nTitular: \t\t" + getTitular();
        imprime += "\nSaldo: \t\t\t" + getSaldo();
        imprime += "\nFecha Apertura: \t" + getFecha();

        return imprime;
    }

    //GETTER
    public int getNum() {
        return num;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getFecha() {
        return this.fecha.get(Calendar.DAY_OF_MONTH) + "/" //Dia
                + (this.fecha.get(Calendar.MONTH) + 1) + "/" //Mes
                + this.fecha.get(Calendar.YEAR);            //Año
    }

    public String getTitular() {
        return titular;
    }

    //SETTER
    public void setNum(int num) {
        this.num = num;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setFecha(int d, int m, int a) {
        this.fecha = new GregorianCalendar(d, m, a);
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
