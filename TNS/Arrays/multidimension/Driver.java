package Arrays.multidimension;

public class Driver {
    public static void main(String[] args) {
        ArrayOperations ob=new ArrayOperations();
		int arr[]=new int[5];
		ob.addElements(arr);
		ob.printArray(arr);
		System.out.println("The odd count is "+ob.getOddCount(arr));
    }
    
}