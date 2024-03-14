package toDoList;
import java.util.function.Predicate;

public class TaskNode<T> implements Node<T>{

	private T data;
	private Node nextTask;
	
	public TaskNode(T data, Node nextTask) {
		
		this.data = data;
		this.nextTask = nextTask;
	}
	
	@Override
	public int count() {
		return 1+ nextTask.count();
	}
	
	public String toString() {
		return data.toString() + nextTask.toString();
	}
	
	@Override
	public T getTaskNode(int position) {
		if(position == 0) {
			return (T) data.toString();
		}
		
		return (T) nextTask.getTaskNode(--position);
	}
	
	@Override
	public Node getStatusNodes(Predicate<T> tester) {
		if(tester.test(data)) {
			return new TaskNode(data, nextTask.getStatusNodes(tester));
		}
		else {
			return nextTask.getStatusNodes(tester);
		}
	}
	
}
