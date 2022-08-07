package Genral;

import BinaryTreeC.BinaryTreeClass;

public class BTDepth {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode();

        tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
           /* tree.root.left.left = new Node(3);
            tree.root.left.right = new Node(5);*/
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
        System.out.println(maxDepth(tree));
    }

    static class  TreeNode{
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+ Math.max(left,right);
    }
}
