package jus.aoo.tri.sort;

import java.util.Comparator;

import jus.aoo.tri.Tri;

public class MaximumSort extends Tri {
	
	private<U> int max(U[] t , Comparator<U> c , int indiceG) {
		U max = t[0];
		int indiceMax = 0;
		for(int i = 1; i <= indiceG ; i++ ) {
			if(c.compare(t[i] , max) > 0){max = t[i]; indiceMax = i;}
		}
		return indiceMax;
	}
	
	public<U> U[] sort(U[] t,Comparator<U> c) {
		int indiceMax = 0;
		U temp;
		for(int indiceG = t.length -1 ; indiceG > 0 ; indiceG--) {
			indiceMax = max(t , c, indiceG);
			swap(t , indiceG , indiceMax);
		}
		return t;
	}
}
