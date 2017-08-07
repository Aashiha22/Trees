//check bst --> inorder ascending or not
//O(nlogn)--> sorting

/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*  A Binary Search Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    public ArrayList<Integer> arr = new ArrayList<Integer>();
    int isBST(Node root)  
    {
        check_bst(root);
        ArrayList<Integer> copy = new ArrayList<Integer>(arr);
        Collections.sort(copy);
        if(copy.equals(arr))
            return 1;
        else
            return 0;
    }
    public void check_bst(Node node)
    {
        if(node == null)
        {
            return;
        }
        check_bst(node.left);
        arr.add(node.data);
        check_bst(node.right);
    }
}
