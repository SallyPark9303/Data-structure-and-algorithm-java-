package javas01;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class j2 {

public static int max(int a, int b, int c) {

	int max = a;
	if (max<b) {
		max=b;
	}
	if (max<c) {
		max=c;
	}
	
	return max;
	
}

public static void main(String[] args) {
  System.out.println("max(1,2,3):"+max(1,2,3));
}

}

