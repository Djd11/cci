package TreesAndGraphs;

import java.util.LinkedList;

public class PeopleNode {

    int age;
    String name;
    String gender;

    public PeopleNode(String name, int age, String gender){

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    class Graph{

        int V;
        LinkedList<PeopleNode> adjacencylist [];

        public Graph(int V){

            for(int v =0;v<V;v++){
                adjacencylist[v] = new LinkedList<PeopleNode>();
            }
        }

        public void addEdges(Graph graph,int indexofSrc, PeopleNode personB){

            graph.adjacencylist[indexofSrc].addFirst(personB);
        }

        public void print(Graph graph){

            for(int i =0;i<=graph.V;i++){

                System.out.print("Head node :");
                for(PeopleNode node : graph.adjacencylist[i]){
                    System.out.print(node.name +" -->");
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}


