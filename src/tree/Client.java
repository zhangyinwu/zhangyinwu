package tree;

public class Client {
	public static void main(String[] args) {  
		  BinaryTree binaryTree = new BinaryTree();  
		  TreeNode[] nodes = new TreeNode[10];  
		  for(int i =0;i<nodes.length;i++){  
		   nodes[i] = new TreeNode();  
		   nodes[i].setValue(i);  
		   binaryTree.insertNode(nodes[i]);  
		  }  
		  TreeNode node = binaryTree.getTree().getNode();
		  System.out.println("先序遍历");  
		  binaryTree.frontOrder(node);  
		  System.out.println("中序遍历");  
		  binaryTree.midOrder(node);  
		  System.out.println("后序遍历");  
		  binaryTree.lastOrder(node); 
		  
	  System.out.println("第n层  n = 0的情况");
		  binaryTree.TreeLevel(node, 0);
	  System.out.println("第n层  n = 1的情况");
	  binaryTree.TreeLevel(node, 1);
		  System.out.println("第n层  n = 2的情况");
	  binaryTree.TreeLevel(node, 2);
	  System.out.println("第n层  n = 3的情况");
  binaryTree.TreeLevel(node, 3);
	  System.out.println("第n层  n = 4的情况");
	  binaryTree.TreeLevel(node, 4);
		  System.out.println("第n层  n =5的情况");
		  binaryTree.TreeLevel(node, 5);
		 }  
}
