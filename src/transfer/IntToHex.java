package transfer;

public class IntToHex {
	public void aaa(int a,StringBuilder sb){//该方法用于判断a是否大于9，并赋予相应的值
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
    	StringBuilder sb=new StringBuilder();//定义一个变量，便于对字符串的操作；
    	int num=0;
    	if(i<0){//判断i是否为负数，如果是，将其变为值相等的正数
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
        	sb.append("-");//如果num值变为1，则参数i为负数，结果也要加上负号；
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
