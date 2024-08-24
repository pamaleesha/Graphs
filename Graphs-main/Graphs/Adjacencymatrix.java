//dAdjacency Matrix Representation
class GraphAdjMatrix {
    private final int vertices;
    private final boolean[][] adjMatrix;

    // Constructor
    public GraphAdjMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new boolean[vertices][vertices];
    }

    // Add edge
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = true;
        adjMatrix[dest][src] = true; // For undirected graph
    }

    // Remove edge
    public void removeEdge(int src, int dest) {
        adjMatrix[src][dest] = false;
        adjMatrix[dest][src] = false; // For undirected graph
    }

    // Print the adjacency matrix
    public void printMatrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}
