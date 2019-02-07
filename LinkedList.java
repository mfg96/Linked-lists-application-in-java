package dataAsgn2;

public class LinkedList {
	
	Node head;
	Node n;

	
void addFirst(int dig) {  
	
	Node newHead=new Node();
	newHead.data=dig;
	newHead.next=head;
	head=newHead;
		
}

void removeFirst() {	
	
	head=head.next;
	
}	

void addLast(int dig) {  
	
	Node node=new Node();
	node.data=dig;
	node.next=null;
	
	if(head==null) {
		head=node;
		return;
		}
	
		n=head;
		
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;

}

void removeLast() {  
	
	Node current=head;
	while(current.next.next!=null) {
		current=current.next;
	}
	current.next=null;
	
}

void getFirst() {  
	
	if(head!=null)
		System.out.println("The head value is: "+head.data);
	else
		System.out.println("There is nothing!!");
	
	
}

void getLast() {    
	
	Node current=head;
	while(current.next!=null) {
			
			current=current.next;
	}
	
	System.out.println("The value of tail is: "+current.data);
	
	
}

void size() {  
	
	int counter=0;
	Node current=head;
	while(current.next!=null) {
		counter++;
		current=current.next;
	}
	counter++;
	System.out.println("The size is: "+counter);
	
}

void show(Node noder) {  //worst case is if there are n number of items and we have to traverse thru all of them 
	
	//Node node=head;
	
	//recursive algorithm
	if(noder.next!=null) {
		System.out.println(noder.data);
		show(noder.next);
		
	}
	else
		System.out.println(noder.data);
	
	//iterative algorithm
	/*while(node.next!=null) {
		System.out.println(node.data);
		node=node.next;
	}*/
	
	
}

}
