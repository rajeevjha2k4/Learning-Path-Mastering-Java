package oop;

import java.util.Arrays;

/**
 * @author Rajeev
 *
 ***Mechanism to converting Object to Integer is called Hashcode
 ***If two object are equals by equal method they must hashed to the same value.
 */
public class HashcodeFoundation {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(numbers);
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashcodeFoundation other = (HashcodeFoundation) obj;
		if (!Arrays.equals(numbers, other.numbers))
			return false;
		return true;
	}

	private boolean[] numbers = new boolean[2000];
	public void store(int num){
		numbers[num] = true;
	}
	
	public boolean isStored(String strnum){
		return numbers[strnum.hashCode()];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashcodeFoundation hf = new HashcodeFoundation();
		System.out.println(hf.isStored("5a"));
		hf.store("5a".hashCode());
		System.out.println(hf.isStored("5b"));
		

	}

}
