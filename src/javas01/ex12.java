package javas01;

import java.util.Scanner;



public class ex12 {
//�������� 14 �Է��� ���� �� ������ �ϴ� ���簢���� * ��ȣ�� ����ϴ� ���α׷� �ۼ�.
public static void main(String[] args) {
	
	Scanner str = new Scanner(System.in);
	
	System.out.println("0~10������ ���ڸ� �Է��ϼ���.");
		 int num = str.nextInt();
		 System.out.println("�� ��:"+num);
		 for(int i=0; i<num; i++) {
			 System.out.printf("%2d",num);
			 
		 }
		 System.out.println();
		 
		 
		 System.out.printf(""
		 		+ "-+---");
		for(int i=0; i<num; i++) {
			System.out.println();
			System.out.print(num);
			System.out.print("|");
			for(int j=0;j<num; j++) {
			System.out.print("*");
			}
		}
	  }

}

