import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val=x;
    }
}
public class LevelOrderBottom{
    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
       (root.right).left=new TreeNode(15);
       (root.right).right=new TreeNode(7);
      LinkedList<LinkedList<Integer>> list=levelOrderBottom(root);
       System.out.println(list.toString());
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root){
        Stack<List<Integer>> stack=new Stack<>();
        Vector<TreeNode> vec=new Vector<>();
        vec.add(root);
        solve(vec,stack);
        LinkedList<LinkedList<Integer>> list=new List<>();
        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }
    public static void solve(Vector<TreeNode> vec,Stack<List<Integer>> stack){
        LinkedList<Integer> list=new List<>();
        Vector<TreeNode> vec_temp=new Vector<>();
        while(!vec.isEmpty()){
            if(vec.get(0)!=null)
                list.add(vec.get(0).val);
            if(vec.get(0).left!=null)
                vec_temp.add(vec.get(0).left);
            if(vec.get(0).right!=null)
                vec_temp.add(vec.get(0).right);
            vec.remove(0);
            //到了下一层
            
        }
        stack.add(list);
        solve(vec_temp,stack);
        
    }
}
