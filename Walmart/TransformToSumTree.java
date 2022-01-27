class Solution{
    public void toSumTree(Node root){
        findSum(root);
    }
    
    int findSum(Node node)
    {
        if(node == null)
            return 0;
        int l=findSum(node.left);
        int r=findSum(node.right);
        int d=node.data;
        node.data=l+r;
        return l+r+d;
    }
}
