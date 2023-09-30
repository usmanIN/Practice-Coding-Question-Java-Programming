package Random_question_solution_JAVA;

public class reverseLinked {
	
	Node head;
	private int size;
	reverseLinked(){
		size = 0;
	}
	
	
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			size ++;
		}
	}
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return ;
		}
		
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;		
	}
	
	public void reverse() {
		if(head == null) {
			return;
		}
		Node prev = null;
		Node currNode = head;
		Node next = null;
		while(currNode!=null) {
			next = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = next;
		}
		head = prev;
	}
	
	public Node recursion(Node node) {
		if(node == null || node.next == null) {
			return node;
		}
		Node nextNode = recursion(node.next);
		node.next.next = node;
		node.next = null;		
		return nextNode;
	}
	
	
	
	public void print() {
		if(head == null) {
			return ;
		}
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseLinked list = new reverseLinked();
		list.add(1);
		list.add(2);
		list.add(3);
		list.print();
//		list.reverse();
//		list.print();
		list.head =  list.recursion(list.head);  
		list.print();
	}

}
