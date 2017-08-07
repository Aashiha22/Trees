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
    int isBST(Node root)  
    {
        boolean a = check_bst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return ((a == true) ? 1 : 0);
    }
    public boolean check_bst(Node node,int min,int max)
    {
        if(node == null)
        {
            return true;
        }
        if(node.data < min || node.data > max)
        {
            return false;
        }
        return(check_bst(node.left,min,node.data-1) && check_bst(node.right,node.data+1,max));
    }
}
