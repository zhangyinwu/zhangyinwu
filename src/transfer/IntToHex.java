package transfer;

public class IntToHex {
	public void aaa(int a,StringBuilder sb){//�÷��������ж�a�Ƿ����9����������Ӧ��ֵ
		if(a==10)
    	{sb.append("a");}
    	else if(a==11)
    	{sb.append("b");}
    	else if(a==12)
    	{sb.append("c");}
    	else if(a==13)
    	{sb.append("d");}
    	else if(a==14)
    	{sb.append("e");}
    	else if(a==15)
    	{sb.append("f");}
    	else
    	{sb.append(a);}
	}
     public String inttohex(int i){
    	StringBuilder sb=new StringBuilder();//����һ�����������ڶ��ַ����Ĳ�����
    	int num=0;
    	if(i<0){//�ж�i�Ƿ�Ϊ����������ǣ������Ϊֵ��ȵ�����
    		num=1;
    		i=i-2*i;
    	}
    	int a=0;
        while (i/16!=0) {
        	a=i%16;
        	aaa(a,sb);
    		 i=i/16;
		
		}
        aaa(i,sb);
        if(num==1){
        	sb.append("-");//���numֵ��Ϊ1�������iΪ���������ҲҪ���ϸ��ţ�
        }
        sb.reverse();
        String result=sb.toString();
    	 return result;
     }
     public static void main(String[] args){
    	 IntToHex ith=new IntToHex();
    	System.out.println(ith.inttohex(291));
    	System.out.println(ith.inttohex(205));
        System.out.println(ith.inttohex(-205));
    	System.out.println(ith.inttohex(-291));
    	System.out.println(ith.inttohex(0));
     }
}
