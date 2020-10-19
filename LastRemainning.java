import java.util.ArrayList;
public class LastRemaining{
    public static void main(String[] args){
        int n=5;
        int m=3;
        System.out.println(lastRemaining(n,m));
    }
    public static int lastRemaining(int n,int m){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        System.out.println("Hello");
        System.out.println(list.toString());
        while(list.size()!=1){
            list.remove((m-1)%(list.size()));
            System.out.println(list.get((m-1)%(list.size())));
        }
        return list.get(0);
    }
}
