/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private int max_depth;
    public int maxDepth(Node root) {
        if(root == null)
            return 0;

        getMaxDepth(root,1);
        return max_depth;
    }
    public void getMaxDepth(Node cur,int depth){
        if(cur == null)
            return;
        
        max_depth = Math.max(depth,max_depth);
        for(Node child : cur.children){
            getMaxDepth(child,depth+1);
        }
    }
}