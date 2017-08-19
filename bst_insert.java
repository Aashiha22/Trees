 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) 
{    
    root = bst_insert(root,value);  
    return root;
}
static Node bst_insert(Node node, int value)
{
    if(node == null)
    {
        Node n1 = new Node();
        n1.data = value;
        n1.left = null;
        n1.right = null;
        node = n1;
    }
    else
    {
        if(value > node.data)
        {
            node.right = bst_insert(node.right,value);
        }
        else if(value < node.data)
        {
            node.left = bst_insert(node.left, value);
        }
    }
    return node;
}


