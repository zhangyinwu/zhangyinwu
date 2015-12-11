package tree;

 /**
 * 该类用于构建二叉树，并且有返回二叉树某一层的全部节点的方法 
 * @author: John
 * @Class: TreeNode
 * @date: 2015年12月11日
 */
public class TreeNode {
	private int index=0;
  /**
 * 树的节点对象类
 * @author: John
 * @Class: Node
 * @date: 2015年12月11日
 */
public class Node{
	  private char value;
	  private Node lefNode;
	  private Node righNode;
  }
  /**
 * 用于将标记index清零
 * @author:John
 * @return:void
 * @exception
 * @date: 2015年12月11日
 */
public void reIndex(){
	  index=0;
  }
  
  /**
 * 用于根据传入的字符串构建二叉数
 * @author:John
 * @return:Node
 * @param str
 * @throws Exception
 * @date: 2015年12月11日
 */
public Node createTreeNode(String str) throws Exception{
	 Node node=new Node();
	  if(str==null||str==""){//对树判空
		  throw new Exception("树为空");
	  }
	  else {
		if(index<str.length()){//下标大于标记数字，给节点赋值
			node.value=str.charAt(index);
		}
		if(str.charAt(++index) != '#'){
			node.lefNode=createTreeNode(str);
		}
		if(str.charAt(++index) != '#'){
			node.righNode=createTreeNode(str);
		}
		return node;
	}
  }
  /**
 * @author:John
 * @return:String
 * @param node
 * @param len
 * @throws Exception
 * @date: 2015年12月11日
 */
public String getNode(Node node , int len) throws Exception{
	  StringBuilder sb=new StringBuilder();
	  if(len<=0){
		  throw new Exception("树的层数必须为1~"+"之间的数"); 
	  }
	  getNode(node, len, sb);
	  return sb.toString();
  }
  /**
 * 用于获取某一层的节点值
 * @author:John
 * @return:void
 * @date: 2015年12月11日
 */
public void getNode(Node node,int len , StringBuilder sb) throws Exception{
	  if(len==1){
		  sb.append(node.value);
		  return;
	  }
	  else {
		if (node.lefNode != null) {//获取左节点
			sb.append(getNode(node.lefNode, len-1));
		}
		if (node.righNode != null) {//获取右节点
			sb.append(getNode(node.righNode, len-1));
		}
	}
  }
  /**
 * 获取树的层数
 * @author:John
 * @return:int
 * @date: 2015年12月11日
 */
public int getTreeHigh(Node node){
	  if(node==null){
		  return 0;
	  }
	  else {
		int leftHigt = getTreeHigh(node.lefNode);//左子树的高度
		int rightHigt = getTreeHigh(node.righNode);//右子树的高度
		return Math.max(leftHigt, rightHigt)+1;
	}
  }
  public static void main(String[] args) throws Exception {
	  TreeNode treeNode=new TreeNode();
		Node node=treeNode.createTreeNode("abc###d##");
		int i=treeNode.getTreeHigh(node);
		String result1 =treeNode.getNode(node, 3);
		System.out.println(result1);
		System.out.println(i);
}
}
