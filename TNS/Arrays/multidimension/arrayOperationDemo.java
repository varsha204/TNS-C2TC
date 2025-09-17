package Arrays.multidimension;

import java.util.Arrays;

public class arrayOperationDemo {
    public static void main(String[] args) {
        int a[] = { 10, 20, 15, 22, 35, 18 , 14 };
	//int a[];
	//int[] b;

   //To print all the elements in the array before sorting
	System.out.println("Array elements are "+Arrays.toString(a));
	
	
	Arrays.sort(a);     //sorting array
	System.out.println("sorted Array elements are "+Arrays.toString(a));
	
	int keyValue=22;
	System.out.println(keyValue +" "+"found at "+Arrays.binarySearch(a, keyValue));
	
	//creates a new array with a specified length 
			System.out.println("\nNew Arrays by copyOf:\n");
			int intArr2[]=Arrays.copyOf(a, 7);
			System.out.println("Integer Array: " + Arrays.toString(intArr2));
    }

	public void addElements(int[] arr) {
		throw new UnsupportedOperationException("Unimplemented method 'addElements'");
	}

    public void printArray(int[] arr) {
        throw new UnsupportedOperationException("Unimplemented method 'printArray'");
    }
}
