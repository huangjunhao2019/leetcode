class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class OrderTree{
    public static void main(String[] args){
        int[] a={
            2,1,3,4
        };
        TreeNode root=new TreeNode(a[0]);
        orderTree(a,root,1);
        printTree(root);
    }
    public static void orderTree(int[] a,TreeNode root,int index){

        if(index>=a.length)
           return ; 
        if(a[index]<=root.val && root.left==null){
            root.left=new TreeNode(a[index]);
            orderTree(a,root,index+1);
        }
        else  if(a[index]>root.val && root.right==null){
            root.right=new TreeNode(a[index]);
            orderTree(a,root,index+1);
        }
        else{
            if(a[index]<=root.val){
                orderTree(a,root.left,index);
                index++;
            }
            else{
                orderTree(a,root.right,index);
                index++;
            }
        }
    }
    
    public static void printTree(TreeNode root){
        if(root.left!=null)
             printTree(root.left);
        System.out.println(root.val);
        if(root.right!=null)
            printTree(root.right);
    }
} 
