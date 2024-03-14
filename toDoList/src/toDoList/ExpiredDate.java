package toDoList;
import java.util.function.Predicate;

public class ExpiredDate extends Date{

	public ExpiredDate(int day, int month, int year) {
		super(day, month, year);
	}
	
    public boolean isBefore(Date taskDate) {
        // get task date
        int taskDay = taskDate.getDay();
        int taskMonth = taskDate.getMonth();
        int taskYear = taskDate.getYear();
        
        // compare expired date with task date
        if (taskYear < year) {
            return true;
        } else if (taskYear == year && taskMonth < month) {
            return true;
        } else if (taskYear == year && taskMonth == month && taskDay < day) {
            return true;
        } else {
            return false;
        }
    }
}
