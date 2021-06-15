package com.Tugas.Graph;

import java.util.*;

public class DepthFirst {

    private int V;
    private LinkedList<Integer> adj[];

    DepthFirst(int v) {

        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {

            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int e) {

        adj[v].add(e);
    }

    void DFSUtil(int v, boolean visited[]) {

        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();

        while (i.hasNext()) {

            int n = i.next();
            if (!visited[n]) {

                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {

        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
        System.out.println("");
    }

    public static void main(String args[]) {

        DepthFirst g = new DepthFirst(6);
        Scanner scan = new Scanner(System.in);

        g.addEdge(0, 0);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 0);
        g.addEdge(1, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 1);
        g.addEdge(2, 2);
        g.addEdge(3, 0);
        g.addEdge(3, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 1);
        g.addEdge(4, 3);
        g.addEdge(4, 4);

        System.out.print("Masukkan awal vertex: ");
        int v = scan.nextInt();
        System.out.println("Depth First Traversal: ");

        g.DFS(v);
    }
}
