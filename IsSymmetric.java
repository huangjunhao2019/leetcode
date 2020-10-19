class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val=x;
    }
}
/**
 * 这一个对二叉树进行初始化，主要用到了完全二叉树中
 * 如果root是i，那么左节点就是i*2+1,右节点就是i*2+2
 */
public class IsSymmetric{
    public static void main(String[] args){
        int[] a={
            1,2,2,3,4,4,3
        };
        TreeNode tree[]=new TreeNode[a.length];
        for(int i=0;i<a.length;i++)
            tree[i]=new TreeNode(a[i]);
        for(int i=0;i<a.length/2;i++){
            if(i*2+1<a.length)
                 tree[i].left=tree[i*2+1];
            if(i*2+2<a.length)
                tree[i].right=tree[i*2+2];
        }
        System.out.println(isSymmetric(tree[0]));
    }
    public static boolean isSymmetric(TreeNode root){
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        if(root.left==null || root.right==null)
            return false;
        return isSame(root.left,root.right);
    }
    public static boolean isSame(TreeNode a,TreeNode b){
        if(a==null && b==null)
            return true;
        if(a==null || b==null)
            return false;
        if(a.val!=b.val)
            return false;
        return isSame(a.left,b.right) && isSame(a.right,b.left);
    }
}
