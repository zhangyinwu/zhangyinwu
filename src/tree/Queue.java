package tree;

import java.util.LinkedList;

public class Queue {
	 private LinkedList<TreeNode> list;  
	 public LinkedList<TreeNode> getList() {  
	  return list;  
	 }  
	 public void setList(LinkedList<TreeNode> list) {  
	  this.list = list;  
	 }  
	 public Queue(){  
	  list = new LinkedList<TreeNode>();  
	 }  
	 public void enQueue(TreeNode node){  
	  list.add(node);  
	 }  
	 public TreeNode outQueue(){  
	  return list.removeFirst();  
	 }  
	 public boolean isEmpty(){  
	  return list.isEmpty();  
	 }  
}
