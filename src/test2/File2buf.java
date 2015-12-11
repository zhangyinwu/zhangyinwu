package test2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �������ڽ��ļ�ת��Ϊ�ֽ�����
 * @author: John
 * @Class: File2buf
 * @date: 2015��12��11��
 */
public class File2buf {
	/**
	 * ����һ���ļ�filepath,����ת��Ϊ�ֽ�����
	 * @author:John
	 * @return:byte[]
	 * @date: 2015��12��11��
	 */
	public byte[] getBytes(String filePath) throws Exception {
		byte[] buffer = null;
		FileInputStream fis = null;
		ByteArrayOutputStream bos = null;
		try {
			File file = new File(filePath); // �½�һ���ļ�file
			if (file.exists() && file.isFile()) {
				fis = new FileInputStream(file); // ����һ���ļ��Ķ�ȡ��
				long length = fis.available();
				bos = new ByteArrayOutputStream((int) length); // ��ȡ�����ڵ�����,ת��������
				byte[] b = new byte[4096];
				int n;
				while ((n = fis.read(b)) != -1) { // ���ļ�file��ȡ����,���������b��
					bos.write(b, 0, n);
				}
				buffer = bos.toByteArray(); // �õ��������
			} else if (!file.exists()||file.isDirectory()) {
				throw new Exception("�ļ������ڻ������ļ���");
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
		return buffer; // ���ؽ������
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
