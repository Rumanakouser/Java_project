package newProject;
import java.util.*;
	
	
//	celsius to farenheit
/*public static void main(String[] args) {
	double c=30.7;
		double f=((c*9)/5)+32;
		System.out.println(f);
	}
	
	}*/
//	Fibonacci series using recursion
	/*static int fib(int n) {
	if(n==1||n==2) {
		return n-1;
	}
	else {
		return fib(n-1)+fib(n-2);
	}
	}
	public static void main(String[] args) {
		int f=fib(9);
		System.out.println(f);
	}
}*/
//	Pattern2 using functions
	/*static void pattern2(int n) {
		for(int i=n;i>=0;i--) {
			for(int j=0;j<i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
	}		
}
	public static void main(String[] args) {
		pattern2(5);
	}
	}*/
	
	
	//	Sum of natural num using recursion
	/*static int natural_num(int n) {
	if(n==1) {
		return 1;
	}
	return n+natural_num(n-1);
	}
		
	public static void main(String[] args) {
	int	c=natural_num(10);
	System.out.println(c);
	}	
	
}*/
	
	
//Pattern using functions
	/*static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				
			System.out.print("*");
			
		}
		System.out.println();
		}
	}
		public static void main(String[] args) {
			pattern1(5);
		
		
	}
}*/
	/*static void multiplication(int n) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d X %d = %d\n",n,i,n*i);
		}
	}
		public static void main(String[] args) {
			multiplication(5);
		
	}
}*/
	/*
	public static void main(String[] args) {
		int fact=1;
		int n=4;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}*/
//	Varargs
	/*
	public static int sum(int ...arr) {
		int result=0;
		for(int a:arr) {
			result+=a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(3,55,6));
		System.out.println(sum(2,3,4,5,6,7));
	}
}*/
	
	
//	  Method overloading
	  /*
	static void foo(int a) {
		System.out.println("Good morning "+a+ " bro");
	}
	static void foo(int a,int b) {
		System.out.println("Good morning "+a+ " bro");
		System.out.println("Good morning "+b+ " bro");
		
	}
	public static void main(String[] args) {
		foo(10);
		foo(20,30);
	}
}*/
	/*I case of array
	 * static void eating(int b[]) {
	 *  b[0]=1;
	 * System.out.println("The girl is eating"); 
	 * } 
	 * public static void main(String[] args) { 
	 * int a[]= {2,3,4,5}; 
	 * eating(a); 
	 * System.out.println(a[0]); 
	 * }
	 * }
	 */


	/*
//	In case of integers
	static void car(int a){
		a=10;
		System.out.println("The car is moving");
		
	}
	public static void main(String[] args) {
		int a=20;
		car(a);
		System.out.println(a);
	}

*/