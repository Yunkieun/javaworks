package objectarray;

public class DogMain {

	public static void main(String[] args) {
		// 강아지 3마리 생성
		Dog[] dogArray = new Dog[3];
		
//		dogArray[0] = new Dog();
		for(int i=0; i<dogArray.length; i++) {
			dogArray[i] = new Dog();
		}
		
		dogArray[0].setDogName("토리");
		dogArray[0].setType("스피츠");
		
		System.out.println(dogArray[0].getDogName());
		System.out.println(dogArray[0].getType());

	}

}
