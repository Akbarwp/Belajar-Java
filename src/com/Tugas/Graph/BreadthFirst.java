package com.Tugas.Graph;

import java.util.*;

public class BreadthFirst {

    private int V;
    private LinkedList<Integer> adj[];

    BreadthFirst(int v) {

        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {

        adj[v].add(w);
    }

    void BFS(int s) {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {

            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {

                int n = i.next();
                if (!visited[n]) {

                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        BreadthFirst g = new BreadthFirst(5);
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
        System.out.println("Breadth First Traversal: ");

        g.BFS(v);
    }

}
