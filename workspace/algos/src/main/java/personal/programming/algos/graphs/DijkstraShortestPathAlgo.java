package personal.programming.algos.graphs;

public class DijkstraShortestPathAlgo {

    static final int v = 9;

    public static void main(String[] args)
    {
        /* Let us create the example graph discussed above */
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        DijkstraShortestPathAlgo dijkstraShortestPathAlgo = new DijkstraShortestPathAlgo();
        dijkstraShortestPathAlgo.dijkstra(graph, 0);
    }

    void dijkstra(int graph[][], int source)
    {
        int distance[] = new int[v];
        Boolean visited[] = new Boolean[v];

        for (int i = 0; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        distance[source] = 0;

        for (int count = 0; count < v - 1; count++) {
            int u = minDistance(distance, visited);
            visited[u] = true;
            for (int vi = 0; vi < v; vi++)
                if (!visited[vi] && graph[u][vi] != 0 && distance[u] != Integer.MAX_VALUE && distance[u] + graph[u][vi] < distance[vi])
                    distance[vi] = distance[u] + graph[u][vi];
        }

        printSolution(distance);
    }

    void printSolution(int dist[])
    {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < v; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    int minDistance(int distance[], Boolean visited[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int vi = 0; vi < v; vi++)
            if (visited[vi] == false && distance[vi] <= min) {
                min = distance[vi];
                minIndex = vi;
            }

        return minIndex;
    }

}
