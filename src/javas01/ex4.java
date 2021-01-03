package javas01;

import java.util.Scanner;

public class ex4 {
	
	//1부터 n까지의 정수 합 
	public static int sum(int n) {
	int i=1;
	int sum =0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
	System.out.println("정수 n을 입력하세요.");
	int n = str.nextInt();
	//sum(n);
	System.out.println(sum(n));
	}
	
}
