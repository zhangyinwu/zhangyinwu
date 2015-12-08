package test2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File2buf {
	private byte[] getBytes(String filePath){  
        byte[] buffer = null;  
        try {  
            File file = new File(filePath);  //�½�һ���ļ�file
            FileInputStream fis = new FileInputStream(file);  //����һ���ļ��Ķ�ȡ��
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000); //��ȡ�����ڵ�����,ת�������� 
            byte[] b = new byte[1000];  
            int n;  
            while ((n = fis.read(b)) != -1) {  //���ļ�file��ȡ����,���������b��
                bos.write(b, 0, n); 
            }  
            fis.close();  
            bos.close();  
            buffer = bos.toByteArray();  //�õ��������
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } 
        return buffer;  //���ؽ������
    }
	public	static	void	main(String[]	args){
			File2buf file2buf=new File2buf();
			byte[] b=file2buf.getBytes("E:/test1/text.txt");
			for(int i=0;i<b.length;i++){
				System.out.println(b[i]);
			}
	}
}
