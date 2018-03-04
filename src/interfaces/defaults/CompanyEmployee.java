package interfaces.defaults;

/**
 * @author Rajeev
 *
 *Duplicate default methods named getName with the parameters () and () are inherited
 * from the types Employee and Company.
 *
 *In this case Class  implementation overriding Interface method always Wins.
 */
public class CompanyEmployee implements Company, Employee {
	
	private String first;
	private String last;
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return String.format("%s working for %s", Employee.super.getName(),
				Company.super.getName());
	}
	
	
	@Override
	public String getFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getLast() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		
	}
	
	

}
