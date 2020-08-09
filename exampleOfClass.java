public class exampleOfClass {
    public static void main(String[] args){
        class student{
            String name;
            int marks;
        }
        MathAdd addition = new MathAdd();//creates instance of the class i.e. object
        addition.num1=10;
        addition.num2=20;
        System.out.println(addition.add());

        class MathSub{
            int num1,num2;
            public int sub(){
                return Math.abs(num1-num2);
            }
        }
        MathSub Sub = new MathSub();//creates instance of the class i.e. object
        Sub.num1=10;
        Sub.num2=20;
        System.out.println(Sub.sub());
    }
}