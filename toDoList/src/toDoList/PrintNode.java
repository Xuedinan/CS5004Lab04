package toDoList;

import java.util.function.Predicate;

public interface PrintNode<T> {

	public void printAllNodes();
	
	public void printExpiredNode(Predicate<T> tester);
}
