public class exampleOfClass {
    public static void main(String[] args){
        class student{
            String name;
            boolean marks;
            public void display(){
                System.out.println("Name: " + name);
                System.out.println("marks: "+ marks);
            }
        }
        student st1=new student();
        st1.name="Sanchit";
        st1.marks=true;
        st1.display();
        student st2=new student();
        st2.name="Ayush";
        st2.marks=false;
        st2.display();
    }
}