import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tree1.TreeNode;
import tree1.TreeNode.Node;


public class Test3 {
	@Test
	public void test() throws Exception {
		TreeNode treeNode=new TreeNode();
		Node node=treeNode.createTreeNode("abd##e##cf##g##");
		String result1 =treeNode.getNode(node, 3);
		String result2 =treeNode.getNode(node, 2);
		//String result3 =treeNode.getNode(node, 5);
		//用例1
		assertEquals("defg", result1);
		//用例2
		assertEquals("bc", result2);
		treeNode.reIndex();
		Node node1 =treeNode.createTreeNode("abc####");
		String result3 = treeNode.getNode(node1, 2);
		//用例3
		assertEquals("b", result3);
		treeNode.reIndex();
		Node node2 =treeNode.createTreeNode("abd###c##");
		String result4 = treeNode.getNode(node2, 3);
		//用例4
		assertEquals("d", result4);
		
	}

}
