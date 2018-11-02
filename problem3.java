package exam;

public class problem3 {
	private int parent;
	private int child;
	
	private class Node {
		Node next;
		int item;
		Node key;
		Node right;
		Node left;
	}
	
	public Node search (Node key){
		while (key != null){
			if (key > parent){
				search(node.right);
			}
			else(key < parent){
				search (node.left);
			}
		}
	}

	public static void main (String [] args){
		
	}
}
