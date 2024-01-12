package Day12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//1byte 파일입출력 + 버퍼
public class ByteStreamEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = 0;
		try {
			fis = new FileInputStream("src/day12/a.txt");
			fos = new FileOutputStream("src/day12/a1.txt");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while( ( data = fis.read()) != -1) {
				System.out.print((char)data);
				bos.write(data);
			}
			bos.flush();
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
			if(fis != null) fis.close();
			if(fos != null) fos.close();
			if(bis != null) bis.close();
			if(bos != null) bos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
