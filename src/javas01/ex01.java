package javas01;

public class ex01 {
	
	// 네 값의 쵀닷값을 구하는 max4 메서드 작성
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		if(d>max) {
			max=d;
		}
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max4(1,2,3,4):"+max4(1,2,3,4));
	}
	
}
