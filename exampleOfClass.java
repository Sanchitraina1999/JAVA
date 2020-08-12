public class exampleOfClass {
    public static void main(String[] args){
        class student{
            String name;
            boolean marks;
            public void display(){
                System.out.println("Name: " + name);
            }
            public void pass(){
                display();
                System.out.println("Passed!");
            }
            public void fail(){
                System.out.println("Failed");
            }
        }
        student st1=new student();
        st1.name="Sanchit";
        st1.marks=true;
        if(st1.marks)
            st1.pass();
        student st2=new student();
        st2.name="Ayush";
        st2.marks=true;
        if(st2.marks)
            st2.fail();
    }
}   