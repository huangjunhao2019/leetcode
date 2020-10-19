import java.util.ArrayList;
public class LastRemaining{
    public static void main(String[] args){
        int n=10;
        int m=17;
        System.out.println(lastRemaining(n,m));
    }
    public static int lastRemaining(int n,int m){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int index=0;
        int size=list.size();
        for(int i=0;i<size-1;i++){
            index=(index+m-1)%list.size();
            list.remove(index);
           // System.out.println(list.toString());            
        }
        return list.get(0);
    }
}
