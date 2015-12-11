package transfer;

/**
 * 将10进制的int类型变量，转换为16进制的字符串
 * @author: John
 * @Class: IntToHex
 * @date: 2015年12月11日
 */
public class IntToHex {	
	/**
	 * 判断digit是否大于9，大于9则返回（10~A，11~B，12~C，13~D，14~E，15~F）
	 * @author:John
	 * @return:char
	 * @date: 2015年12月11日
	 */
	private char digit2HexChar(int digit) {
		if (digit <= 9) {
			return (char) ('0' + digit);
		}
		return (char) ('A' + (digit - 10));
	}


	/**
	 * 将int类型的变量i转换成16进制的字符串
	 * @author:John
	 * @return:String
	 * @date: 2015年12月11日
	 */
	public String int2Hex(int i) {
		StringBuilder sb = new StringBuilder();// 定义一个变量，便于对字符串的操作；
		if(i==Integer.MIN_VALUE){//如果i为int的最小值，返回“-80000000”
			return "-80000000";
		}
		boolean ifNum =i < 0;//如果i为负数，ifNum的值为true
		if(ifNum){//如果i是负数，将其赋值为他的相反数
			i=-i;
		}
		int a = 0;
		while (i / 16 != 0) {
			a = i % 16;
			sb.append(digit2HexChar(a));
			i = i / 16;

		}
		sb.append(digit2HexChar(i));
		if (ifNum) {
			sb.append('-');
		}
		sb.reverse();
	    String result = sb.toString();
		return result;
	}
	public static void main(String[] args) {
		IntToHex ith = new IntToHex();
		//System.out.println(ith.int2Hex(291));
		//System.out.println(ith.int2Hex(205));
	    //System.out.println(ith.int2Hex(1));
	    //System.out.println(ith.int2Hex(-205)); 
		//System.out.println(ith.int2Hex(-291));
		//System.out.println(ith.int2Hex(0));
		//System.out.println(ith.int2Hex(Integer.MAX_VALUE));
		System.out.println(ith.int2Hex(Integer.MIN_VALUE));
	}
}
