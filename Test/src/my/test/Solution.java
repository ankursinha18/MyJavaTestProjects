package my.test;

import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Solution {
	
	static void listPrimeNumbers(int number){
		
        
		for (int i =2; i <=number; i++){
			
			int counter = 0;
			for (int j = 1; j <= i; j++){
				
				if (i%j == 0) {
					
				 counter++;
					
				}
			}
			
			if (counter == 2){
			System.out.println(i + "is prime number");

			}
		}
    }
	
	static int getNumberOfPrimes(int n){
		
		int count = 0;
		for (int i =2; i <= n; i++){
			
			int counter = 0;
			
			for (int j = 1; j <= i; j++){
				
				if (i%j == 0) {
					
				 counter++;
					
				}
			}
			
			if (counter == 2){
			count++;
			}
		}
		return count;
		
	}
	
    static int[] fibonacciList(int n) {
    	
    	int max = n;
        int[] fibList = new int[max];
        fibList[0] = 0;
        fibList[1] = 1;
        for(int i=2; i < max; i++){
        	fibList[i] = fibList[i-1] + fibList[i-2];
        }

      return fibList;

    }




	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//listPrimeNumbers(100);
		
		//System.out.println("No of Prime numbers between 1 - 10 :" + getNumberOfPrimes(10));
		
		int[] fibList = fibonacciList(15);
		
		for (int i =0; i < fibList.length; i++){
			System.out.println("Fiblist:" + fibList[i]);
		
            }
		
        
		
		/*Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        int _n;
        _n = Integer.parseInt(in.nextLine());
        
        res = fibonacci(_n);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();*/
	}	
}
