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
            File file = new File(filePath);  //新建一个文件file
            FileInputStream fis = new FileInputStream(file);  //创建一个文件的读取流
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000); //获取缓冲内的数据,转换成数组 
            byte[] b = new byte[1000];  
            int n;  
            while ((n = fis.read(b)) != -1) {  //将文件file读取出来,存放在数组b中
                bos.write(b, 0, n); 
            }  
            fis.close();  
            bos.close();  
            buffer = bos.toByteArray();  //得到结果数组
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } 
        return buffer;  //返回结果数组
    }
	public	static	void	main(String[]	args){
			File2buf file2buf=new File2buf();
			byte[] b=file2buf.getBytes("E:/test1/text.txt");
			for(int i=0;i<b.length;i++){
				System.out.println(b[i]);
			}
	}
}
