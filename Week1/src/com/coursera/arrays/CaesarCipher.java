package com.coursera.arrays;

import java.util.ArrayList;

public class CaesarCipher {
	
	public static final int NUMBER_OF_LETTERS_IN_ALPHABET = 26;
	public static final int A_ASCII_INDEX = 65;
	
	public static String encrypt(String input, int key){
		StringBuilder sb = new StringBuilder(input.toUpperCase());
		
		ArrayList<Integer> placeInAlphabet = new ArrayList<Integer>();
		ArrayList<Integer> placeInMovedAlphabet = new ArrayList<Integer>();
		
		Integer tmp = new Integer(0);
		for(int i=0; i<input.length(); i++){
			 tmp = Integer.valueOf(sb.charAt(i) - A_ASCII_INDEX);
			placeInAlphabet.add(tmp);
		}
		
		for(int i=0; i<input.length(); i++){
			tmp = (placeInAlphabet.get(i) + key) % NUMBER_OF_LETTERS_IN_ALPHABET;
			placeInMovedAlphabet.add(tmp);
		}
		
		StringBuilder encryptedSb = new StringBuilder();
		
		System.out.println(placeInAlphabet.toString());
		System.out.println(placeInMovedAlphabet.toString());
		return sb.toString();
	}

}
