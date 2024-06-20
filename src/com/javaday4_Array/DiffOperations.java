package com.javaday4_Array;

public class DiffOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// copying array
		String[] copyFrom = { "1", "2", "3", "4", "5", "6" };
		String[] copyTo = new String[4];
		System.arraycopy(copyFrom, 2, copyTo, 0, 4);
		for (String s : copyTo) {
			System.out.print(s+":)");
			// String[] copyTo=java.util.Arrays.copyOfRange(copyFrom,1,5);
		}
	}

}
