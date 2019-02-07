package dataAsgn2;


public class Q1_LL {

	public static void main(String[] args) {
	
		
		LinkedList sll=new LinkedList();
		
	sll.addFirst(10);
	sll.addFirst(11);
	sll.addFirst(12);
	sll.addFirst(13);
	sll.addFirst(14);
	sll.size();
	sll.show(sll.head);
	sll.getFirst();
	sll.getLast();
	sll.removeFirst();
	sll.getFirst();
	sll.show(sll.head);
	sll.size();
	sll.removeLast();
	sll.getFirst();
	
	sll.show(sll.head);
	sll.getFirst();
	sll.addLast(15);
	sll.addLast(16);
	sll.addLast(17);
	
	sll.show(sll.head);
	sll.getLast();
	sll.size();

	}

}
