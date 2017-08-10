//Print tree in spiral form
/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
      void printSpiral(Node root) 
      {
          if(root == null)
          {
              return;
          }
          Stack<Node> s1 = new Stack<Node>();
          Stack<Node> s2 = new Stack<Node>();
          s1.push(root);
          while(!s1.isEmpty() || !s2.isEmpty())
          {
              while(!s1.isEmpty())
              {
                  Node temp = s1.peek();
                  System.out.print(temp.data+" ");
                  s1.pop();
                  if(temp.right != null)
                  {
                      s2.push(temp.right);
                  }
                  if(temp.left != null)
                  {
                      s2.push(temp.left);
                  }
              }
              while(!s2.isEmpty())
              {
                  Node temp = s2.peek();
                  System.out.print(temp.data+" ");
                  s2.pop();
                  if(temp.left != null)
                  {
                      s1.push(temp.left);
                  }
                  if(temp.right != null)
                  {
                      s1.push(temp.right);
                  }
              }
          }
      }
}
