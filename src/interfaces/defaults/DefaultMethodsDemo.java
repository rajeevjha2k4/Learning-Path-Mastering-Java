package interfaces.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = 
				Stream.of(-3, 1, 4, -5, 2, -6).collect(Collectors.toList());
		//Removes all of the elements of this collection that satisfy the given predicate.
		//Parameters: 
		//filter - a predicate which returns true for elements to be removed 
		//Returns: true if any elements were removed 
		boolean removed = nums.removeIf(rajeev -> rajeev >= 0);
		System.out.println("ELements were " + (removed ? "NOT" : " ") + " removed");
		
		System.out.println(nums);
		
		nums.forEach(System.out::println);

	}

}
