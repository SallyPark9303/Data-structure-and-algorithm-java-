package javas01;

import java.util.Scanner;



public class ex13 {
//�������� 12 �����ʰ� ���ʿ� ���ϴ� ���� �ִ� ����ǥ ���

public static void main(String[] args) {
	int result =0;
	System.out.print("     |");
	for (int i= 1; i <= 9; i++) System.out.printf("%3"
			+ "d", i);
	  System.out.println("\n---+---------------------------");
		
	  for(int i =1; i<=9; i++) {
		  System.out.printf("%2d | ",i);
		  	for (int j = 1; j <= 9; j++)
			  System.out.printf("%3d", i * j);
		  
		  		//System.out.println();
		  System.out.printf("%n");
				  } 
		  
	  }
	


	
	
	
}



/*
 * public static void main(String[] args) 
 * { System.out.print("   |"); 
 * for (int i= 1; i <= 9; i++) System.out.printf("%3d", i);
 * System.out.println("\n---+---------------------------");
 * 
 * for (int i = 1; i <= 9; i++) { System.out.printf("%2d |", i); for (int j = 1;
 * j <= 9; j++) System.out.printf("%3d", i * j); System.out.println(); } }
 */



/*
 * 
 * 
 * ����ȭ�� ��� - printf()
 * 
 * 
 * 
 * �⺻ ��¹��� println()�� ������ ���� �״�� ����ϹǷ�, ���� ��ȯ���� �ʰ�� �ٸ� �������� ����� �� ����.
 * 
 * �ݸ鿡 printf()�� �����ڸ� ���� ������ ���� ���� ���� �������� ��ȯ�Ͽ� ����� �� �ִ�.
 * 
 * 
 * 
 * printf()
 * 
 * System.out.printf("��� ����",����� ����);
 * 
 * ��� �� �ٹٲ��� ���� �ʴ´�. �ٹٲ��� �Ϸ��� ������ '%n'�� �־���� �Ѵ�. ����Ϸ��� ���� ����ŭ �����ڵ� ����ؾ� �Ѵ�. ��µ�
 * ���� �������� ������ ��ġ�ؾ� �Ѵ�. �����ڸ� ������ ���ڴ� �Է��� �״�� ��µȴ�.
 */