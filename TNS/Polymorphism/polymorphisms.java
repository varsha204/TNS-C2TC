package Polymorphism;

public class polymorphisms {
    public static void main(String[] args) {
        calculator c1=new calculator();
        //System.out.println(c1.add(c1.getNumOne(),c1.getNumTwo()));
        int res=(int) c1.add(c1.getNumOne(),c1.getNumTwo());
        System.out.println(res);

        calculator c2=new calculator();
        //System.out.println(c1.add(c1.getNumOne(),c1.getNumTwo()));
        int result=(int)(c2.add(c2.getNumThree(),c2.getNumTwo(),c2.getNumFive()));
        System.out.println(result);

        calculator c3=new calculator(100,200);
        //c3.add(c3.getNumOne(),c3.getNumTwo());
        System.out.println(c3.add(c3.getNumOne(),c3.getNumTwo()));
    }
}
