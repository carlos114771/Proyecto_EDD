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
public class Arbol_Bin {
    /* Atributos */
    private Nodo_Bin raiz;
 
    /* Contructores */    
    public Arbol_Bin( int valor ) {
        this.raiz = new Nodo_Bin( valor );
    }
 
    public Arbol_Bin( Nodo_Bin raiz ) {
        this.raiz = raiz;
    }
 
    /* Setters y Getters */
    public Nodo_Bin getRaiz() {
        return raiz;
    }
 
    public void setRaiz(Nodo_Bin raiz) {
        this.raiz = raiz;
    }
}
