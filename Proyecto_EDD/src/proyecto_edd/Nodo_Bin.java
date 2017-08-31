/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_edd;

/**
 *
 * @author usuario
 */
public class Nodo_Bin {
    
    private int valor;
 
    private Nodo_Bin padre;
    private Nodo_Bin hojaIzquierda;
    private Nodo_Bin hojaDerecha;
 
    /* Constructor */
    public Nodo_Bin(int valor) {
        this.valor = valor;
    }
 
    /* Setters y Getters */
    public void setValor(int valor) {
        this.valor = valor;
    }
 
    public int getValor() {
        return valor;
    }
 
    public Nodo_Bin getPadre() {
        return padre;
    }
 
    public void setPadre(Nodo_Bin padre) {
        this.padre = padre;
    }
 
    public Nodo_Bin getHojaIzquierda() {
        return hojaIzquierda;
    }
 
    public void setHojaIzquierda(Nodo_Bin hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }
 
    public Nodo_Bin getHojaDerecha() {
        return hojaDerecha;
    }
 
    public void setHojaDerecha(Nodo_Bin hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
    
}
