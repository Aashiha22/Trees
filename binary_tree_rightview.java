//Print right view of binary tree.. used level and maxlevels
//used concept of printing first node in each level in reverse order

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    public int max_level = 0;
    void leftView(Node root)
    {
      print_left_view(root,1);
    }
    void print_left_view(Node node, int level)
    {
        if(node == null)
        {
            return;
        }
        if(max_level < level)
        {
            System.out.print(node.data+" ");
            max_level = level;
        }
        print_left_view(node.right,level+1);
        print_left_view(node.left,level+1);
    }
}
