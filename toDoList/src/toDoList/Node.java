package toDoList;

import java.util.function.Predicate;

public interface Node<T> {
	
	public int count();
	
	public T getTaskNode(int position);
	
	public Node getStatusNodes(Predicate<T> tester);

	public Node removedLeftNodes(Predicate<T> tester);

	public Node<T> getNext();

	public void setNext(Node<T> next);

	public T getData();

	public int countNodes(Predicate<T> tester);

	public String printStatusNode(Predicate<T> tester);

}
