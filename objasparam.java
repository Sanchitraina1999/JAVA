class Student{
    Result res;
    Student(Result res){
        System.out.println("Result in sem1: "+res.sem1);
        System.out.println("Result in sem2: "+res.sem2);
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
    }
}