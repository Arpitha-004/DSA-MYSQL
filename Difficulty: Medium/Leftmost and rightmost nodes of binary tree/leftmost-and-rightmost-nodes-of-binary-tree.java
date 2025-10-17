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
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                Node temp = q.peek();
                if(i==0 || i==n-1)
                    System.out.print(temp.data +" ");
                    
                q.poll();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
        }
    }
}