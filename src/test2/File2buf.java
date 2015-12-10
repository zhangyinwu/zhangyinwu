package test2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

public class File2buf {
	public byte[] getBytes(String filePath) {
		byte[] buffer = null;
		FileInputStream fis = null;
		ByteArrayOutputStream bos = null;
		try {
			File file = new File(filePath); // 新建一个文件file
			if (file.exists() && file.isFile()) {
				fis = new FileInputStream(file); // 创建一个文件的读取流
				long length = fis.available();
				System.out.println(length);
				bos = new ByteArrayOutputStream((int) length); // 获取缓冲内的数据,转换成数组
				ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
				byte[] b = byteBuffer.array();
				int n;
				while ((n = fis.read(b)) != -1) { // 将文件file读取出来,存放在数组b中
					bos.write(b, 0, n);
				}

				buffer = bos.toByteArray(); // 得到结果数组
			} else if (!file.exists()) {
				System.out.println("文件不存在！");
			} else if (file.isDirectory()) {
				System.out.println("这是一个文件夹，请选择一个文件！");
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return buffer; // 返回结果数组
	}

	public static void main(String[] args) {
		File2buf file2buf = new File2buf();
		byte[] b = file2buf
				.getBytes("E:/QQPinyin/4.7.2065.400/QQDownload/Extract.dll");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
