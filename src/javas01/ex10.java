package javas01;

import java.util.Scanner;



public class ex10 {
//Q10 오른쪽과 같이 두 변수 a,b에 정수를 입력하고 b-a 를 출력하는 프로그램을 작성하세요.

public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	int n;
	int a=0;
	int b=0;
	System.out.println("b-a의 값을 구합시다.");
	System.out.print("a의값:"); a= stdIn.nextInt();
	while(true) {
	System.out.print("b의값:"); b= stdIn.nextInt();
	if(a<b)
	break;
	System.out.print("a보다 큰 수를 입력하세요.");

	}
	
//	do { 
//		System.out.print("a의 값 : ");
//		a = stdIn.nextInt();
//		System.out.print("b의 값 : ");
//		b = stdIn.nextInt();
//		
//	}while (a>=b);

	int result = b-a;
		System.out.println("b-a의 값은"+result);
		
}

}
/*
 * public static void main(String[] args) { Scanner stdIn = new
 * Scanner(System.in);
 * 
 * System.out.print("a의 값："); int a = stdIn.nextInt();
 * 
 * int b=0; while (true) { System.out.print("b의 값："); b = stdIn.nextInt(); if (b
 * > a) break; System.out.println("a보다 큰 값을 입력하세요!"); }
 * 
 * System.out.println("b - a는 " + (b - a) + "입니다."); }
 * 
 */