package Day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//2byte 파일 입출력 + 버퍼

/*				1byte			2byte
 * 	입력		InputStream			Reader
 * 	출력		OutputStream		Writer
 */

public class CharStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("src/day12/b.txt");
			fw = new FileWriter("src/day12/b1.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			int data = 0;
			while ( (data = br.read()) != -1) {
				System.out.print((char) data);
				bw.write(data);
			}
			bw.flush();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
				if(br != null) br.close();
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
