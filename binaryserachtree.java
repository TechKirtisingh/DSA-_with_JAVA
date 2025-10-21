class BinarySearchTree  
{
    class Node   
    {  
        int data;  
        Node left, right;  
  
        public Node(int item)  
        {  
            data = item;  
            left = right = null;  
        }  
    }  
  
    Node root;  
  
    BinarySearchTree()   
    {  
        root = null;  
    }  
  
    void insert(int data)   
    {  
        root = insertRec(root, data);  
    }  
  
    Node insertRec(Node root, int data)   
    {  
        if (root == null)   
        {  
            root = new Node(data);  
            return root;  
        }  
        if (data < root.data)  
            root.left = insertRec(root.left, data);  
        else if (data > root.data)  
            root.right = insertRec(root.right, data);  
  
        return root;  
    }  
  
    void inorder()   
    {  
        inorderRec(root);  
    }  
  
    void inorderRec(Node root)   
    {  
        if (root != null)   
        {  
            inorderRec(root.left);  
            System.out.print(root.data + " ");  
            inorderRec(root.right);  
        }  
    }  
  
    public static void main(String[] args)   
    {  
        BinarySearchTree bst = new BinarySearchTree();  
  
        bst.insert(50);  
        bst.insert(30);  
        bst.insert(20);  
        bst.insert(40);  
        bst.insert(70);  
        bst.insert(60);  
        bst.insert(80);  
  
        System.out.println("Inorder traversal of the given tree");  
        bst.inorder();  
    }
}
