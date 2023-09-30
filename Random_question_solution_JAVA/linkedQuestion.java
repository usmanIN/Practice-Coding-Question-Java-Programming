package Random_question_solution_JAVA;

public class linkedQuestion {
	
	Node head;
	private int size;
	linkedQuestion(){
		int size = 0;
	}
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}		
		currNode.next = newNode;
	}
	public void search(int search) {
		if(head == null) {
			return;
		}
		Node currNode = head;
		int index = 0;
		while(currNode !=null) {
			if(currNode.data == search) {
				System.out.println(search+ " at "+index);
			}
			currNode = currNode.next;
			index++;
		}
	}
	public void delete(int range) {
		if(head == null) {
			return;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			if(currNode.data == range) {
				currNode.next = null;
			}else {
				currNode = currNode.next;
			}
		}
	}
	public void print() {
		if(head == null) {
			return;
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
		linkedQuestion list = new linkedQuestion();
		
		for(int i=1; i<=50;i++) {
			list.add(i);
		}
		
		list.print();
		list.delete(11);
		list.print();

	}

}
