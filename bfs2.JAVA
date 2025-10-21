// TRAVERSING A GRAPH USING BFS.........
// bfs is breadth first search : traversing a graph level by level
// using queue data structure
// here we make mannual binary tree and traverse it using bfs

import java.util.*;['']

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class bfs2 {

    static void bfs(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();                     // create a queue
        q.add(root);                                            // add root to queue                    

        while (!q.isEmpty()) {                                  // iterate till queue is not empty
            Node curr = q.remove();                             // remove the front element from queue and store in curr
            System.out.print(curr.data + " ");                  // print curr

            if (curr.left != null) {                           // check if left child is null or not             
                q.add(curr.left);                              // add left child to queue     
            }

            if (curr.right != null) {                       // check if right child is null or not                          
                q.add(curr.right);                         // add right child to queue                    
            }
        }
    } 

    public static void main(String[] args) {
        Node root = new Node(1);                               // create a binary tree as input
        root.left = new Node(2);                               //
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        bfs(root);
        System.out.println();
    }
}
