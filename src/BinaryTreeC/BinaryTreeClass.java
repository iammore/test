package BinaryTreeC;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeClass {

    // Binary Tree in Java

    // Node creation
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static class  BinaryTree {
        Node root;

     /*   BinaryTree(int key) {
            root = new Node(key);
        }*/

        BinaryTree() {
            root = null;
        }
List<Integer> list=new ArrayList<>();
        // Traverse Inorder
        public List<Integer> traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                list.add(node.key);
                System.out.print(" " + node.key);
                traverseInOrder(node.right);
            }
        return list;}

        // Traverse Postorder
        public void traversePostOrder(Node node) {
            if (node != null) {
                //System.out.println("left side "+node.left);
                traversePostOrder(node.left);
              //  System.out.print(" left key-" + node.key);
                traversePostOrder(node.right);
              //  System.out.print(" right key-" + node.key);
                System.out.print(" " + node.key);
            }
        }

        // Traverse Preorder
        int count=0;
        int maxCount=0;
        public void traversePreOrder(Node node) {

            if (node != null) {
                count++;
                System.out.print(" " + node.key);
                traversePreOrder(node.left);

                traversePreOrder(node.right);


            }
           // System.out.println("count is "+count++);
            if (count>maxCount){
                maxCount=count;
                count=0;
                System.out.println("max count is "+maxCount);
            }


        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();

            tree.root = new Node(3);
            tree.root.left = new Node(9);
            tree.root.right = new Node(20);
           /* tree.root.left.left = new Node(3);
            tree.root.left.right = new Node(5);*/
            tree.root.right.left = new Node(15);
            tree.root.right.right = new Node(7);

            System.out.print("Pre order Traversal: ");
            tree.traversePreOrder(tree.root);
            System.out.print("\nIn order Traversal: ");
          List<Integer> list1=new ArrayList<>();
            list1=tree.traverseInOrder(tree.root);
            System.out.println(list1);
            System.out.print("\nPost order Traversal: ");
            tree.traversePostOrder(tree.root);
        }
    }
}
