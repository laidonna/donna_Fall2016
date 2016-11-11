/**
 * @author Donna Lai
 * APCS 1st period
 * Array Lab 3
 * 
 * This program takes arrays and returns either arrays or a value according to each method
 */ 
import java.util.Arrays;

public class ArraysLab3{

	//This method takes the sum of two arrays at their corresponding indexes and returns a new array of the sums.
	public static int[] sum(int[] arr1, int[] arr2){
		assert (arr1.length > 0);
		assert (arr2.length > 0);
		assert (arr1.length == arr2.length);
		for(int i = 0; i < arr1.length; i++){
			arr1[i] += arr2[i]; 
		}
		return arr1;
	}
	
	//This method accepts an array and number adds that value to the end of an array.
	public static int[] append(int[] arr, int num){
		assert (arr.length > 0);
		int[] arr2 = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++){
			arr2[i] = arr[i];
		}
		arr2[arr.length] = num;
		return arr2;
	}
	
	//This method accepts an array and a index of any part in the array and returns an array that removes that specific index.
	public static int[] remove(int[] arr, int idx){
		assert (arr.length >= 2);
		int[] arr2 = new int[arr.length-1];
		for (int i = 0; i <idx; i++){
			arr2[i] = arr[i];
		}
		for(int j = 1 + idx; j<arr.length; j++){
			arr2[j-1] = arr[j];
		}
		return arr2;
	}
	
	//This method accepts an array and returns the sum of all the even numbers within the array.
	public static int sumEven(int[] arr){
		assert (arr.length > 0);
		int evenTotal = 0; 
		for (int i = 0; i <arr.length; i+=2){
			evenTotal+=arr[i];
		}
		return evenTotal;
	}
	
	//This method accepts an array and returns a new array that rotates every value right.
	public static void rotateRight(int[] arr){
		assert (arr.length > 0);
		int tempLast = arr[arr.length-1];
		for (int i = arr.length -1; i >0; i--){
			arr[i] = arr[i -1];
		}
		arr[0] = tempLast;
		
	}
	
	//The main method tests all the other methods by calling all the methods and sets all the arrays to test the methods.
	public static void main(String[] args){
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int appendnum = 200;
		int removeidx = 5;
		int[] sumArr = sum(a1, a2);
		int[] appendArr = append(a1, appendnum);
		int[] removeArr = remove(a2, removeidx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);	
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
}
