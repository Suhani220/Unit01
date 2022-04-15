package Unit_01;

import java.lang.reflect.Array;

public class P6_Task01_ArraysInJava {
	public static void main(String[] args){
		int array1[];
		int[] array2;
		int []array3;
		
		
		array1 = new int[6];
		
		System.out.println("Printing array : array1");
		for(int i=0; i < array1.length; i++) {
			array1[i] = i*10;
			System.out.println(array1[i]);
		}
		
		int array4[] = {10, 20, 30, 40};
//		arrayAsParameter(array4);
//		
//		arrayAsParameter(new int[] {50, 60, 70, 80});
//		
//		int[] array5 = arrayAsReturnType();
//		System.out.println(array5.toString());
		System.out.println();
		System.out.println("Printing array : arr");
		int arr[] = {100, 200, 300, 400};
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
