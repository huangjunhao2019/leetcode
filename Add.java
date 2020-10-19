public class Add{
    public int addition(int x,int y){
        int z=x+y;
        return z;
    }
    public static void main(String[] args){
        int a=5,b=6;
        Add ob=new Add();
        int c=ob.addition(a,b);
        System.out.println("Add: "+c);
    }
}
