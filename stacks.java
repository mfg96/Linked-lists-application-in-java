package dataAsgn2;

import java.util.Scanner;

public class stacks {

	public static void main(String[] args) throws Exception {
		
		StkLL obj=new StkLL();
		
		Scanner sc=new Scanner(System.in);  //O(1)
		String in=new String(); //O(1)
		
		System.out.print("Please input the string: ");  //O(1)
		in=sc.nextLine(); //O(1)
		
		sc.close();
		System.out.println(in); //O(n)
		
	
		
		long start=System.currentTimeMillis();
		
		for(int i=0;i<in.length();i++) {  //O(n)
			
			if(in.charAt(i)=='{'||in.charAt(i)=='['||in.charAt(i)=='(') {
				obj.Push(in.charAt(i));
				obj.show();
				
			}
			else if(in.charAt(i)=='}'||in.charAt(i)==']'||in.charAt(i)==')') {
				if(obj.IsEmpty()) {
					System.out.println("Braces are unbalanced");
					return;
				}
				else {
					if(obj.Top()=='{'&&in.charAt(i)=='}'||obj.Top()=='['&&in.charAt(i)==']'||obj.Top()=='('&&in.charAt(i)==')') {
						
						obj.Pop();
						
						
					}
						
				}
				
					
			}
			else if(in.charAt(i)==' '||in.charAt(i)=='0'||in.charAt(i)=='1'||in.charAt(i)=='2'||in.charAt(i)=='3'||in.charAt(i)=='4'||in.charAt(i)=='5'||in.charAt(i)=='6'||in.charAt(i)=='7'||in.charAt(i)=='8'||in.charAt(i)=='9'||in.charAt(i)=='+'||in.charAt(i)=='-'||in.charAt(i)=='*'||in.charAt(i)=='/') {
				continue;
			}
			else {
				System.out.println("String is not correct!!");
				return;
			}
		}
		
		
		if(obj.IsEmpty())
			System.out.println("Braces are balanced!!");
		else
			System.out.println("Braces are unbalanced!!");
		
		
		long end=System.currentTimeMillis();
		
		System.out.println(end-start);


	}

}
