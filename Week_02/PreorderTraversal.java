class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){return ret;}
        TreeNode n = root;

        while(n != null || !stack.empty()){
            while(n!=null){
                ret.add(n.val);
                stack.push(n);
                n = n.left;
            }
            n = stack.pop();
            n=n.right;
        }
        return ret;
    }
}