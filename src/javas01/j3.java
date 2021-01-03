package javas01;

import java.util.Scanner;



public class j3 {
//3개의 정수값을 입력하고 중앙값을 구한 다음 출력
 static int med3(int a, int b, int c) {

	 if(a>b) {
		 if(a>c) {
			 if(b>c) {
				 return b; 
			 }else {
				 return c;
			 }
		 }else {
			 return a;
		 }
	 }else if(a<b) {
		 if(a<c) {
			 if(c<b) {
				 return c;
			 }else{
				 return b;
			 }
		 }else {
			 return a;
		 }
	 }else {
		return a;
	 }
}

public static void main(String[] args) {
  System.out.println("med3(a,b,c):"+med3(100,102,98));
  
  
  int i=1;
// for(int i=0; i<10; i+=0) {
	  System.err.println(i++);
//  }
	  System.err.println(i);
  System.err.println("===============================");
  int j=1;
//  for(int i=0; i<10; i+=0) {
	  System.err.println(++j);
//  }
	  System.err.println(j);
}

}

