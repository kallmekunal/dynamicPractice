package com.kunal.dynamicprog;

public class Fibonaci {
	private static final int NIL = -1;
	static int lookup[] ;
	
	public static void main(String [] args) {
		int MAX_NUMBER  = 45;
		init(MAX_NUMBER);
		int fibValue = fib(10);
		System.out.println("Fibonaci of "+ 10 +" is :"+ fibValue);
	}

	private static void init(int number) {
		lookup= new int [number];
		for(int i = 0 ;i< number ;i++) {
			lookup[i] = NIL;
		}
	}

	private static int fib(int number) {
		
		if( lookup[number] ==NIL ) 
		{
			if(number <= 1)
			{
				lookup[number] = number;
			}
			else
			{
				lookup[number] = fib(number-1)+ fib(number-2);
			}
		}
		return lookup[number];
	}
}
