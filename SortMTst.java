package dataAsgn2;

public class SortMTst {

	public static void main(String[] args) throws Exception {
		
		QueueLL obj1=new QueueLL();
		QueueLL obj2=new QueueLL();
		QueueLL S=new QueueLL();
		
		
		int a,b;
		
		obj1.IsEmpty();
		obj1.size();
		obj1.enque(1);
		obj1.enque(3);
		//obj1.enque(5);
		//obj1.enque(7);
		//obj1.enque(9);
		obj1.show();
		obj1.size();
		obj2.enque(2);
		obj2.enque(3);
		//obj2.enque(6);
		obj2.enque(8);
		obj2.enque(10);
		obj2.IsEmpty();
		obj2.show();
		obj2.size();
		
		int x1=obj1.sizer();
		int x2=obj2.sizer();
		
		a=obj1.dequer();
		b=obj2.dequer();
		
		while(true) {
			
		System.out.println("Inside loop");	
		System.out.println(a);
		System.out.println(b);
		
		if(a<b) {
			S.enque(a);
			S.enque(b);
		}
		else if(b<a) {
			S.enque(b);
			S.enque(a);
		}
		else if(a==b) {
			S.enque(a);
			
		}
		
		--x1;
		--x2;
		
		if(x1==0||x2==0) {
			break;}
		
		a=obj1.dequer();
		b=obj2.dequer();
		
		
		
		
		} //end of the loop
		
		/*a=obj1.head1.data1;
		b=obj2.head1.data1;
		
		if(a<b) {
			S.enque(a);
			S.enque(b);
		}
		else if(b<a) {
			S.enque(b);
			S.enque(a);
		}
		else if(a==b) {
			S.enque(a);
		}*/
		
		
		
		System.out.println("This is S");
		S.showr(S.head1);
		
	

	}

}
