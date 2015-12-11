package test2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 该类用于将文件转化为字节数组
 * @author: John
 * @Class: File2buf
 * @date: 2015年12月11日
 */
public class File2buf {
	/**
	 * 传入一个文件filepath,将其转化为字节数组
	 * @author:John
	 * @return:byte[]
	 * @date: 2015年12月11日
	 */
	public byte[] getBytes(String filePath) throws Exception {
		byte[] buffer = null;
		FileInputStream fis = null;
		ByteArrayOutputStream bos = null;
		try {
			File file = new File(filePath); // 新建一个文件file
			if (file.exists() && file.isFile()) {
				fis = new FileInputStream(file); // 创建一个文件的读取流
				long length = fis.available();
				bos = new ByteArrayOutputStream((int) length); // 获取缓冲内的数据,转换成数组
				byte[] b = new byte[4096];
				int n;
				while ((n = fis.read(b)) != -1) { // 将文件file读取出来,存放在数组b中
					bos.write(b, 0, n);
				}
				buffer = bos.toByteArray(); // 得到结果数组
			} else if (!file.exists()||file.isDirectory()) {
				throw new Exception("文件不存在或者是文件夹");
			} 
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				if (fis !=null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (bos !=null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return buffer; // 返回结果数组
	}

	public static void main(String[] args)  {
		File2buf file2buf = new File2buf();
		byte[] b;
		try {
			b = file2buf.getBytes("E:/test1/text1.txt");
			for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
		//System.out.println(b.length/1024);
	}
}
