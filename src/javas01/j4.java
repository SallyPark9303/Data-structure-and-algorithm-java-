package javas01;

import java.util.Scanner;



public class j4 {
//실습1-6 1,2,...,n의 합을 구합니다.(양수만 입력)

public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	int n;
	
	System.out.println("1부터 n까지의 합을 구합시다.");
	
	do {  //do문은 일단 루프 본문을 한번 실행한 다음에 계속 반복할 것인지를 판단하는 사후 판단 반복문입니다. 
		System.out.print("n의 값 : ");
		n = stdIn.nextInt();
		
	}while (n<=0);
	
	int sum =0;
	for (int i =1;  i<=n; i++) 
		sum +=i;
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
		
	
	
	
	
}

}

