package javas01;

import java.util.Scanner;



public class b01 {
//������� 1-7 �� ����� ��𸣰� ��Ģ �Է��� ����2�ڸ��� ����� ����

public static void main(String[] args) {

	int num =0;

	Scanner stdIn = new Scanner(System.in);
	do {
		System.out.println("���ڸ� �Է��ϼ���.");
		num = stdIn.nextInt();
		
		
	}while(num <10 || num>99);

	 
	System.out.println("���� n�� ����"+num+"�� �Ǿ����ϴ�.");
		
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