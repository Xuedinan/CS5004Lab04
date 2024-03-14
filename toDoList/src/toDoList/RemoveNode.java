package toDoList;

import java.util.function.Predicate;

public interface RemoveNode<T> {
	
	public Node removeNodes(Predicate<T> tester);

}
