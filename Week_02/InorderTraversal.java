public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> visited = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root!= null || !stack.empty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            visited.add(root.val);
            root = root.right;
        }
        return visited;
    }
}