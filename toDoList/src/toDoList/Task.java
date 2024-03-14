package toDoList;

public class Task {

	private String content;
	private Date date;
	private TaskStatus status;
	private PriorityType priority;
	
	public Task(String content, Date date, TaskStatus status, PriorityType priority) {
		this.content = content;
		this.date = date;
		this.status = status;
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "\nTask: " + content + "\nDate: " + date + "\nStatus: " + status + "\nPriority: " + priority + "\n"; 
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		if(!(status instanceof TaskStatus)) {
			throw new IllegalArgumentException("Invalid input for task status setting. ");
		}
		else {
		this.status = status;
		}
	}

	public PriorityType getPriority() {
		return priority;
	}

	public void setPriority(PriorityType priority) {
		if(!(priority instanceof PriorityType)) {
			throw new IllegalArgumentException("Invalid input for task priority setting. ");
		}
		else {
			this.priority = priority;
		}
	}
	
	// change date TODO
	
	
}
