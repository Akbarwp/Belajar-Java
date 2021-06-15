package com.Tugas;

import java.util.*;

public class BinaryTree {

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
    BinaryTree() {
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
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        /*
         * Contoh kita ingin membuah tree sebagai berikut 60 / \ 20 70 / \ 10 40 / \ 30
         * 50
         * 
         */
        tree.insert(60);
        tree.insert(20);
        tree.insert(70);
        tree.insert(10);
        tree.insert(40);
        tree.insert(30);
        tree.insert(50);

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
