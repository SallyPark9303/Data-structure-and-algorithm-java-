package javas01;

import java.util.Scanner;



public class b01 {
//보충수업 1-7 논리 연산과 드모르간 법칙 입력한 값을2자리의 양수로 제한

public static void main(String[] args) {

	int num =0;

	Scanner stdIn = new Scanner(System.in);
	do {
		System.out.println("숫자를 입력하세요.");
		num = stdIn.nextInt();
		
		
	}while(num <10 || num>99);

	 
	System.out.println("변수 n의 값은"+num+"가 되었습니다.");
		
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