package javas01;

import java.util.Scanner;



public class j4 {
//�ǽ�1-6 1,2,...,n�� ���� ���մϴ�.(����� �Է�)

public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	int n;
	
	System.out.println("1���� n������ ���� ���սô�.");
	
	do {  //do���� �ϴ� ���� ������ �ѹ� ������ ������ ��� �ݺ��� �������� �Ǵ��ϴ� ���� �Ǵ� �ݺ����Դϴ�. 
		System.out.print("n�� �� : ");
		n = stdIn.nextInt();
		
	}while (n<=0);
	
	int sum =0;
	for (int i =1;  i<=n; i++) 
		sum +=i;
		System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�.");
		
	
	
	
	
}

}

