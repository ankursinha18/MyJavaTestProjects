package my.test;

import java.util.Scanner;

public class Hired {
	


    public static void main(String [] args){
    	Scanner input = new Scanner(System.in);
    	
    	 
    	
    	        System.out.print("Enter first word: ");
    	
    	        String firstWord = input.next();
    	
    	        System.out.print("Enter second word: ");
    	
    	        String secondWord = input.next();
    	
    	 
    	
    	        firstWord.toLowerCase();
    	
    	        secondWord.toLowerCase();
    	
    	 
    	
    	        char Array1[];
    	
    	        char Array2[];
    	
    	 
    	
    	        Array1 = firstWord.toCharArray();
    	    	        Array2 = secondWord.toCharArray();
    	
    	 
    	
    	        for (int x = 0; x < Array1.length - 1; x++) {
    	
    	            for (int y = x + 1; y < Array1.length; y++) {
    	
    	                if (Array1[x] > Array1[y]) {
    	
    	                    char temp = Array1[x];
    	    	                    Array1[x] = Array1[y];
    	
    	                    Array1[y] = temp;
    	
    	                }
    	
    	            }
    	
    	 
    	
    	        }
    	
    	         
    	
    	 
    	
    	        for (int x = 0; x < Array2.length - 1; x++) {
    	
    	            for (int y = x + 1; y < Array2.length; y++) {
    	
    	                if (Array2[x] > Array2[y]) {
    	
    	                    char temp = Array2[x];
    	
    	                    Array2[x] = Array2[y];
    	
    	                    Array2[y] = temp;
    	
    	                }
    	
    	            }
    	
    	 
    	
    	        }
    	
    	 
    	
    	        if (Array1 == Array2) {
    	
    	            System.out.println("The inputs are Anagrams");
    	
    	        } else {
    	
    	            System.out.println("The inputs are not anagrams of each other");
    	
    	        }
    	    }

    }

