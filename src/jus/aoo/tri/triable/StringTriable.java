package jus.aoo.tri.triable;

import java.util.Comparator;

import jus.aoo.tri.Triable;

public class StringTriable implements Triable<String> {

	public String newInstance() {
		return (String.valueOf((int)(Math.random()* 1000000)) +"");
	}

	public Comparator<String> comparator() {
		return String.CASE_INSENSITIVE_ORDER;
	}

	@Override
	public long count() {
		return 0;
	}
	
	@Override
	public void resetCount() {
		
	}

	@Override
	public String toString(String o) {
		return o;
	}



}
