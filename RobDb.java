public class RobDb{
    public static void main(String[] args){
        int[] a={2,7,9,3,1};
        System.out.println(rob(a));
    }
    public static int rob(int[] a){
        int[] db=new int[a.length];
        db[0]=a[0];
        db[1]=Math.max(a[0],a[1]);
        db[2]=Math.max(a[2]+a[0],a[1]);
        for(int i=3;i<a.length;i++){
            int max1=Math.max(db[i-1],a[i]+db[i-2]);
            db[i]=Math.max(max1,a[i]+db[i-3]);
        }
        return db[a.length-1];
    }
}
