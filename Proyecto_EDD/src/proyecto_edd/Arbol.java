/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_edd;

/**
 *
 * @author Usuario Dell
 */
public class Arbol {

    private Nodo raiz;

    public Arbol() {
        this(null);
    }

    public Arbol(Nodo raiz) {
        this.setRaiz(raiz);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

}
