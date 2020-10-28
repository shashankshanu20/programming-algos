package personal.programming.algos.graphs;

import java.util.*;

public class ValidPath {
    public  String solve(int A, int B, int C, int D, ArrayList<Integer> E, ArrayList<Integer> F) {

        Graph g = new Graph((A+1)*(B+1));
        Map<Integer, Position> map = new HashMap<>();
        populateGraph(g, A, B, map);

        return bfs(g, getPosition(A, B, A), map, D, E, F) ? "YES" : "NO";
    }

    class Graph {
        private int V; // No. of vertices
        private LinkedList<Integer> adjacencyList[]; // Adjacency Lists

        // Constructor
        Graph(int v) {
            V = v;
            adjacencyList = new LinkedList[v];
            for (int i = 0; i < v; i++)
                adjacencyList[i] = new LinkedList();
        }

        // Function which adds an edge from v -> w
        void addEdge(int v, int w) {
            adjacencyList[v].add(w);
        }
    }

    private  void populateGraph(Graph g, int x, int y, Map<Integer, Position> map) {

        for(int j =0; j<= y; j++) {
            for(int i=0; i<= x; i++) {
                addNeighbours(g, i, j, x, y, map);
            }
        }

    }

    class Position {
        public int x; public int y;
        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private  void addNeighbours(Graph g, int i, int j, int x, int y, Map<Integer, Position> map) {
        map.put(getPosition(i, j, x), new Position(i, j));
        if(isNumberInGraph(i+1, j, x, y)) g.addEdge(getPosition(i, j, x), getPosition(i+1, j, x));
        if(isNumberInGraph(i+1, j+1, x, y)) g.addEdge(getPosition(i, j, x), getPosition(i+1, j+1, x));
        if(isNumberInGraph(i, j+1, x, y)) g.addEdge(getPosition(i, j, x), getPosition(i, j+1, x));
        if(isNumberInGraph(i-1, j+1, x, y)) g.addEdge(getPosition(i, j, x), getPosition(i-1, j+1, x));
        if(isNumberInGraph(i-1, j, x, y)) g.addEdge(getPosition(i, j, x), getPosition(i-1, j, x));
        if(isNumberInGraph(i-1, j-1, x, y)) g.addEdge(getPosition(i, j, x), getPosition(i-1, j-1, x));
        if(isNumberInGraph(i, j-1, x, y)) g.addEdge(getPosition(i, j, x), getPosition(i, j-1, x));
        if(isNumberInGraph(i+1, j-1, x, y)) g.addEdge(getPosition(i, j, x), getPosition(i+1, j-1, x));
    }

    private  boolean isNumberInGraph(int i, int j, int x, int y) {

        if(i < 0 || i > x) return false;
        if(j < 0 || j > y) return false;

        return true;
    }

    private  int getPosition(int i, int j, int x) {
        return j*(x+1) + i;
    }

    private  boolean bfs(Graph g, int z, Map<Integer, Position> map, int D, ArrayList<Integer> E, ArrayList<Integer> F) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        boolean isVisited[] = new boolean[z+1];
        isVisited[0] = true;
        while(!q.isEmpty()) {
            int pop = q.remove();
            if(pop == z) {
                return true;
            }
            LinkedList l = g.adjacencyList[pop];
            Iterator<Integer> it = l.listIterator();
            while(it.hasNext()) {
                int n = it.next();
                if(isVisited[n]) {
                    continue;
                }
                isVisited[n] = true;
                if(doesPointLieInAnyCircles(n, D, E, F, map)) continue;
                q.add(n);
            }
        }

        return false;
    }

    private  boolean doesPointLieInAnyCircles(int k, int D, ArrayList<Integer> E, ArrayList<Integer> F, Map<Integer, Position> map) {

        for(int i=0; i< E.size(); i++) {
            int cx = E.get(i);
            int cy = F.get(i);
            Position p = map.get(k);

            if(doesPointLieInCircle(p.x, p.y, D, cx, cy)) return true;
        }

        return false;
    }

    private  boolean doesPointLieInCircle(int i, int j, int r, int cx, int cy) {

        if(distance(i, j, cx, cy) <= r) return true;

        return false;
    }

    private  double distance(int x1, int y1, int x2, int y2)
    {
        // Calculating distance
        return Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));
    }
}
