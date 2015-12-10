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
		//用例1：测试小文件text的输出结果是否正确
		byte[] b = { 49, 50 };
		assertArrayEquals(b, f2.getBytes("E:/test1/text.txt"));
		//用例2：测试大文件的大小是否正确
		byte[] b1 = f2.getBytes("E:/QQPinyin/4.7.2065.400/QQDownload/Extract.dll");
		assertEquals(358, b1.length / 1024);// 比较文件的大小是否一致
		//用例3：测试空文件输出结果是否正确
		byte[] b2 = { };
		assertArrayEquals(b2, f2.getBytes("E:/test1/text1.txt"));
		//用例４：测试文件不存在结果是否正确
		
	}
}
