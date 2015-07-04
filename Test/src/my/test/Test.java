package my.test;

import java.util.Date;
import java.text.SimpleDateFormat;

import my.test.Outer.Inner;

public class Test {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM dd, yyyy HH:mm:ss");
		String formatDate = formatter.format(now);
		System.out.println("Hello," + args[0] + formatDate+"!");
		
		// Declare, allocate and initialize the objects
		
		Box myBox1 = new Box(10, 20, 25);
		Box myBox2 = new Box(6,7,8);
		
		double volume;
		
		//get the volume of the first box
		volume = myBox1.volume();
		System.out.println("Volume of first Box:" + volume);
		
		//get the volume of the second box
		volume = myBox2.volume();
		System.out.println("Volume of second Box:" + volume);
		
		Stack stk1 = new Stack();
		
		for(int i = 0; i<10; i ++) stk1.push(i);
		
		System.out.println("Stack Implementation Example");
		
		for(int j = 0; j<10; j ++)
		{
			System.out.println("Items in the stack:"+ stk1.pop());
		}
		
		System.out.println("Call By Ref");
		CallByValRef callByRef = new CallByValRef(15, 20);
	
	
		System.out.println("Value of a:" + callByRef.a + "and b:" + callByRef.b + "before the call");
		
		callByRef.math(callByRef);
		
		System.out.println("Value of a:" + callByRef.a + "and b:" + callByRef.b + "after the call");
		
		Outer outerClassObj = new Outer();
		
		outerClassObj.show();
		
	}

}

/*
 * Here, Box uses constructor to initialize the value of box dimensions
 * and return the volume
 * */
class Box{
	double height;
	double width;
	double depth;
	
	/* This is a parameterized constructor for Box*/
	Box(double h,double w, double d){
		
		System.out.println(" Parmaterized Constructing box");
		this.height = h;
		this.width = w;
		this.depth = d;
	
	}
	
	/* Method to calculate the volume based on the values initialized by the constructor */
	double volume(){
		return width * height * depth;
	}
	
}

/*
 * Here is the example of the Stack Class
 */

class Stack{
	
	int stck[] = new int[10];
	int tos;
	
	/* Intialize Top-of-Stack*/
	
	Stack(){
		tos = -1;
	}
	
	//push an item into the stack
	void push(int item){
		if (tos==9)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
	}
	
	//pop an item from the stack
	int pop(){
		if (tos < 0){
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return stck[tos--];
	}
}

/*
 * Call by Value and Reference
 */
class CallByValRef{
	
	int a,b;
	
	CallByValRef(){
		
	}
	
	CallByValRef(int i, int j){
		a = i;
		b = j;
		
	}
	
	void math (CallByValRef ob){
		ob.a *= 2;
		System.out.println("Value of i in math()" + ob.a);
		ob.b /= 2;
		System.out.println("Value of j in math()" + ob.b);
	}
}

/*
 * Inner Class concept 
 */
class Outer{
	
	int a =10;
	
	void show() {
		System.out.println("Inside show() Outer Class");
		Inner objInner = new Inner();
		objInner.display();
		System.out.println("Inner class var b accessed from outer class show():" + objInner.b);
	}
	
	class Inner{
		int b = 11;
		void display(){
			System.out.println ("Inside Inner Class");
			System.out.println("Outer Class variable a accessed from Inner class display():" + a);
			System.out.println("Inner Class variable b accessed from Inner class display():" + b);
		}
	}
}