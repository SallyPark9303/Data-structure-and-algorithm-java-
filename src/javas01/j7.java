package javas01;

import java.util.Scanner;



public class j7 {
//실습 1-6 곱셈표 출력 다중 루프

public static void main(String[] args) {
	int result =0;
	System.out.println("곱셈표");
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
 * 형식화된 출력 - printf()
 * 
 * 
 * 
 * 기본 출력문은 println()은 변수의 값을 그대로 출력하므로, 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
 * 
 * 반면에 printf()는 지시자를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력할 수 있다.
 * 
 * 
 * 
 * printf()
 * 
 * System.out.printf("출력 서식",출력할 내용);
 * 
 * 출력 후 줄바꿈을 하지 않는다. 줄바꿈을 하려면 지시자 '%n'을 넣어줘야 한다. 출력하려는 값의 수만큼 지시자도 사용해야 한다. 출력될
 * 값과 지시자의 순서는 일치해야 한다. 지시자를 제외한 문자는 입력한 그대로 출력된다.
 */