package proyecto_edd;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class Prueba_Grafo {
    
    public static void main(String[] args) {
        Graph graph = new SingleGraph("Prueba");
        
        /*graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");*/
        
        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");
        
        graph.display();
    }   
}