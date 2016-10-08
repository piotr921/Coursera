package com.coursera.arrays;

public class WordPlay {
	
public static final char[] VOVELS = {'a','e','i','o','u','y'};
public static final char ODD_SYMBOL = '*';
public static final char EVEN_SYMBOL = '+';
    
    public static boolean isVovel(char ch){
        boolean result = false;
        ch = Character.toLowerCase(ch);
        for(int i=0; i<VOVELS.length; i++){
            if(ch == VOVELS[i]){
                result = true;
                break;
            }
        }
        return result;
    }
    
    public static String replaceVovels(String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for(int i=0; i<phrase.length(); i++){
        	if(isVovel(sb.charAt(i))){
        		sb.setCharAt(i, ch);
        	}
        }
        return sb.toString();
    }
    
    public static String emphasize(String phrase, char ch){
    	int replacementNumber = 0;
    	StringBuilder sb = new StringBuilder(phrase);
    	ch = Character.toLowerCase(ch);
    	
    	for(int i=0; i<phrase.length(); i++){
    		char tmp = Character.toLowerCase(sb.charAt(i));
    		if(tmp == ch){
    			switch(replacementNumber%2){
    			case 0:
    				sb.setCharAt(i, EVEN_SYMBOL);
    				replacementNumber++;
    				break;
    				
    			case 1:
    				sb.setCharAt(i, ODD_SYMBOL);
    				replacementNumber++;
    				break;
    			}
    		} else{
    			replacementNumber = 0;
    		}
    	}
    	return sb.toString();
    }
}
