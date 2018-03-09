package jus.aoo.tri.sort;

import java.util.Comparator;

import jus.aoo.tri.triable.Tri;

public class MaximumSort extends Tri {
	
	private<U> int max(U[] t , Comparator<U> c) {
		U max = t[0];
		int indiceMax = 0;
		for(int i = 0; i < t.length ; i++ ) {
			if(c.compare(t[i] , max) > 0){max = t[i]; indiceM = i;}
		}
		return indiceMax;
	}
	public<U> U[] sort(U[] t,Comparator<U> c) {
		int indiceG = t.length - 1;
		int indiceD = 0;
		
		for(int i = 0 ; i < t.length ; i++) {
			
		}
		return t;
	}
}
