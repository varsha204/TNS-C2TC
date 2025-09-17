package Arrays.multidimension;

import java.util.Scanner;

public class ArrayOperations {
    Scanner sc;

    //printarray method
		 void printArray(int[] arr) {            
			System.out.println("Array elements are");
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + "\t");
			System.out.println();
		}
		
        //add elements method
		void addElements(int[] arr) {                   
			sc=new Scanner(System.in);
			System.out.println("Enter the array elements");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
		}
        
        //get odd count method
		public int getOddCount(int b[]) {           
			int count=0;
			for(int i=0;i<b.length;i++) {
				if(b[i]%2!=0) {
					count++;
				}
			}
			return count;
		}
}
