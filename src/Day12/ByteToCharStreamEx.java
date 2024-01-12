package Day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ByteToCharStreamEx {
	public String input(String msg) throws IOException {
		System.out.print(msg);
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
//		return br.readLine();		예외가 발생함
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ByteToCharStreamEx btc = new ByteToCharStreamEx();
		String id = btc.input("아이디 : ");
		String passwd = btc.input("비밀번호 : ");
		
//		FileOutputStream fos = new FileOutputStream("src/day12/c.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		BufferedWriter bw = new BufferedWriter (
				new OutputStreamWriter(new FileOutputStream("src/day12/c.txt")));
		bw.write("아이디 : ");
		bw.write(id);
		bw.newLine();
		bw.write("비밀번호 : ");
		bw.write(passwd);
		bw.newLine();
		
		bw.flush();
		
		if(bw != null) bw.close();
		
	}

}
