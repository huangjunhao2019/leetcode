import java.util.Scanner;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class LevelTral{
    public static void main(String[] args){
        TreeNode root =new TreeNode(0);
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        root.val=num;
        initTreeLevel(root);
        printTreeLevel(root);
    }
    public static void initTreeLevel(TreeNode root){
        Scanner scan=new Scanner(System.in);
        if(root.val==0)
            return null;
        else{
            int left=scan.nextInt();
            int right=scan.nextInt();
            (root.left).val=left;
            (root.right).val=right;
            init
        }
    }
}
