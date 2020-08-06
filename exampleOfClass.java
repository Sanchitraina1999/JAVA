public class exampleOfClass {
    public static void main(String[] args){
        class MathAdd{
            int num1,num2;
            public int add(){
                return num1 + num2;
            }
        }
        MathAdd addition = new MathAdd();//creates instance of the class i.e. object
        addition.num1=10;
        addition.num2=20;
        System.out.println(addition.add());
    }
}