import org.junit.Test;

public class TreeNodeTest {
	
	
	@Test
	
	public void test() {
		
		TreeList a = new TreeList();
		Node root = null;

	/*	root = a.insert(root, 45);
		root = a.insert(root, 40);
		root = a.insert(root, 48);
		root = a.insert(root, 15);
		root = a.insert(root, 25);
		root = a.insert(root, 20);
		root = a.insert(root, 26);
		root = a.insert(root, 32);
		root = a.insert(root, 30);
		root = a.insert(root, 29);
		*/
		root = a.insert(root, 9);
		root = a.insert(root, 5);
		root = a.insert(root, 12);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 10);
		root = a.insert(root, 13);
		root = a.insert(root, 6);
		root = a.insert(root, 8);
		root = a.insert(root, 14);
		root = a.insert(root, 11);
	
		a.print(root);
		//boolean find = a.containsNodeRecursive(root, 55);
		//System.out.println("" + find);
		root=a.deleteNode(root,7);
		System.out.println();
	    //root=a.deleteRec(root,25);

		a.print(root);
		
	}

}
