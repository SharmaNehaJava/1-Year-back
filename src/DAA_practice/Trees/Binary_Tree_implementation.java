package DAA_practice.Trees;

import java.util.*;
public class Binary_Tree_implementation {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       BinaryTree t = new BinaryTree();
//       t.insert(1);
//       t.insert(2);
//       t.insert(3);
//       t.insert(4);
//       t.insert(5);

       t.insert(10);
       t.insert(5);
       t.insert(15);
       t.insert(3);
       t.insert(7);


       t.inOrderTraversal(t.root);
   }
   public static class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val){
           this.val = val;
           left =null;
           right = null;
       }
   }
   public static class BinaryTree{
       TreeNode root;
       BinaryTree(){
           root = null;
       }
       BinaryTree(int val){
           root=new TreeNode(val);
       }
       public void insert(int val){
           root = insertNode(root, val);
       }
       public static TreeNode insertNode(TreeNode node, int val){
           if(node==null){
               return new TreeNode(val);
           }
           if(val<node.val){
               node.left = insertNode(node.left, val);
           }else if(val>node.val){
               node.right = insertNode(node.right, val);
           }
           return node;
       }
       public static TreeNode inOrderTraversal(TreeNode node){
           if(node==null){
//               System.out.print("-1"+" ");
               return node;
           }
           inOrderTraversal(node.left);
           System.out.print(node.val+" ");
           inOrderTraversal(node.right);

           return node;
       }
   }
}
