package oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HR {
	
	private List<Employee> employees = new ArrayList<>();
	
	public void hire(Employee e){
		employees.add(e);
	}
	
	public void layOff(Employee e){
		employees.remove(e);
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
	
	/**
	 * ****forEach*****
	 * Performs the given action for each element of the Iterable until all elements have been processed 
	 * or the action throws an exception. Unless otherwise specified by the implementing class,
	 *  actions are performed in the order of iteration (if an iteration order is specified).
	 *   Exceptions thrown by the action are relayed to the caller.

	 */
	public void printAllEmployees(){
		
		employees.forEach(System.out::println);
	}
	
	/**
	 * NumberFormat is the abstract base class for all number formats. 
	 * This class provides the interface for formatting and parsing numbers. 
	 * NumberFormat also provides methods for determining which locales have number formats, and what their names are. 
		*NumberFormat helps you to format and parse numbers for any locale. 
		*Your code can be completely independent of the locale conventions for decimal points, 
		*thousands-separators, or even the particular decimal digits used, or whether the number format is even decimal. 
		*
	 */
	public void payAllEmployee(){
		for(Employee e : employees ){
			System.out.printf("Paying %s %s %n", e.getName(),
			NumberFormat.getCurrencyInstance().format(e.getPay()));
			
		}
		
	}

}
