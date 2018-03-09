package jus.aoo.tri.triable;

import java.util.Comparator;

public class StringTriable implements Triable {

	int count = 0;

	public String newInstance() {
		return (String.valueOf((int)(Math.random()* 1000000)) +"");
	}

	public Comparator<String> comparator() {
		return String.CASE_INSENSITIVE_ORDER;
	}

	public String toString(String o) {
		// TODO Auto-generated method stub
		return o;
	}


	public long count() {
		count++;
		return count;
	}

	public void resetCount() {
		count = 0;
		
	}



}
