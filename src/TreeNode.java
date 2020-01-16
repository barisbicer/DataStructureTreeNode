class Node {
	
	int data;
	Node left;
	Node right;

}

class TreeList {
	
   public Node createNewNode(int k) {
	   Node a=new Node();
	   a.data=k;
	   a.left=null;
	   a.right=null;
	   
	   return a;
   }

	public Node insert (Node node,int data) {
		
		if(node==null) {
			return createNewNode(data);
		}
		if(data<node.data)
			node.left=insert(node.left,data);
		else if(data > node.data)
		     node.right=insert(node.right,data);
	
		return node;
	}
	
	
	public boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.data) {
	        return true;
	    } 
	    return value < current.data ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
	}
		
	public void print(Node r)
	{
	if( r != null )
	{
	print(r.left);
	System.out.print(r.data + " ");
	print(r.right);
	}
	}
	
	
  public Node deleteNode(Node root,int data) {
	  
	  if(root==null) return root;
	  
	  if(data<root.data)
		  root.left=deleteNode(root.left, data);
	  else if(data> root.data)
		  root.right=deleteNode(root.right, data);
	  else
	  {
		   if (root.left == null) 
               return root.right; 
           else if (root.right == null) 
               return root.left; 
		   
	     root.data=detectMinvalueforRight(root.right);
		 System.out.println("Min value:"+root.data);   
		 root.right=deleteNode(root.right,root.data);  
 
	  }
	  
	  return root;
	  
	  
  }
	
	
	  
    private int detectMinvalueforRight(Node root) {

    	int minvalue=root.data;
    	
    	while(root.left!= null) {
    		
    		minvalue=root.left.data;
    		root=root.left;
    		
    	}
    	
	return minvalue;
}

    
	/* A recursive function to insert a new key in BST */
   public Node deleteRec(Node root, int key) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key < root.data) 
            root.left = deleteRec(root.left, key); 
        else if (key > root.data) 
            root.right = deleteRec(root.right, key); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.data = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.data); 
        } 
  
        return root; 
    } 
  
    int minValue(Node root) 
    { 
        int minv = root.data; 
        while (root.left != null) 
        { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    } 


}
