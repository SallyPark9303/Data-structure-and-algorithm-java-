package javas01;

import java.util.Scanner;

public class ex9 {
	
	//���� a,b�� �����Ͽ� �� ������ ��� ������ �� ���Ͽ� ��ȯ

	static int sumof(int a, int b) {
	int sum =0;
		
		if(a<=b) {
			for(; a<=b; a++) {
			
				sum=sum+a;
			}
			return sum;
		}else {
			for(; b<=a; b++) {
				sum=sum+b;
			}
			return sum;
		}
			
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a���� b������ ���� ���մϴ�.");
		System.out.print("a�� ����");
		int a = stdIn.nextInt();
		System.out.print("b�� ����");
		int b = stdIn.nextInt();
		System.out.println(sumof(a,b));
		

	

	}
	
	
	/*
	 * package chap01; import java.util.Scanner; // ����a, b�� �����Ͽ� �� ������ ��� ������ ����
	 * ���մϴ�.
	 * 
	 * class SumOf_01_09 { static int sumof(int a, int b) { int min; // a, b�� ���� ����
	 * �� int max; // a, b�� ū ���� ��
	 * 
	 * if (a < b) { min = a; max = b; } else { min = b; max = a; }
	 * 
	 * int sum = 0; // �� for (int i = min; i <= max; i++) sum += i; return (sum); }
	 * 
	 * public static void main(String[] args) { Scanner stdIn = new
	 * Scanner(System.in);
	 * 
	 * System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
	 * System.out.print("a�� ����"); int a = stdIn.nextInt();
	 * System.out.print("b�� ����"); int b = stdIn.nextInt();
	 * 
	 * System.out.println("���� a, b ������ ��� ������ ���� " + sumof(a, b) + "�Դϴ�."); } }
	 */
	
}
