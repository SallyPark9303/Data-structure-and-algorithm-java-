package javas01;

import java.util.Scanner;

public class ex5 {
	
	//n�� 7�̸� '1+2+3+4+5+6+7'�� 28�� ����ϴ� ���α׷��ۼ�
	
	public static int sum1(int n) {
		int sum= 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		return sum;
		
	}
	
	public static String num(int n) {
		String numstr = "";
		for(int j=1; j<=n; j++) {
			if(j!=n) {
				numstr =numstr + j+"+"; 
			}else {
				numstr = numstr+j;
			}
		 
		} return numstr;
		
	}

	public static String result(int n) {
		String result = "";
		int i = 1;
		int sum = 0;
		while (i < n) {
			result += i + " + ";
			sum += i++;
		}
		return result += n + " = " + (sum + i);
	}

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.print("����n�� �Է��ϼ���.");
		int n = str.nextInt();
		//System.out.println(num(n)+"="+sum1(n));
		System.err.println(result(n));
		
		str.close();
	}
	
}
