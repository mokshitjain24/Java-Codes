
// Class Node
class Node {
	
	int Value;
	Node Left, Right;
	
	public Node(int V) {
		
		//Giving the values for Value, Left and Right
		Value = V;
		Left = null;
		Right = null;
		
	}
}
 
// Class BT1
class BT
{
	
	// Pointer to Root node of created doubly linked list
	Node Root;
	
	// Pointer to Head node of created doubly linked list
	Node Head;
	
	// Initializes the  previously visited node as null.
	// Static so that the same value is accessible in all the recursive calls
	static Node previous = null;

	// Recursive function to create a binary tree using linked list.
	//  Root of Binary Tree
	void BinaryTreeusingDoubleLinkedList(Node Root)
	{
		// Base case
		if (Root == null)
			return;

		// Recursive call on the left subtree
		BinaryTreeusingDoubleLinkedList(Root.Left);

		// Converting this node
		if (previous == null)
			Head = Root;
		else
		{
			Root.Left = previous;
			previous.Right = Root;
		}
		previous = Root;

		// Recursive call on the right subtree
		BinaryTreeusingDoubleLinkedList(Root.Right);
	}

	// Function to print tree nodes in Inorder ( LEFT - ROOT - RIGHT )
    public void Inorder(Node node)
    {
        if (node != null) {
            Inorder(node.Left);
            System.out.print(Root.Value + " --> ");
            Inorder(Root.Right);
        }
    }
    
    // Function to print tree nodes in Preorder (ROOT - LEFT  - RIGHT )
    public void Preorder(Node node)
    {
        if (node != null) {
        	
            System.out.print(Root.Value + " --> ");
            Preorder(Root.Left);
            Preorder(Root.Right);
        }
    }
    
    // Function to print tree nodes in Postorder (LEFT  - RIGHT - ROOT )
    public void Postorder(Node node)
    {
        if (node != null) {
        	
            Postorder(Root.Left);
            Postorder(Root.Right);
            System.out.print(Root.Value + " --> ");
        }
    }


	// Main Function
	public static void main(String[] args)
	{
		// Creating an object
		BT tree = new BT();
		
		//Inserting the nodes
		tree.Root = new Node(1);
		tree.Root.Left = new Node(2);
		tree.Root.Right = new Node(3);
		tree.Root.Left.Left = new Node(4);
		tree.Root.Left.Right = new Node(5);
		tree.Root.Right.Left = new Node(6);
        tree.Root.Right.Right = new Node(7);

        tree.Root.Left.Left.Left = new Node(8);
        tree.Root.Left.Left.Right = new Node(9);

		// Calling the BinaryTreeusingDoubleLinkedList Function
		tree.BinaryTreeusingDoubleLinkedList(tree.Root);
		
		//Print the Inorder Transversal
		
		System.out.println("Inorder Transversal: ");
		tree.Inorder(tree.Root);
		System.out.print("NULL");
        System.out.println();
        System.out.println();
        
        //Print the Preorder Transversal
        
        System.out.println("Preorder Transversal: ");
		tree.Preorder(tree.Root);
		System.out.print("NULL");
        System.out.println();
        System.out.println();
        
      //Print the Postorder Transversal
        
        System.out.println("Postorder Transversal: ");
		tree.Postorder(tree.Root);
		System.out.print("NULL");
        System.out.println();
        System.out.println();

	}
	
 }
