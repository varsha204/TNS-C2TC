package Constructor;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
		Person per = new Person();
		System.out.println(per);
		
		Person per1 = new Person("Appu","JpNAgar",2);
		System.out.println(per1);

		Scanner sc = new Scanner(System.in);
		String name , city;
		int id;
		
		System.out.println("Enter the personName");
		name = sc.next();
		
		System.out.println("Enter the personCity");
		city = sc.next();
		
		System.out.println("Enter the personID");
		id = sc.nextInt();
		
		Person per2 = new Person(name,city,id);
		System.out.println(per2);
		sc.close();
	}

}
