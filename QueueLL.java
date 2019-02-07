package dataAsgn2;

public class QueueLL {
	
	
	Node1 head1=null;
	Node1 n1;
	Node1 tail;

	
	void deque() {	
		
		head1=head1.next1;
		
	}	
	
	void enque(int dig) {  
		
		Node1 node1=new Node1();
		node1.data1=dig;
		node1.next1=null;
		
		if(head1==null) {
			head1=node1;
			tail=head1;
			return;
			}
		
		
		tail.next1=node1;
		tail=tail.next1;
		
			/*n1=head1;
			
			while(n1.next1!=null) {
				n1=n1.next1;
			}
			n1.next1=node1;*/
	
	}
	
	
	
	void front() {  
		
		if(head1!=null)
			System.out.println("The head value is: "+head1.data1);
		else
			System.out.println("There is nothing!!");
		
		
	}
	
	
	
	void size() {  
		
		int counter=0;
		
		if(head1==null) {
			System.out.println("The size is: "+counter);
			return;
		}
		
		Node1 current1=head1;
		
		
		while(current1.next1!=null) {
			counter++;
			current1=current1.next1;
		}
		counter++;
		System.out.println("The size is: "+counter);
		
		
	}
	
	void IsEmpty() {
		
		if(head1==null) {
			System.out.println("The list is empty!!");
		}
		else {
			System.out.println("The list is not empty");
		}
	}
	
	void show() {  //worst case is if there are n number of items and we have to traverse thru all of them 
		
		Node1 node1=head1;
		
		while(node1.next1!=null) {
			System.out.println(node1.data1);
			node1=node1.next1;
		}
		System.out.println(node1.data1);
		
	}
	
	void showr(Node1 noder1) {  //worst case is if there are n number of items and we have to traverse thru all of them 
		
		//Node node=head;
		
		//recursive algorithm
		if(noder1.next1!=null) {
			System.out.println(noder1.data1);
			showr(noder1.next1);
			
		}
		else
			System.out.println(noder1.data1);
		
		//iterative algorithm
		/*while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}*/
		
		
	}
	
	int dequer() {	
		
		int r=head1.data1;
		head1=head1.next1;
		return r;
		
	}
	
	int sizer() {  
		
		int counter=0;
		
		if(head1==null) {
			//System.out.println("The size is: "+counter);
			return counter;
		}
		
		Node1 current1=head1;
		
		
		while(current1.next1!=null) {
			counter++;
			current1=current1.next1;
		}
		counter++;
		//System.out.println("The size is: "+counter);
		return counter;
		
		
	}


}
