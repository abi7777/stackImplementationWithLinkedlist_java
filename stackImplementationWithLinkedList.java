class Main {

	public static void main(String[] args) {
		
		Stack<Integer> names = new Stack<>();
		
		names.push(1);
		names.push(2);
		names.push(3);
		names.push(4);
		
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}

	}

}
class Node<T> {

	private T data;
	
	private Node<T> nextNode;
	
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "" + data;
	}
}
 class Stack<T> {

	
	private Node<T> head;
	private int count;
	
	
	public void push(T data) {
		
		count++;
		
		// this is when the linked list is empty
		if(head == null) {
			head = new Node<>(data);
		} else {
			// the inked list already contains some items
			Node<T> oldHead = head;
			head = new Node<>(data);
			head.setNextNode(oldHead);
		}
	}
	
	
	public T pop() {
		
		if(isEmpty()) return null;
		
		T item = head.getData();
		head = head.getNextNode();
		count--;
		return item;
	}
	
	
	public int size() {
		return count;
	}
	
	
	public boolean isEmpty() {
		return count == 0;
	}
}
