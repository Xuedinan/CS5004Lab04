package toDoList;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab04
 * Name: Xuedinan Gao
 * 
 * This is main driver to demonstrate this program
 */

/* 
My program has structure as below;
	ENUM
		- TaskStatus, ONGOING, COMPLETED
		- PriorityType, HIGH, GENERAL, LOW
		
	Date Class
		- subclass, ExpiredDate Class
	
	Node Interface
		- Implementation class, TaskNode
		- Implementation class, EmptyNode
	
	LinkedList Class
		- main structure for linked list
	
	Task Class
		- store information for each task
	
	FilterTool Class
		- provide checking tools when filter out task

Demonstration process;
	1.create LinkedList, Task, date, ExpiredDate object with valid, and invalid input
	2.add more task
	3.remove single task
	4.count all task
	5.get task by condition
	6.remove task by condition
	7.print out task by condition
	8.count all task by condition
	9.change date on task
	10.print in period task
	11.print similar content task
	12.print all task
	13.remove all task
	
Extension:

	Use driver and JUnit testing
	Additional functions
		- time period filter 
		- similar task checking
	Use more ENUM with more complex elements
	Create clear driver for testing
	More design element, FilterTool, Status ENUM, prepare to extend
	Code defensively for most of methods
	Use interface over abstract and inheritance for future extension 
	
	
*/

public class Driver {
	
	public static void main(String[] args) {
		
		Date date1 = new Date(1, 3, 1989);
		Task tt1 = new Task("Hello", date1, TaskStatus.COMPLETED, PriorityType.HIGH);
		
		Date date2 = new Date(10, 3, 1989);
		Task tt2 = new Task("Heeeeeee", date2, TaskStatus.ONGOING, PriorityType.HIGH);
		
		
		ExpiredDate date = new ExpiredDate(5, 3, 1999);
		
		LinkedList<Task> test = new LinkedList<Task>();
		
		test.addNode(tt1);
		test.addNode(tt2);
		
		FilterTool filter = new FilterTool();
		
		test.printStatusNode(filter.priorityCheck(PriorityType.HIGH));
		
		test.countNodes(filter.statusCheck(TaskStatus.ONGOING));
		
		System.out.println("count all " + test.count());
		System.out.println("count filter " + test.countNodes(filter.statusCheck(TaskStatus.ONGOING)));
	}

}
