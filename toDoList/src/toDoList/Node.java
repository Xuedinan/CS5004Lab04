package toDoList;

import java.util.function.Predicate;

public interface Node<T> {
	
	public int count();
	
	public T getTaskNode(int position);
	
	public Node getStatusNodes(Predicate<T> tester);

}
