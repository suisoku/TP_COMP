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


	public long count() {
		count++;
		return count;
	}

	public void resetCount() {
		count = 0;
		
	}

	@Override
	public String toString(Object o) {
		// TODO Auto-generated method stub
		return null;
	}



}
