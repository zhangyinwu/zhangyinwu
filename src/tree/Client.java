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
		  System.out.println("�������");  
		  binaryTree.frontOrder(node);  
		  System.out.println("�������");  
		  binaryTree.midOrder(node);  
		  System.out.println("�������");  
		  binaryTree.lastOrder(node); 
		  
	  System.out.println("��n��  n = 0�����");
		  binaryTree.TreeLevel(node, 0);
	  System.out.println("��n��  n = 1�����");
	  binaryTree.TreeLevel(node, 1);
		  System.out.println("��n��  n = 2�����");
	  binaryTree.TreeLevel(node, 2);
	  System.out.println("��n��  n = 3�����");
  binaryTree.TreeLevel(node, 3);
	  System.out.println("��n��  n = 4�����");
	  binaryTree.TreeLevel(node, 4);
		  System.out.println("��n��  n =5�����");
		  binaryTree.TreeLevel(node, 5);
		 }  
}
