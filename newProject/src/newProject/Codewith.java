package newProject;
import java.util.Scanner;
import java.util.Arrays;
public class Codewith {
//	calculating cgpa
	public static void main(String[] args) {
		
//	float math=45;
//	float eng=90;
//	float sci=68;
//	float cgpa=(math+eng+sci)/30;
//	System.out.println(cgpa);
	
//	converting km to m 
//	System.out.println("enter distance in km");
//	Scanner sc=new Scanner(System.in);
//	float km=sc.nextFloat();
//	float miles=(float)(km*0.6213711922);
//	System.out.println("the distance in miles is");
//	System.out.println(miles);
//	
//	char grade='A';
//	grade=(char)(grade+8);
//	System.out.println(grade);
		/*
		int num1=90;
		System.out.printf("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num);
		if(num1>num) {
			System.out.println("The given number is greater than users num ");
		}
			else {
				System.out.println("The given number is lesser than users num");
			}
			*/
		
//	Strings
//		String name=new String("Harry");
//		System.out.println(name.length());
//		System.out.println(name.toLowerCase());
//		System.out.println(name.toUpperCase());
//		System.out.println(name.trim()); 
//		System.out.println(name.substring(2,4));
//		System.out.println(name.replace('r','p'));
//		System.out.println(name.replace("rr","pp"));  
//		System.out.println(name.startsWith("Ha"));
//		System.out.println(name.endsWith("Ha"));
//		System.out.println(name.charAt(0));
////		returns 1st index
//		String names="applpple";
//		System.out.println(name.indexOf("ry"));
//		System.out.println(names.indexOf("pp",3));
//		System.out.println(names.lastIndexOf("pp"));
//		System.out.println(name.equals("Harry"));
//		System.out.println(name.equalsIgnoreCase("harry"));
//		
		
		
	
//		no of day
/*
		Scanner no=new Scanner(System.in);
		System.out.println("enter the number");
		int days=no.nextInt();
		switch(days){
		case 1:
		{
			System.out.println("monday");
			break;
		}
		
		case 2:
		{
			System.out.println("tuesday");
			break;
		}
		case 3:
		{
			System.out.println("wednesday");
			break;
		}
		case 4:
		{
			System.out.println("thursday");
			break;
		}
		case 5:
		{
			System.out.println("friday");
		}
		case 6:
		{
			System.out.println("saturday");
			break;
		}
		default:{
			System.out.println("the day num doesnt exist");
		}
		}
*/	
		/*
		int n=1;
		do {
			System.out.println(n);
			n++;
		}
		while(n<5);
*/
		
//		odd numbers
//for(int i=0;i<10;i++) {
//				System.out.println(2*i+1);
//			}
		
		
//star pattern
		/*
int n=4;
for(int i=n;i>0;i--) {
	for(int j=0;j<i;j++) {
		System.out.print("*");
	}
	System.out.println("");
}
*/
//		Sum of first even numbers
/*		
		int n=10;
		int i=0;
		int sum=0;
		while(i<n) {
           sum=sum+(2*i);
			i++;
			
		}
		System.out.println(sum);

*/	
		
//		multiplication table
/*
 * int n=4; 
 * int sum=0; 
 * for(int i=1;i<=10;i++) {
 * System.out.printf("%d X %d =%d \n",n,i, n*i); 
 * }
 */
		
		
//		multiplication table in reverse order
//		int m=5;
//		for(int i=10;i>=1;i--) { 
//			System.out.printf("%d X %d =%d \n",m,i, m*i);
//		}
//		
		
//		Factorial of a number
//		int n=5;
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);

		
		
//	array inreverse order
		/*
		  int marks[]= {45,40,45,87,89}; for(int i=marks.length-1;i>=0;i--) {
		  System.out.println(marks[i]);
		  
		  }
		  
		  Printing array elements using(For-each loop) int mark[]= {1,2,3,4,5}; for(int
		  element:mark) { System.out.println(element); }
		 */
		
//		2d array
		
		/*
		  int flats[][]= {{2,4},{8,7},{8,7}}; for(int i=0;i<flats.length;i++) { for(int
		  j=0;j<flats[i].length;j++) { System.out.print(flats[i][j]);
		  System.out.print(" ");
		  
		  } System.out.println(); }
		
		 */
		
//		Adding float array
		/*
		 * float sum=0; float arr[]= {9.0f,5.7f,7.8f}; for(float element:arr) {
		 * sum=sum+element; } System.out.println("the value of sum is" +sum);
		 */
		
//		calculating average from array
		
		/*
		 * int sum=0; int avg[]= {58,67,56,88,99}; for(int element:avg) {
		 * sum=(sum+element); } System.out.println(sum); int total=sum/5;
		 * System.out.println(total);
		 * }
		 */		
		
//		2d Matrix addition
		/*
		 * int[][] mat1= {{2,3,4}, {3,2,4}}; int[][] mat2= {{1,6,4}, {2,4,4}}; int[][]
		 * result= {{0,0,0}, {0,0,0}};
		 * 
		 * for(int i=0;i<mat1.length;i++) { for(int j=0;j<mat1[i].length;j++) {
		 * result[i][j]=mat1[i][j]+mat2[i][j]; System.out.print(result[i][j] + " ");
		 * 
		 * } System.out.println(" "); }
		 */
		
//		Swapping elements in an array
		/*
		  int[] arr= {5,4,3,2,1}; 
		  int temp; int l=arr.length;
		   int n=Math.floorDiv(l,2);
		  for(int i=0;i<n;i++) {
		   temp=arr[i]; 
		   arr[i]=arr[l-i-1]; 
		   arr[l-i-1]=temp; }
		  for(int element:arr) {
		   System.out.print(element+" "); }
		 */
		
//		Maximum element in an array
		
		/*int arr[]= {1,2,3,4,5};
		int max=0;
		for(int e:arr) {
			if(e>max) {
				max=e;
			}
			
		}
		System.out.println("Maximum element in an array is"  + max);
		*/
//		Minimum element in an array
		/*
		 * int a[]= {9,8,2,3,0,5}; 
		 * int min=1;
		 *  for(int e:a) { 
		 *  if(e<=min) {
		 *   min=e;   
		 *   }
		 *    }
		 * System.out.println("Minimum element is" +min);
		 */		
//		2.Minimum element in an array
		/*
		 * int a[]= {90,8,2,30,5}; 
		 * int min=a[0];
		 *  for(int e:a) { 
		 *  if(min>e) {
		 *   min=e;
		 *    } 
		 *    }
		 * System.out.println("Minimum element is" +min);
		 */
		
//		Sorting array using sort method
		
		/*
		 * int array[]=new int[] {5,4,3,2,1}; 
		 * Arrays.sort(array);
		 *  for(int i=0;i<array.length;i++) { System.out.println(array[i]); }
		 */
		

		
		}
	}

