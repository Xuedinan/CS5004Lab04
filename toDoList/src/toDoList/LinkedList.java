package toDoList;
import java.util.function.Predicate;

public class LinkedList<T> implements PrintNode<T>, RemoveNode<T> {

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

	@Override
	public Node removeNodes(Predicate<T> tester) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAllNodes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printExpiredNode(Predicate<T> tester) {
		// TODO Auto-generated method stub
	}

}
