// Adjacency List Representation
import java.util.*;

class GraphAdjList {
    private final int vertices;
    private final LinkedList<Integer>[] adjList;

    // Constructor
    public GraphAdjList(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // For undirected graph
    }

    // Remove edge
    public void removeEdge(int src, int dest) {
        adjList[src].remove(Integer.valueOf(dest));
        adjList[dest].remove(Integer.valueOf(src)); // For undirected graph
    }

    // Print the adjacency list
    public void printAdjList() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int j : adjList[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
