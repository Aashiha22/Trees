	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) 
    {
      	int c = check_height(root);
        return c-1;
    }
    static int check_height(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            int l_count = check_height(node.left);
            int r_count = check_height(node.right);
            if(l_count > r_count)
            {
                return l_count+1;
            }
            else 
            {
                return r_count+1;
            }
        }
    }
