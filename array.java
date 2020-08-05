class array{
    public static void main(String[] args){
        int ar[];
        ar=new int[10];
        for(int i=0;i<10;i++)
            ar[i]=i+1;
        for(int i=0;i<10;i++)
            System.out.print(ar[i]+" ");
        System.out.println(returnElement(ar,9));
    }
    static int returnElement(int ar[],int n){
        return ar[n];
    }
}