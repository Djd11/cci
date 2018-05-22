package TreesAndGraphs;

import java.util.ArrayList;
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
    boolean[] visitedArray ;
    public Graph(int V){

        /*
            An array size of vertices or node,
            each index of Array[i] will represent a link list node with data as Integer
         */
        visitedArray = new boolean[V];
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
    public void addEdge(int src,int dest){

            adjacencyList[src].add(dest);

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

    /*
    DFS Go to each of node branch before going to it's neighbour
    it's implementation is recursion based.

     */


    public void DFS(int v){


        visitedArray[v] = true;

        Iterator<Integer> integerIterator = adjacencyList[v].listIterator();
        System.out.print(v+ " ");
        while(integerIterator.hasNext()){

            int n = integerIterator.next();
            if(!visitedArray[n]){
                DFS(n);
            }
        }

    }

    /*
    BFS
    Go to each  neighbour then go to each its neighbours branch
    it's implementation is uses a queue
     */


    public void BFS(int v){

        boolean visited[] = new boolean[V];
        visited[v] = true;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        System.out.print("BFS search ");
        while(queue.size()!=0){

            // Dequue it and print
            v = queue.poll();
            System.out.print(v+ " ");
            Iterator<Integer> iterator = adjacencyList[v].listIterator();
            while(iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);

                }
            }

        }

    }

    public void DetectCycle(int v){

        visitedArray[v] = true;
        boolean[] nodeCount = new boolean[V];
        Iterator<Integer> integerIterator = adjacencyList[v].listIterator();
        System.out.print(v+ " ");

        while(integerIterator.hasNext()){

            int n = integerIterator.next();
            nodeCount[n]=true;
            if(!visitedArray[n] && nodeCount[n]){
                DetectCycle(n);
                System.out.println("cycle "+n);
            }


        }

    }
    public static void main(String[] args) {

        Graph graph = new Graph(4);

        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,0);
        graph.addEdge(3,3);
//        graph.addEdge(3,3);
//        graph.addEdge(0,1);
//        graph.addEdge(0,1);


        graph.printGraph(graph);
        graph.BFS(1);
//        System.out.println();
        System.out.print("DFS search ");
        graph.DFS(1);
//        graph.DetectCycle(0);
    }

}
