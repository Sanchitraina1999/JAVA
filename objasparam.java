class Student{
    Result res;
    int h1,h2;
    Student(Result res){
       h1=res.sem1;
       h2=res.sem2;
    }
    void display(){
        System.out.println("Result in sem1: "+h1);
        System.out.println("Result in sem2: "+h2);
    }
}

class Result{
    int sem1,sem2;
}

class objasparam{
    public static void main(String[] args){
        Result res = new Result();
        res.sem1 =10;
        res.sem2=20;
        Student st=new Student(res);
        st.display();
    }
}