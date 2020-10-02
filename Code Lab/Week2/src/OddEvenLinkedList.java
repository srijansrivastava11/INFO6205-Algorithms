
public class OddEvenLinkedList {
	
	// Linked List Node 
	static class ListNode 
	{ 
		int data; 
		ListNode next; 
	} 
	
	// A utility function to print a linked list 
	static void printlist(ListNode node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + "->"); 
			node = node.next; 
		} 
		System.out.println("NULL") ; 
	} 
	

	// A utility function to create a new node 
	static ListNode newNode(int key) 
	{ 
		ListNode temp = new ListNode(); 
		temp.data = key; 
		temp.next = null; 
		return temp; 
	} 

	public static void main(String[] args) 
	{ 
		ListNode head = newNode(1); 
		head.next = newNode(2); 
		head.next.next = newNode(3); 
		head.next.next.next = newNode(4); 
		head.next.next.next.next = newNode(5); 

		System.out.println("Given Linked List"); 
		printlist(head); 

		head = oddEvenLsit(head); 

		System.out.println("Modified Linked List"); 
		printlist(head); 
	} 
	
	public static ListNode oddEvenLsit(ListNode head) {
	if (head==null) return null;
	
	ListNode odd = head;
	ListNode even = head.next;
	ListNode evenHead = even;
	
	while (even != null && even.next !=null) {
		odd.next=even.next;
		odd=even.next;
		even.next=odd.next;
		even = even.next;
	}
	
	odd.next= evenHead;
	return head;	
	}
}
