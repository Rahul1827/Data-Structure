package PracticeQuestion20October;



import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adjacencyList.putIfAbsent(u, new ArrayList<>());
        adjacencyList.putIfAbsent(v, new ArrayList<>());
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public int countEdges() {
        int totalEdges = 0;
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            totalEdges += entry.getValue().size();
        }
        return totalEdges / 2;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        System.out.println("Total number of edges: " + graph.countEdges());
    }
}
