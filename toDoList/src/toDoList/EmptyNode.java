package toDoList;

import java.util.function.Predicate;

public class EmptyNode<T> implements Node<T>{

	@Override
	public int count() {
		return 0;
	}

	@Override
	public T getTaskNode(int position) {
		return null;
	}

	@Override
	public Node getStatusNodes(Predicate<T> tester) {
		return new EmptyNode();
	}

	@Override
	public String toString() {
		return "";
	}
	

}
