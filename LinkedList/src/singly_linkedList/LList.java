/*
 * THE PURPOSE OF THIS CLASS IS TO WRAP NODES AND PERFORM OPERATIONS ON THEM BASED
 * ON THE RULES OF A LIST
 */
package singly_linkedList;

public class LList{

	//Node of any type

	Node<?> head;
	
	int size;
	
	//getters and setters
	
	public Node<?> getHead() {
		return head;
	}

	private void setHead(Node<?> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}

	LList(Node<?> n){
		head = n;
	}
	
	//add method
	
	public void add(Node<?> n) {
		if(head == null) {
			head = n;
			setSize(size+1);
		}
			
		else {
			n.setNext(head);
			head = n;
			setSize(size+1);
		}
	}
	
	//remove method
	
	public void remove() {
		
			head = head.getNext();
			setSize(--size);
		
	}
	//recursive print all
	
	public void kill() {
		System.out.println("RESETTING THE LIST");
		head = null;
		size=0;
	}
	
	public void printList(LList li) {
		
		//put this here so it gets destroyed with method, 
		//if you put it in loop youll start incrementally increasing your prints
		
		Node<?> iterate = head;
		
		for(int i = 0;i<size;i++) {
			if(head == null)
				return;
			else {
				if(iterate == null) {
					System.out.println("There are no more nodes in the list!");
					return;
				}	
				System.out.println(iterate);
				iterate = iterate.getNext();
			}
		}
		
	}
	
	//CONSTRUCTOR
	public LList() {	
		setHead(null);
		setSize(0);
	}
}


