package tree;

public class BinaryTree {
	private Tree tree;  
	 private Queue queue;  
	   
	 public BinaryTree(){  
	  tree = new Tree();  
	 }  
	//������  
	 public void insertNode(TreeNode node){  
	  if(tree.getNode()==null){  
	   tree.setNode(node);  
	   return;  
	  }  
	  else{  
	   queue = new Queue();  
	   queue.enQueue(tree.getNode());  
	   while(!queue.isEmpty()){  
	    TreeNode temp = queue.outQueue();  
	    if(temp.getLeftchild()==null){  
	     temp.setLeftchild(node);  
	     return;  
	    }  
	    else if(temp.getRightchild()==null){  
	     temp.setRightchild(node);  
	     return;  
	    }  
	    else {  
	     queue.enQueue(temp.getLeftchild());  
	     queue.enQueue(temp.getRightchild());  
	    }  
	   }  
	  }  
	 }  
	 //�������  
	 public void midOrder(TreeNode node){  
	  if(node!=null){  
	   this.midOrder(node.getLeftchild());  
	   System.out.println(node.getValue());  
	   this.midOrder(node.getRightchild());  
	  }  
	 }  
	  
	 //ǰ�����  
	  
	 public void frontOrder(TreeNode node){  
	  if(node !=null){  
	   System.out.println(node.getValue());  
	   frontOrder(node.getLeftchild());  
	   frontOrder(node.getRightchild());  
	  }  
	 }  
	  //�������  
	  
	 public void lastOrder(TreeNode node){  
	  if(node != null){  
	   this.lastOrder(node.getLeftchild());  
	   this.lastOrder(node.getRightchild());  
	   System.out.println(node.getValue());  
	  }  
	 }  
	 
	 public void TreeLevel(TreeNode node,int n){
		 if(node == null){
			 return;
		 }
		 if(n<=0){
			 System.err.println("�����쳣��ֻ�ܲ���������");
			 return;
		 }
		 if(n>getMaxLevel(node)){
			 System.out.print("null");
			 return;			 
		 }
		 if(n==1){
			 System.out.print(node.getValue());
		 }else{
			 TreeLevel(node.getLeftchild(),n-1);
			 TreeLevel(node.getRightchild(),n-1);
		 }
		 
	 }
	   
	 private int getMaxLevel(TreeNode node) {
		 int i=0;
		 while(node!=null){
			 i++;
			 node = node.getLeftchild();
		 }
		return i;
	}
	public Tree getTree(){  
	  return tree;  
	 }  

}
