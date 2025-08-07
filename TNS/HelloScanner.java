import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student");
		String name= sc.next();
		System.out.println("Hello "+name);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the full name of student");
		String fulname= sc1.nextLine();
		System.out.println("Welcome " +fulname);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the phone number of student");
		String Phone= sc2.next();
		System.out.println("Student Phone no is :  " +Phone);
		sc.close();
		sc1.close();
		sc2.close();
    }
}
