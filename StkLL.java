package dataAsgn2;

public class StkLL {

	
	Node2 head2;
	Node2 n2;

		

void Push(char dig) {  
	
	Node2 node2=new Node2();
	node2.data2=dig;
	node2.next2=null;
	
	if(head2==null) {
		head2=node2;
		return;
		}
	
		n2=head2;
		
		while(n2.next2!=null) {
			n2=n2.next2;
		}
		n2.next2=node2;

}

void Pop() {  
	
	Node2 current2=head2;
	if(current2==null||current2.next2==null) {
		head2=null;
		return;
	}
	while(current2.next2.next2!=null) {
		current2=current2.next2;
	}
	current2.next2=null;
	//head2=null;
	
}


char Top() {    
	
	Node2 current2=head2;
	while(current2.next2!=null) {
			
			current2=current2.next2;
	}
	
	return current2.data2;
	
	
}

void size() {  
	
	int counter=0;
	Node2 current2=head2;
	while(current2.next2!=null) {
		counter++;
		current2=current2.next2;
	}
	counter++;
	System.out.println("The size is: "+counter);
	
}

boolean IsEmpty() {
	
	if(head2==null) {
		return true;
	}
	else {
		return false;
	}
}

void show() {  //worst case is if there are n number of items and we have to traverse thru all of them 
	
	Node2 node2=head2;
	
	while(node2.next2!=null) {
		System.out.println(node2.data2);
		node2=node2.next2;
	}
	System.out.println(node2.data2);
	//System.out.println(head2.data2);
	
}


}
