package Day12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

// 1byte 2byte 모두 가능
public class PrintWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw1 = null;
		try {
			pw1 = new PrintWriter("src/Day12/d.txt");
			pw1.println(10);
			pw1.println(10.5);
			pw1.println("ABC");
//			PrintWriter pw1 = new PrintWriter("src/day12/d.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(pw1 != null) pw1.close();
			}
		}

	}

