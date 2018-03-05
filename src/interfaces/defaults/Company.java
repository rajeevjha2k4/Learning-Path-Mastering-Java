package interfaces.defaults;

/**
 * @author Rajeev
 *
 *First Interface which method duplicated in Other Interface
 */
public interface Company {
	
	 default String getName(){
		return "defaults.Company";
	}

}
