package transfer;

/**
 * ��10���Ƶ�int���ͱ�����ת��Ϊ16���Ƶ��ַ���
 * @author: John
 * @Class: IntToHex
 * @date: 2015��12��11��
 */
public class IntToHex {	
	/**
	 * �ж�digit�Ƿ����9������9�򷵻أ�10~A��11~B��12~C��13~D��14~E��15~F��
	 * @author:John
	 * @return:char
	 * @date: 2015��12��11��
	 */
	private char digit2HexChar(int digit) {
		if (digit <= 9) {
			return (char) ('0' + digit);
		}
		return (char) ('A' + (digit - 10));
	}


	/**
	 * ��int���͵ı���iת����16���Ƶ��ַ���
	 * @author:John
	 * @return:String
	 * @date: 2015��12��11��
	 */
	public String int2Hex(int i) {
		StringBuilder sb = new StringBuilder();// ����һ�����������ڶ��ַ����Ĳ�����
		if(i==Integer.MIN_VALUE){//���iΪint����Сֵ�����ء�-80000000��
			return "-80000000";
		}
		boolean ifNum =i < 0;//���iΪ������ifNum��ֵΪtrue
		if(ifNum){//���i�Ǹ��������丳ֵΪ�����෴��
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
