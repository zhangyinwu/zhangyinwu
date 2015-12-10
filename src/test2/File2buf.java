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
			File file = new File(filePath); // �½�һ���ļ�file
			if (file.exists() && file.isFile()) {
				fis = new FileInputStream(file); // ����һ���ļ��Ķ�ȡ��
				long length = fis.available();
				System.out.println(length);
				bos = new ByteArrayOutputStream((int) length); // ��ȡ�����ڵ�����,ת��������
				ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
				byte[] b = byteBuffer.array();
				int n;
				while ((n = fis.read(b)) != -1) { // ���ļ�file��ȡ����,���������b��
					bos.write(b, 0, n);
				}

				buffer = bos.toByteArray(); // �õ��������
			} else if (!file.exists()) {
				System.out.println("�ļ������ڣ�");
			} else if (file.isDirectory()) {
				System.out.println("����һ���ļ��У���ѡ��һ���ļ���");
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
		return buffer; // ���ؽ������
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
