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
public class Decodificador {
    private Nodo_Bin raizNodo;
    private char c;
    private char charArray[];//el texto lo convertimos en arreglos de chars
//    private int i = 0;
    public String binario_final = "";

    public Decodificador(Nodo_Bin nodo, char[] charArray) {
        String temp;
//        int i;
        this.charArray = charArray;
        for (int i = 0; i < charArray.length; i++) {
            temp = binario(raizNodo, "", charArray[i]);
            binario_final += temp + " ";
            System.out.println("Valores: " + charArray[i] + " " + temp);
        }
    }
    
     public String binario(Nodo_Bin raizNodo, String texto, char char_text) {
        String bin_final = "";
        if (raizNodo != null) {//si no esta vacio el Nodo raiz
            if (raizNodo.izquierda != null) { //si el izquierdo no esta vacio
                bin_final = binario(raizNodo.izquierda, texto + "0", char_text);
            }
            if (raizNodo.c == char_text) {
                return bin_final;
            } else {
                if (bin_final == "") {
                    return binario(raizNodo.derecha, texto + "1", char_text);
                } else {
                    return bin_final;
                }
            }
        } else {
            return "";
        }
    }
    
}
