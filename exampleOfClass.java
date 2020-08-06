import java.util.ArrayList;
;public class exampleOfClass {
    public static void main(String[] args){
        ArrayList<int> list = new ArrayList<int>();
        list.add(1);
        while(list.hasMoreElements()){
            System.out.print(list);
        }
    }
}