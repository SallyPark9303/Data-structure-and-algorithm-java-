package javas01;

import java.util.Scanner;



public class ex10 {
//Q10 �����ʰ� ���� �� ���� a,b�� ������ �Է��ϰ� b-a �� ����ϴ� ���α׷��� �ۼ��ϼ���.

public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	int n;
	int a=0;
	int b=0;
	System.out.println("b-a�� ���� ���սô�.");
	System.out.print("a�ǰ�:"); a= stdIn.nextInt();
	while(true) {
	System.out.print("b�ǰ�:"); b= stdIn.nextInt();
	if(a<b)
	break;
	System.out.print("a���� ū ���� �Է��ϼ���.");

	}
	
//	do { 
//		System.out.print("a�� �� : ");
//		a = stdIn.nextInt();
//		System.out.print("b�� �� : ");
//		b = stdIn.nextInt();
//		
//	}while (a>=b);

	int result = b-a;
		System.out.println("b-a�� ����"+result);
		
}

}
/*
 * public static void main(String[] args) { Scanner stdIn = new
 * Scanner(System.in);
 * 
 * System.out.print("a�� ����"); int a = stdIn.nextInt();
 * 
 * int b=0; while (true) { System.out.print("b�� ����"); b = stdIn.nextInt(); if (b
 * > a) break; System.out.println("a���� ū ���� �Է��ϼ���!"); }
 * 
 * System.out.println("b - a�� " + (b - a) + "�Դϴ�."); }
 * 
 */