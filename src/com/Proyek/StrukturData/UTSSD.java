package com.Proyek.StrukturData;

import java.io.*;
import java.util.*;;

public class UTSSD {

    /* Class untuk mengisi daun kanan dan kiri */
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Sebagai akar tree
    Node root;

    // Constructor
    UTSSD() {
        root = null;
    }

    // Insert akar tree
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* Fungsi Rekursif untuk memasukkan new key */
    Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Untuk menaruh leaf apakah di kiri atau kanan */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // Method PreOrder
    void preorder() {
        preorderRec(root);
    }

    // Fungsi PreOrder traversal dari BinaryTree
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + ", ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Method InOrder
    void inorder() {
        inorderRec(root);
    }

    // Fungsi InOrder traversal dari BinaryTree
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + ", ");
            inorderRec(root.right);
        }
    }

    // Method PostOrder
    void postorder() {
        postorderRec(root);
    }

    // Fungsi PostOrder traversal dari BinaryTree
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + ", ");
        }
    }

    // Method LevelOrder
    void levelorder() {
        levelorderRec(root);
    }

    // Fungsi LevelOrder traversal dari BinaryTree
    void levelorderRec(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                Node current = queue.poll();
                System.out.print(current.key + ", ");
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }

    // Test Program nya
    public static void main(String[] args) throws IOException {

        UTSSD tree = new UTSSD();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String h = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] hu = h.toCharArray();
        int[][] nilai = new int[30][30];
        int n = 1;

        for (int j = 0; j < 26; j++) {

            hu[j] = h.charAt(j);
            nilai[0][j] = n;
            n++;
        }

        String input, huruf2;
        int pj;

        System.out.print("Masukkan Nama Anda: ");
        input = br.readLine();
        huruf2 = input.toUpperCase();
        char[] arrHuruf = huruf2.toCharArray();
        pj = arrHuruf.length;

        for (int i = 0; i < pj; i++) {

            for (int k = 0; k < 26; k++) {

                if (arrHuruf[i] == hu[k]) {

                    nilai[1][i] = nilai[0][k];
                }
            }
        }
        System.out.println("");

        System.out.println("Nama: " + huruf2);
        System.out.println("Banyak huruf: " + pj);

        for (int j = 0; j < pj; j++) {

            System.out.println("Huruf " + arrHuruf[j] + " urutan ke-" + (j + 1) + " bernilai: " + nilai[1][j]);
        }
        System.out.println("");

        System.out.print("Array Nama: {");
        System.out.print(nilai[1][0] + ", ");
        for (int d = 1; d < pj; d++) {

            if ((d + 1) < pj) {

                System.out.print(nilai[1][d] + ", ");
            } else {

                System.out.print(nilai[1][d] + "");
            }
        }
        System.out.print("}");
        System.out.println("");

        int x = 0;

        if (pj % 2 == 0) {

            x = pj / 2 - 1;

        } else if (pj % 2 == 1) {

            x = pj / 2;
        }

        System.out.println("Key: " + nilai[1][x]);

        System.out.println("");

        tree.insert(nilai[1][x]);
        for (int c = 0; c < pj; c++) {

            tree.insert(nilai[1][c]);
        }
        System.out.println("");

        // Print hasil akhir nya
        System.out.println("Depth First Order (PreOrder): ");
        tree.preorder();
        System.out.println("");
        System.out.println("Symetric Order (InOrder): ");
        tree.inorder();
        System.out.println("");
        System.out.println("PostOrder: ");
        tree.postorder();
        System.out.println("");
        System.out.println("LevelOrder: ");
        tree.levelorder();
        System.out.println("");

    }
}
