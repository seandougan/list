/*
 * The purpose of this class is to provide 
 */

//package name
package singly_linkedList;

/**
 * 
 * @author Sean Dougan - Toronto, Ontario
 *
 * @param <T>
 * <p>
 * A generic type T. To create this object you must invocate 
 * with an explicit runtime parameter; such as Node<Integer>.
 * </p>
 */
/*
 * This is a Node on the Linked List. It can hold data 
 * of any type as long as it is declared at runtime
 */

public class Node<T> {
	
	//FIELDS############################################
	
	//A node of any type using type paramter wildcards - wildcard = java.lang.Object
	
	
	Node<?> next;
	
	//Data of the type of your invocated type param T
	
	T data;

	//METHODS###########################################
	
	//getters
	
	public Node<?> getNext() {
		return next;
	}
	
	public T getData() {
		return data;
	}

	//setters
	
	protected void setNext(Node<?> next) {
		this.next = next;
	}

	private void setData(T data) {
		this.data = data;
	}
	
	//CONSTUCTOR
	
	public Node(T d) {
		next = null;
		setData(d);
	}
	
	//override toStrng or will return object reference
	@Override
	public String toString() {
		
		return "The value of this Node is "+data;
	}
	
	
	
	
	
	
	
}
