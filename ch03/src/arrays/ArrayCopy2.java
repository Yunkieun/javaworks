package arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		// 배열 복사(arr1 -> arr2)
//		System.arraycopy(arr1, 0, arr2, 0, 3);
//		
//		for(char i : arr2)
//			System.out.print(i + " ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];  // arr1을 arr2에 복사함
			System.out.print(arr2[i] + " ");
		}
		System.out.println();  // 줄바꿈
		
		// 역순 복사(arr1 -> arr3) N E T -> T E N
		for(int i=0; i<arr1.length; i++) {
			arr3[2-i] = arr1[i]; 
		}
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");  // arr1을 arr2에 복사함
		}
		

	}

}
