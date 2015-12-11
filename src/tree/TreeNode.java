package tree;

 /**
 * �������ڹ����������������з��ض�����ĳһ���ȫ���ڵ�ķ��� 
 * @author: John
 * @Class: TreeNode
 * @date: 2015��12��11��
 */
public class TreeNode {
	private int index=0;
  /**
 * ���Ľڵ������
 * @author: John
 * @Class: Node
 * @date: 2015��12��11��
 */
public class Node{
	  private char value;
	  private Node lefNode;
	  private Node righNode;
  }
  /**
 * ���ڽ����index����
 * @author:John
 * @return:void
 * @exception
 * @date: 2015��12��11��
 */
public void reIndex(){
	  index=0;
  }
  
  /**
 * ���ڸ��ݴ�����ַ�������������
 * @author:John
 * @return:Node
 * @param str
 * @throws Exception
 * @date: 2015��12��11��
 */
public Node createTreeNode(String str) throws Exception{
	 Node node=new Node();
	  if(str==null||str==""){//�����п�
		  throw new Exception("��Ϊ��");
	  }
	  else {
		if(index<str.length()){//�±���ڱ�����֣����ڵ㸳ֵ
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
 * @date: 2015��12��11��
 */
public String getNode(Node node , int len) throws Exception{
	  StringBuilder sb=new StringBuilder();
	  if(len<=0){
		  throw new Exception("���Ĳ�������Ϊ1~"+"֮�����"); 
	  }
	  getNode(node, len, sb);
	  return sb.toString();
  }
  /**
 * ���ڻ�ȡĳһ��Ľڵ�ֵ
 * @author:John
 * @return:void
 * @date: 2015��12��11��
 */
public void getNode(Node node,int len , StringBuilder sb) throws Exception{
	  if(len==1){
		  sb.append(node.value);
		  return;
	  }
	  else {
		if (node.lefNode != null) {//��ȡ��ڵ�
			sb.append(getNode(node.lefNode, len-1));
		}
		if (node.righNode != null) {//��ȡ�ҽڵ�
			sb.append(getNode(node.righNode, len-1));
		}
	}
  }
  /**
 * ��ȡ���Ĳ���
 * @author:John
 * @return:int
 * @date: 2015��12��11��
 */
public int getTreeHigh(Node node){
	  if(node==null){
		  return 0;
	  }
	  else {
		int leftHigt = getTreeHigh(node.lefNode);//�������ĸ߶�
		int rightHigt = getTreeHigh(node.righNode);//�������ĸ߶�
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
