package toDoList;
import java.util.function.Predicate;

public class LinkedList<T> {

	private Node<T> data;
	
	public LinkedList() {
		data = new EmptyNode();
	}
	
	public LinkedList(T m) {
		data = new TaskNode(m, new EmptyNode());
	}
	
	public LinkedList(Node data) {
		this.data = data;
	}
	
	public void addNode(T m) {
		data = new TaskNode(m, data);
	}
	
	public void removeAllNode() {
		data = null;
	}
	
	public T removeSingleNode(int position) {
		// check if position is in the range
	   if (position < 0 || position >= data.count()) {
	        throw new IllegalArgumentException ("Invalid input position for remove node");
	    }
	    return removeSingleNodeHelper(data, null, position);
	}
	
	private T removeSingleNodeHelper(Node<T> current, Node<T> previous, int position) {
	    // find right position to remove
	    if (position == 0) {
	        // if position is first node
	        if (previous == null) {
	            data = current.getNext(); // update head
	        } else {
	            previous.setNext(current.getNext()); // connect prev.next node with next node
	        }
	        return current.getData(); // return removed node
	    }
	    // move to next node
	    return removeSingleNodeHelper(current.getNext(), current, position - 1);
	}
	
	public String toString() {
		return (data != null) ? data.toString() : "";
	}
	
	public int count() {
		return data.count();
	}
	
	public T getNode(int position) {
		return data.getTaskNode(position);
	}
	
	public LinkedList getNodes(Predicate<T> tester) {
		return new LinkedList(data.getStatusNodes(tester));
	}
	
	public int countNodes(Predicate<T> tester) {
		return data.countNodes(tester);
	}
	
	public void printStatusNode(Predicate<T> tester) {
	  System.out.println(data.printStatusNode(tester));
	}
}
