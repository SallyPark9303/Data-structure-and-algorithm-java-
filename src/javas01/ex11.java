package javas01;

import java.util.Scanner;



public class ex11 {
//Q11 ���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	int n;
	int a=0;
	int b=0;
//	System.out.print("a�ǰ�:"); a= stdIn.nextInt();
	while(true) {
		System.out.print("���� ���ڸ� �Է��ϼ���.");  a= stdIn.nextInt();
	if(a>0)
	break;
	System.out.print("0���� ū���� �Է��ϼ���.");

	}
	
	int length = (int)(Math.log10(a)+1); //������ ���� ��ŭ
	 
	System.out.println("���� : " + length);
		
}

}

/*
 * public static void main(String[] args) { Scanner stdIn = new
 * Scanner(System.in);
 * 
 * System.out.println("���� �������� �ڸ����� ���մϴ�.");
 * 
 * int n; do { System.out.print("��������"); n = stdIn.nextInt(); } while (n <= 0);
 * 
 * int no = 0; // �ڸ��� while (n > 0) { n /= 10; // n�� 10���� ���� no++; }
 * 
 * System.out.println("�� ���� " + no + "�ڸ��Դϴ�."); }
 */