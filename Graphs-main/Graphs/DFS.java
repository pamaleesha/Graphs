// Depth-First Search (DFS) in Adjacency List
class DFS {
    private final int vertices;
    private final LinkedList<Integer>[] adjList;
    private final boolean[] visited;

    // Constructor
    public DFS(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // For undirected graph
    }

    // DFS utility function
    private void dfsUtil(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor);
            }
        }
    }

    // Perform DFS traversal
    public void dfs(int startVertex) {
        System.out.print("DFS starting from vertex " + startVertex + ": ");
        dfsUtil(startVertex);
        System.out.println();
    }
}
