import static org.junit.Assert.*;

import javax.swing.text.AttributeSet.FontAttribute;

import org.junit.Before;
import org.junit.Test;

import test2.File2buf;

/**
 * 
 */

/**
 * @author John
 *
 */
public class Test2 {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws Exception {
		File2buf f2 = new File2buf();
		//����1������С�ļ�text���������Ƿ���ȷ
		byte[] b = { 49, 50 };
		assertArrayEquals(b, f2.getBytes("E:/test1/text.txt"));
		//����2�����Դ��ļ��Ĵ�С�Ƿ���ȷ
		byte[] b1 = f2.getBytes("E:/QQPinyin/4.7.2065.400/QQDownload/Extract.dll");
		assertEquals(358, b1.length / 1024);// �Ƚ��ļ��Ĵ�С�Ƿ�һ��
		//����3�����Կ��ļ��������Ƿ���ȷ
		byte[] b2 = { };
		assertArrayEquals(b2, f2.getBytes("E:/test1/text1.txt"));
		//�������������ļ������ڽ���Ƿ���ȷ
		
	}
}
