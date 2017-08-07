//Binary tree top view O(n)
//uses treemap to maintain output order

/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Tree node class
class Node {
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}*/
class GfG
{
    TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        print_bottomview(root,0);
        Set set = tm.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry)itr.next();
            System.out.print((int)me.getValue()+" ");
        }
    }
    public void print_bottomview(Node node, int level)
    {
        if(node == null)
        {
            return;
        }
        if(tm.containsKey(level) != true)
            tm.put(level,node.data);
        print_bottomview(node.left,level-1);
        print_bottomview(node.right,level+1);
    }
}
	
