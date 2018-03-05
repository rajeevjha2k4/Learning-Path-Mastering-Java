package interfaces.defaults;

/**
 * @author Rajeev
 *
 *Second Interface which method duplicated in Other Interface
 */

public interface Employee {
	
	String getFirst();
	String getLast();
	void dowork();
	
	default String getName(){
		return String.format("%s %s", getFirst(), getLast());
	}

}
