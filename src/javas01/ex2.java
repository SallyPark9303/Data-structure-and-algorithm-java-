package javas01;

public class ex2 {
	
	// 세 값의 최솟값 구하는 min3 메소드
	public static int min3(int a, int b, int c) {
		int min = a;
		
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("min3(1,2,3):"+min3(1,2,3));
	}
	
}
