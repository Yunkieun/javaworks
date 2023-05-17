package forexample;

public class Gugudan {

	public static void main(String[] args) {
		// 전체 구구단 출력
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {	
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println(" ");
		}
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 작성하세요.
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<i; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println(" ");
		}
	}

}
