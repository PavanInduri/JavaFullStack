package com.javaday6;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * boolean b=true; boolean a=!b; System.out.println(a);
		 */
		double[] db = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		double midValue = db[db.length / 2];
		System.out.println(midValue);
		double d = 0;
		for (int i = 0; i < db.length; i++) {
			d += db[i];
		}
		System.out.println(d);
	}

}
