package com.coursera.arrays;

public class Notepad {
	
	public static void main(String[] args){
		String s = "abc";
		StringBuilder sb = new StringBuilder(s.toUpperCase());
		System.out.println("sb = " + sb.toString());
		
		Integer i = Integer.valueOf(sb.charAt(0) - 65);		
		System.out.println("i = " + i);
	}

}
