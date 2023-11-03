package Learning_Basic_DataStructures_Java;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	public void addFirst(int d) {
		Node node = new Node(d);
		if(head == null) {
			head = node;
			return;
		}
		node.next = head;
		head = node;
		
	}
	public void addLast(int d) {
		Node node = new Node(d);
		if(head == null) {
			head = node;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = node;
		
		
	}
	
	public void removeLast() {
		if(head == null) {
			return;
		}
		Node currNode = head;
		while(currNode.next.next != null) {
			currNode = currNode.next;
		}
		currNode.next = null;
	}
	
	public void removeFirst() {
		if(head == null) {
			return;
		}
		Node currNode = head;
		head = currNode.next;		
	}
	
	public  int getSize() {
			int size = 0;
			if(head == null) {
				return 0;
			}
			Node currNode = head;
			
			while(currNode != null) {
				size = size + 1;
				currNode = currNode.next;
			}
			return size;
	}
	public void reverse() {
		if(head == null) {
			return;
		}
		
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr!= null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public void getMid() {
		if(head == null) {
			return;
		}
		int size = getSize();
		int midlength = size/2;
		
		Node temp = head;
		
		while(midlength != 0) {
			temp = temp.next;
			midlength--;			
		}		
		System.out.print(temp.data);
	}
	
	public void  printNode() {
		
		if(head == null) {
			return;
		}
		Node currNode = head;
		
		while(currNode!= null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.addFirst(3);
		list.addLast(2);
		list.addFirst(1);
		list.addLast(4);
		list.addFirst(5);
		list.addLast(6);
		list.printNode();
		list.getSize();
		list.getMid();
		list.reverse();
		
//		list.removeLast();
//		list.printNode();
//		list.removeFirst();
		list.printNode();
//		list.getSize();
		
	}

}
