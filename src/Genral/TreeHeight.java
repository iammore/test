package Genral;

public class TreeHeight {
 static    int height=0;
   static int maxHeight;
    static class Node {
        int item;
        Node left, right;

        public Node(int key) {
            item = key;
            left = right = null;
        }
    }
        static class BinaryTree {
            // Root of Binary Tree
            Node root;

            BinaryTree() {
                root = null;
            }

        }
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(12);
            tree.root.right = new Node(9);
            tree.root.left.left = new Node(5);
            tree.root.left.right = new Node(6);
            tree.root.left.right.right = new Node(6);
            tree.root.left.right.right.right= new Node(6);
            findHeight(tree.root);
        }
        public static void findHeight(Node node){

        if (node==null){
            return;
        }

        if (node.left!= null){
            System.out.println(height);
            height++;
            findHeight(node.left);
        }
            if (height>maxHeight){
                System.out.println("maxHeight is "+maxHeight);
                maxHeight=height;
            }
            System.out.println("max is "+maxHeight);
        height=0;
        if(node.right!=null){
            System.out.println("in right side "+height);
            height++;
            findHeight(node.right);
        }
        if (height>maxHeight){
            System.out.println("maxHeight is "+maxHeight);
            maxHeight=height;
        }

            System.out.println(maxHeight);
        }
}
