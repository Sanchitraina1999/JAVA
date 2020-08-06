import java.util.ArrayList;
;public class exampleOfClass {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sanchit");
        while(list.hasMoreElements()){
            System.out.print(list);
        }
    }
}