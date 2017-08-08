// Print vertical view of the binary tree
// used treemap and arraylist
/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
/* Should print vertical order such that each vertical line
    is separated by $ */
class GfG
{
    TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<Integer,ArrayList<Integer>>();
    void verticalOrder(Node root) 
    {
        print_vertical(root,0);
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(tm.values());
        for(int i=0;i<list.size();i++)
        {
            ArrayList<Integer> list1 = new ArrayList<Integer>(list.get(i));
            for(int j=0;j<list1.size();j++)
            {
                System.out.print(list1.get(j)+" ");
            }
            System.out.print("$");
        }
    }
    public void print_vertical(Node node,int level)
    {
        if(node == null)
        {
            return;
        }
        if(tm.containsKey(level))
        {
            ArrayList<Integer> arr = tm.get(level);
            arr.add(node.data);
            tm.put(level,arr);
        }
        else
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(node.data);
            tm.put(level,arr);
        }
        print_vertical(node.left,level-1);
        print_vertical(node.right,level+1);
    }
}
