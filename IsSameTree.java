class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val=x;
    }
}
public class IsSameTree{
    public static void main(String[] args){
        int[] a={
            1,2,3
        };
        int[] b={
            1,2,3
        };
       TreeNode c=new TreeNode(1);
       c.left=new TreeNode(2);
       c.right=new TreeNode(3);
       TreeNode d=new TreeNode(1);
       d.left=new TreeNode(2);
       d.right=new TreeNode(3);
       System.out.println(isSameTree(c,d));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        if(p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
