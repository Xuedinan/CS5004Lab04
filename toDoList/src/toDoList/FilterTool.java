package toDoList;
import java.util.function.Predicate;

public class FilterTool {
	
	// constructor to create filter tool
	public FilterTool() {};
	
	// checking for expiration date
    public Predicate<Task> expireCheck(ExpiredDate date) {
        return task -> date.isBefore(task.getDate());
    }
	
    // checking for task status
    public Predicate<Task> statusCheck(TaskStatus status) {
        return task -> task.getStatus() == status;
    }
    
    // checking for priority level
    public Predicate<Task> priorityCheck(PriorityType priority) {
        return task -> task.getPriority() == priority;
    }
    
    // checking for same task
    
    
    // comparing date
    
    
    // provide period tasks
}
