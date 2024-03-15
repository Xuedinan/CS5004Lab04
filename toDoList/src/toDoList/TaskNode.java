package toDoList;
import java.util.function.Predicate;

public class TaskNode<T> implements Node<T> {

	private T data;
	private Node nextTask;
	
	public TaskNode(T data, Node nextTask) {
		this.data = data;
		this.nextTask = nextTask;
	}
	
	public T getData(){
		return data;
	}
	
	public Node<T> getNext(){
		return nextTask;
	}
	
	public void setNext(Node<T> nextTask) {
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
	
	@Override
	public Node removedLeftNodes(Predicate<T> tester) {
		if(!tester.test(data)){
			return new TaskNode(data, nextTask.removedLeftNodes(tester));
		}
		else {
			return nextTask.removedLeftNodes(tester);
		}
	}
	
	@Override
	public int countNodes(Predicate<T> tester) {
		//counter variable
	    int counter = 0;
	    // if found it add 1 to counter
	    if (tester.test(data)) {
	        counter++;
	    }
	    // keep checking next one
	    if (nextTask != null) {
	        counter += nextTask.countNodes(tester);
	    }
	    return counter;
	}

	public String printStatusNode(Predicate<T> tester) {
		// create StringBuilder to receive result
	    StringBuilder result = new StringBuilder();
	    
	    // add qualified task
	    if (tester.test(data)) {
	        result.append(data.toString()).append("\n");
	    }
	    // keep checking next one
	    if (nextTask != null) {
	        result.append(nextTask.printStatusNode(tester));
	    }
	    return result.toString();
	}
	
}
