package jus.aoo.tri.triable;

import java.util.Comparator;

class StringTriable$Comparator implements Comparator<String> {
	private long count;
	
	public int compare(String s1 , String s2) {
		int d = s1.length() - s2.length();
		count++;
		return ( d != 0) ? d : s1.compareTo(s2);
	}
	public long count() {
		return count;
	}
	public void resetCount() {
		count = 0;
	}
}




public class StringTriable1 extends StringTriable{

	StringTriable$Comparator  cmp = new StringTriable$Comparator();
	
	@Override
	public Comparator<String> comparator(){
		return  cmp;
	}
	@Override
	public long count() {
		return cmp.count();
	}
	@Override
	public void resetCount() {
		cmp.resetCount();
		
	}
}
