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
public class Codificador {
    //son static para que puedan ser accedidos desde cualquier parte del código
     private static char charArray[]; //el texto lo convertimos en arreglos de chars
     private static int tabla[] = new int[0x7f]; //contiene la frecuencia del objeto
     private static Nodo_Bin miNodo[]; //es la cola de prioridad principal, el árbol final generado se almacena en el punto 0.
     private static int sizeTabla = 0;// el size de la tabla que contiene los caractares 
     private static Arbol_Bin miArbol; //variable para la clase ARBOL_BIN
     private static int sizedelNodo = 0;
     public static Decodificador hC; //la clase responsable para decodificar el Arbol Binario

    public Codificador(String texto) {
        /*frequencyTable(value);
        nodeArrange();
        Node x = createTree();
        hC = new HuffmanTransversor(x, charArray);*/
    }
    
    public static void Tabla_frecuencia(String texto) {
        int i;
        charArray = texto.toCharArray();
        for (i = 0; i < charArray.length; i++) {
            tabla[getAscii(charArray[i])] += 1;
        }
    }
    
    public static int getAscii(char substringValue) {
        return substringValue & 0x7f;
    }
    
      private static void sort() {
        Nodo_Bin temp;
        for (int i = sizedelNodo - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (miNodo[j].frecuencia > miNodo[j + 1].frecuencia) {
                    temp = miNodo[j + 1];
                    miNodo[j + 1] = miNodo[j];
                    miNodo[j] = temp;
                }

                if (miNodo[j].frecuencia == miNodo[j + 1].frecuencia && miNodo[j].izquierda != null) {
                    temp = miNodo[j + 1];
                    miNodo[j + 1] = miNodo[j];
                    miNodo[j] = temp;
                }
            }
        }
    }
    
    public static void OrdenarNodo() {
        int cont = 0;
        int j = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > 0) {
                cont++;
            }
        }

        sizeTabla = cont;
        cont = 0;
        miNodo = new Nodo_Bin[sizeTabla];

        for (int i = 0; i < 127; i++) {
            if (tabla[i] != 0) {
                miNodo[cont] = new Nodo_Bin(tabla[i], (char) i, null, null);
                cont++;
            }
        }
        sizedelNodo = miNodo.length;
        sort();

    }

    public static Nodo_Bin crearArbol() {
        for (int i = 1; i < sizedelNodo; i++) {
            try {
                if (miNodo[1].frecuencia >= miNodo[0].frecuencia) {
                    miArbol = new Arbol_Bin(miNodo[0], miNodo[i]);
                    miNodo[0] = miArbol;
                    moverObjects(i, sizedelNodo);
                    sizedelNodo -= 1;
                    i -= 1;
                    sort();
                } else {
                    if (i + 1 < sizedelNodo) {
                        miArbol = new Arbol_Bin(miNodo[i], miNodo[i + 1]);
                        miNodo[1] = miArbol;
                        moverObjects(i + 1, sizedelNodo);
                        sort();
                        sizedelNodo -= 1;
                        i -= 1;
                    } else {
                        miNodo[1] = miNodo[i];
                        miNodo[0] = new Arbol_Bin(miNodo[0], miNodo[1]);
                    }
                }
            } catch (Exception e) {
                
            }
        }
        return miNodo[0];
    }

    private static void moverObjects(int index, int length) {
        try {
            for (int i = index; i < length; i++) {
                miNodo[i] = miNodo[i + 1];
            }

        } catch (Exception e) {
            //See...this program is uncrashable...lol
        }
    } 
     

}
