package toDoList;

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

		
//		System.out.println("count " + test.count());
//		System.out.println(test.getNode(0));
//		
//        LinkedList<Task> expiredTasks = test.getNodes(filter.expireCheck(date));
//        
//        System.out.println("Expired tasks: \n" + expiredTasks.toString());
//        
//        LinkedList<Task> completedTask = test.getNodes(filter.statusCheck(TaskStatus.COMPLETED));
//        System.out.println("completed tasks: \n" + completedTask.toString());
//        System.out.println("completed tasks: \n" + test.toString());
//        
////        test.removeAllNode();
////        
////        System.out.println("remove tasks: \n" + test.toString());
//        test.removeSingleNode(0);
//        System.out.println("removed \n" + test.toString());
		
		test.printStatusNode(filter.priorityCheck(PriorityType.HIGH));
		
		test.countNodes(filter.statusCheck(TaskStatus.ONGOING));
		
		System.out.println("count all " + test.count());
		System.out.println("count filter " + test.countNodes(filter.statusCheck(TaskStatus.ONGOING)));
	}

}
