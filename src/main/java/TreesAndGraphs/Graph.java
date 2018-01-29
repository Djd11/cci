package TreesAndGraphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    /*
        Graphs can be implemented as Adjacency matrix ie 2D array or Array of List nodes known as
        Adjacency matrix

        formar has T{0(1)} S{0{V square}}, later has T{0(V+E) S{0(V*E)}
        here we will look into the links nodes
     */

    int V;
    LinkedList<Integer> [] adjacencyList;

    public Graph(int V){

        /*
            An array size of vertices or node,
            each index of Array[i] will represent a link list node
         */
        this.V = V;
        this.adjacencyList = new LinkedList[V] ;
        for(int i =0 ; i<V;i++){
            adjacencyList[i] = new LinkedList<Integer>();
        }
    }

    /*
        Graph --> AdjacencyList --> src node --> add --> destination node
        in case of undirected graph it will bi-directional
     */
    public void addEdge(Graph graph,int src,int dest){

            graph.adjacencyList[src].addFirst(dest);
            graph.adjacencyList[dest].addFirst(src);

    }

    public void printGraph(Graph graph){

        for(int v =0;v< graph.V;v++){
            System.out.print("Head: "+v );
            for(int list : adjacencyList[v]){
                System.out.print("--> "+list);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(3);
        graph.addEdge(graph,0,1);
        graph.addEdge(graph,1,2);
        graph.addEdge(graph,2,0);
        graph.printGraph(graph);
    }

}
