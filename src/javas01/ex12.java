package javas01;

import java.util.Scanner;



public class ex12 {
//연습문제 14 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램 작성.
public static void main(String[] args) {
	
	Scanner str = new Scanner(System.in);
	
	System.out.println("0~10까지의 숫자를 입력하세요.");
		 int num = str.nextInt();
		 System.out.println("단 수:"+num);
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

