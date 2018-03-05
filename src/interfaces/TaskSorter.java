package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Rajeev
 * 
 * Interface Demo - Collection Sort method using Comparable Interface
 * ??? Monty Python & The Holy Grail ???
 */
public class TaskSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(1, "Run Away from  killer Rabbit.", 4));
		tasks.add(new Task(2, "Answer the Bridgekeeper.", 2));
		tasks.add(new Task(3,"Defeat the Black Night",1));
		tasks.add(new Task(4, "Give a shrubbery to the Knights who sayNi!",4));
		tasks.add(new Task(5, "Lobbeth thou thy Holy Hand Grenade", 3));
		
		/*for(Task t : tasks){
			System.out.println(t);
		}*/
		//Replaced with below using method reference approach
		
		tasks.forEach(System.out::println);
		
		Collections.sort(tasks);
		System.out.println("*****************After Sorting*******************");
		tasks.forEach(System.out::println);

	}

}
