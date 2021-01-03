package javas01;

import java.util.Scanner;



public class ex11 {
//Q11 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.

public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	int n;
	int a=0;
	int b=0;
//	System.out.print("a의값:"); a= stdIn.nextInt();
	while(true) {
		System.out.print("양의 숫자를 입력하세요.");  a= stdIn.nextInt();
	if(a>0)
	break;
	System.out.print("0보다 큰수를 입력하세요.");

	}
	
	int length = (int)(Math.log10(a)+1); //숫자의 길이 만큼
	 
	System.out.println("길이 : " + length);
		
}

}

/*
 * public static void main(String[] args) { Scanner stdIn = new
 * Scanner(System.in);
 * 
 * System.out.println("양의 정수값의 자릿수를 구합니다.");
 * 
 * int n; do { System.out.print("정수값："); n = stdIn.nextInt(); } while (n <= 0);
 * 
 * int no = 0; // 자릿수 while (n > 0) { n /= 10; // n을 10으로 나눔 no++; }
 * 
 * System.out.println("그 수는 " + no + "자리입니다."); }
 */