package javas01;

import java.util.Scanner;



public class j7 {
//�ǽ� 1-6 ����ǥ ��� ���� ����

public static void main(String[] args) {
	int result =0;
	System.out.println("����ǥ");
	for(int i=1; i<=9;i++) {
		for(int j=1;j<=9; j++) {
			result = i *j;
			System.out.printf("%3d",result);
		}
		System.out.printf("%n");
	}
	
	
	
	
	
}

}




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