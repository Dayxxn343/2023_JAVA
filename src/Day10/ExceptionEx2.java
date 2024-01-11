package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx2 {	//try catch 예외문을 배움

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//ㄴ데이터 입력 받을 때 꼭 필요함
		try {
			System.out.println("정수 : ");
			int a = Integer.parseInt(br.readLine());
			System.out.println("a : " + 10/ a);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("정수만 입력하세요");
		} catch(ArithmeticException e) {	//1월에 언어 복습 //2월에 리눅스 연습
			System.out.println("0으로 나누면 안됩니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 끝");	//순서 틀리면 오류가 생김
		}

	}

}
