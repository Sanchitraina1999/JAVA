public class exampleOfClass {
    public static void main(String[] args){
        class student{
            String name;
            int marks;
            public void display(){
                System.out.println("Name: " + name);
                System.out.println("marks: "+ marks);
            }
        }
        student st1=new student();
        st1.name="Sanchit";
        st1.marks=10;
        st1.display();
        student st2=new student();
        st2.name="Ayush";
        st2.marks=20;
        st2.display();
    }
}