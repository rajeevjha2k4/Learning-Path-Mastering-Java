package interfaces;

import java.time.LocalDate;

/**
 * @author Rajeev
 * Interface Demo
 */
public class Task implements Comparable<Task> {
	
	
	/* LocalDate*****************
	 *A date without a time-zone in the ISO-8601 calendar system, such as 2007-12-03. 
	LocalDate is an immutable date-time object that represents a date, often viewed as year-month-day. Other date fields, such as day-of-year, day-of-week and week-of-year, can also be accessed. For example, the value "2nd October 2007" can be stored in a LocalDate. 

	This class does not store or represent a time or time-zone. Instead, it is a description of the date, as used for birthdays. It cannot represent an instant on the time-line without additional information such as an offset or time-zone. 

	The ISO-8601 calendar system is the modern civil calendar system used today in most of the world. It is equivalent to the proleptic Gregorian calendar system, in which today's rules for leap years are applied for all time. For most applications written today, the ISO-8601 rules are entirely suitable. However, any application that makes use of historical dates, and requires them to be accurate will find the ISO-8601 approach unsuitable. 

	This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code, or synchronization) on instances of LocalDate may have unpredictable results and should be avoided. The equals method should be used for comparisons.

	Implementation Requirements: 
	This class is immutable and thread-safe. */
	
	private int id;
	private String name;
	private LocalDate startDate = LocalDate.now();
	private LocalDate endDat = LocalDate.now();
	private int priority;
	private boolean completed;
	
	public Task(){}
	
	public Task(int id, String name, int priority){
		this(id, name, LocalDate.now(), LocalDate.now(), priority, false);
	}

	public Task(int id, String name, LocalDate startDate, LocalDate endDat, int priority, boolean completed) {
		
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDat = endDat;
		this.priority = priority;
		this.completed = completed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDat() {
		return endDat;
	}

	public void setEndDat(LocalDate endDat) {
		this.endDat = endDat;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDat=" + endDat + ", priority="
				+ priority + ", completed=" + completed + "]";
	}

	@Override
	public int compareTo(Task task) {
		// TODO Auto-generated method stub
		return name.compareTo(task.getName());
	}
	
	

}
