package dataAsgn2;


public class QueTest {

	public static void main(String[] args) throws Exception {
		
		QueueLL obj=new QueueLL();
		
		obj.IsEmpty();
		obj.size();
		obj.enque(10);
		obj.enque(12);
		obj.enque(11);
		obj.show();
		obj.size();
		obj.IsEmpty();
		obj.deque();
		obj.show();
		obj.front();
		obj.deque();
		obj.front();
		obj.IsEmpty();
		obj.show();

	}

}
