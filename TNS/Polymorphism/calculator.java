package Polymorphism;

public class calculator {
    private int numOne, numTwo,numThree;
    private float numFour,numFive;
//construct overloading
//default constructor
    public calculator(){
        this.numOne=10;
        this.numTwo=20;
        this.numThree=30;
        this.numFour=40.5f;
        this.numFive=50.0f;

    }
//parametised constructor
    public calculator(int numOne,int numTwo){
        this.numOne=numOne;
        this.numTwo=numTwo;
    }

    public calculator(int numThree,float numFour,float numFive){
        this.numThree=numThree;
        this.numFour=numFour;
        this.numFive=numFive;
    }
    //method overloading
    public int add(int a,int b,float c){
        //explit casting
        int d=(int) (a+b+c);
        return d;
    }
    public float add(int a,int b){
        float x=a+b;
        return x;
    }
     public void add(int a,float b){
        int y=(int)(a+b);
        System.out.println("y:"+y);
    }
    public void setNumOne(int numOne) { 
        this.numOne = numOne; 
    }
    public void setNumTwo(int numTwo) { 
        this.numTwo = numTwo;
     }
    public void setNumThree(int numThree) { 
        this.numThree = numThree; 
    }
    public void setNumFour(float numFour) {
         this.numFour = numFour;
         }
    public void setNumFive(float numFive) { 
        this.numFive = numFive;
     }
     public int getNumOne() {
        return numOne;
     }
     public int getNumTwo() {
        return numTwo;
     }
     public int getNumThree() {
        return numThree;
     }
     public int getNumFour() {
        return (int)numFour;
     }
     public float getNumFive() {
        return numFive;
     }
}
