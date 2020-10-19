import java.util.ArrayList;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class AverageOfLevel{
    public static void main(String[] args){
        TreeNode tree=new TreeNode(0);
        tree.val=3;
        TreeNode left=new TreeNode(9);
        TreeNode right=new TreeNode(20);
        tree.left=left;
        tree.right=right;
        System.out.println(averageOfLevels(tree).toString());
    }
    public static  ArrayList<Double> averageOfLevels(TreeNode tree){
        ArrayList<Integer> count=new ArrayList<>();
        ArrayList<Double> result=new ArrayList<>();
        average(tree,0,result,count);
        for(int i=0;i<result.size();i++)
            result.set(i,result.get(i)/count.get(i));
        return result;
    }
    public static  void average(TreeNode t,int depth,ArrayList<Double> sum,ArrayList<Integer> count){
        if(t==null)
            return;
        if(depth<sum.size()){
            sum.set(depth,sum.get(depth)+t.val);
            count.set(depth,count.get(depth)+1);
        }
        else{
            sum.add(1.0*t.val);
            count.add(1);
        }
        average(t.left,depth+1,sum,count);
        average(t.right,depth+1,sum,count);
    }
}
