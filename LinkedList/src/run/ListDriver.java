package run;

import singly_linkedList.*;

public class ListDriver {
	public static void main(String[] args) {
		
		//LETS TEST TO SEE WE CAN HAVE ANY DATA TYPE WE WANT IN OUR NODE
		
		Node<Integer> n1 = new Node<>(15);
		Node<String> n2 = new Node<>("two hundred");
		Node<Boolean> n3 = new Node<>(true);
		Node<Double> n4 = new Node<>(2004.453451);
		
		//COOL STORY HANSEL, LETS PRINT THEM OUT NOW
		
		System.out.println("###PRINT GENERIC NODES###");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		//Seems like its working, Now lets try our list
		
		LList li = new LList();
		li.add(n1);
		li.add(n2);
		li.add(n3);
		li.add(n4);
		System.out.println("####FIRST PRINT####");
		li.printList(li);
		System.out.println("Size of the list is " + li.getSize());
		
		//lets remove 2 elements, we should be left with true
		
		li.remove();
		li.remove();
		
		//lets print it again
		System.out.println("####SECOND PRINT####");
		li.printList(li);
		System.out.println("Size of the list NOW is " + li.getSize());
		
		//lets directly add some objects with constructors to the list
		li.add(new Node<String>("HELLO"));
		li.add(new Node<String>("TIME TO GO WATCH GOT"));
		li.add(new Node<String>("AND GOODBYE"));
		//Final tests
		System.out.println("####FINAL PRINT####");
		li.printList(li);
		System.out.println("Size of the list FINALLY is " + li.getSize());
		
		li.kill();
		
		li.printList(li);
		System.out.println("Size of the list is " + li.getSize());
		
		

	}
	

}
//TIME TO CELEBRATE WITH GAMES