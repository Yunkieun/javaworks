package methods;

class MethodEx{
	// sayHello 함수 생성
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	// 두 수를 더하는 함수
	public int add(int x, int y) {
		return x + y;
	}

	public void sayHello2(String string) {
		// TODO Auto-generated method stub
		
	}
}

public class MethodTest {

	public static void main(String[] args) {
		// sayHello() 사용(호출), 객체 이름.함수이름()
		MethodEx method = new MethodEx();
		method.sayHello();
		
		// sayHello2() 호출
		method.sayHello2("이강");
		method.sayHello2("연아");
	
		
		// add() 함수 호출
		int value = method.add(10, 20);
		System.out.println(value);

	}

}
