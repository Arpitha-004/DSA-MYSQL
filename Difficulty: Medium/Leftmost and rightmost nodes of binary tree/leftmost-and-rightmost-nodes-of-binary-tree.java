/* Node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Tree {
    public static void printCorner(Node node) {

        // add your code here
        List<List<Integer>> lst = new ArrayList<>();
        sideview(lst,node,0);
        for(int i=0;i<lst.size();i++){
            int n = lst.get(i).size();
            System.out.print(lst.get(i).get(0)+" ");
            if(n>1)
                System.out.print(lst.get(i).get(n-1)+" ");
            
        }
    }
    public static void sideview(List<List<Integer>> lst, Node root, int level){
        if(root==null)
            return;
    
        if(lst.size()==level)
            lst.add(new ArrayList<>());
            
        lst.get(level).add(root.data);
    
        sideview(lst,root.left,level+1);
        sideview(lst,root.right,level+1);
    }
}