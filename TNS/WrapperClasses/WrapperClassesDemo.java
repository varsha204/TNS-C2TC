package WrapperClasses;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        //UNBOXING,UNWRAPPING
		
		//Integer i1=new Integer(10); // this is deprecated since java 9 because creates object every time even if the value is same
		//waste of memory
		//so alternatively use 
		Integer i1 = Integer.valueOf(5);  // Recommended

		System.out.println(i1);
		
		int b=i1.intValue();
		System.out.println(b);
		
		//without using intvalue()
        int c=i1;
        System.out.println(c);
        
        //autoboxing, wrapping
         float f=67.87f;
         //Float r=new Float(f);
         Float r=Float.valueOf(f);
         System.out.println(r);
    }
}
