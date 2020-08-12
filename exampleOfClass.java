public class exampleOfClass {
    public static void main(String[] args){
        class student{
            String name;
            boolean marks;
            public void display(){
                System.out.println("Name: " + name);
                System.out.println("marks: "+ marks);
            }
            public void pass(){
                System.out.println("Name: " + name);
                System.out.println("marks: "+ marks);
            }
            public void display(){
                System.out.println("Name: " + name);
                System.out.println("marks: "+ marks);
            }
        }
        student st1=new student();
        st1.name="Sanchit";
        st1.marks=true;
        if(st1.marks)
            st1.pass();
        student st2=new student();
        st2.name="Ayush";
        st2.marks=false;
        if(st2.marks)
            st2.fail();
    }
}   