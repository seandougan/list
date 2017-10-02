package single_list;

import java.util.Iterator;

public class List<T> implements Iterable {
	
	Node<T> head = null;
	
	//add, remove, get, print, size, print list, reset, insert
	
	public void add(Node<T> node) {
		
		if(head!=null)
			head = node;
		else
			head.setNext(node);
			head = node;
	}
	
	public void remove() {
		
		
	}
	
	//node static helper class
	public static class Node<T>{
		
		//node holds generic data set and a reference to the next object
		//NODE<T> points to the type of this class
		//Type T is a generic type parameter to hold any collections
		
		private Node<T> next;
		private T data;
		
		//GET/SET DATA
		
		public T getData() { return data;}
		
		private void setData(T input) {data = input;}
		
		//GET/SET NEXT
		
		public Node<T> getNext(){return this.next;}
		
		public void setNext(Node<T> input) {next = input;}
		
		public Node(T input){
			next = null;
			setData(input);
		}
	}

//####################################################################
//HELPER METHODS

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		StringBuffer value = new StringBuffer();
		
		
		}
}
