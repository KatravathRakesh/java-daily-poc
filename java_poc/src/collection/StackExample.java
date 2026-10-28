package collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(20);
		s.push(40);
		s.push(50);
		
		System.out.println("Orginal Stack : "+s);
		
//		Check whether 20 exists in the stack.
		System.out.println("Does 20 exit ? : "+ s.contains(20));
		
//		Remove the first occurrence of 20 using remove(Object).
		System.out.println("Remove the first occurrence of 20 :" + s.remove((Object) 20));
//		int idx = s.indexOf(20);
////		int idx = s.lastIndexOf(20);
//		if(idx != -1) {
//			System.out.println("Remove the first occurrence of 20 :"+s.remove(idx));
//		}
		
		
//		Remove the top element using pop().
		System.out.println("Remove the top element : "+s.pop());
		
		
		System.out.println("After Update Stack : "+s);
		

	}

}
