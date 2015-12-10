package transfer;

public class IntToHex {	
	private static String result;
	private char digit2HexChar(int digit) {
		if (digit <= 9) {
			return (char) ('0' + digit);
		}
		return (char) ('A' + (digit - 10));
	}


	public String int2Hex(int i) {
		StringBuilder sb = new StringBuilder();// ����һ�����������ڶ��ַ����Ĳ�����
		boolean ifNum =i < 0;//���iΪ������ifNum��ֵΪtrue����֮Ϊ
		if(ifNum){
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
			sb.append("-");
		}
		sb.reverse();
	    result = sb.toString();
		return result;
	}
	public void clear(){
		result=null;
	}
	public static void main(String[] args) {
		IntToHex ith = new IntToHex();
		System.out.println(ith.int2Hex(291));
		System.out.println(ith.int2Hex(205));
	    System.out.println(ith.int2Hex(1));
	    System.out.println(ith.int2Hex(-205));
		System.out.println(ith.int2Hex(-291));
		System.out.println(ith.int2Hex(0));
	}
}
