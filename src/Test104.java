import java.util.Scanner;

import javax.swing.tree.TreeNode;


public class Test104 {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int x) {
	        val = x;
	    }
	}
	//递归求解思想 不断的进行遍历整棵树
	 public int maxDepth(TreeNode root) {
	      if(root==null){
	    	  return 0;
	      }
	      else if(root.left==null &&root.right==null){
	    	  return 1;
	      }
	      else{
	    	  int left = maxDepth(root.left);
	            int right = maxDepth(root.right);
	            return 1 + (left > right ? left : right);
	      }
	    }
public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	TreeNode root;
}
}
