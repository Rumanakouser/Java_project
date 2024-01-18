package newProject;

import java.util.*;
import java.util.Scanner;

//Inheritance with overloaded constrctor
/*
 * class base1{ base1(){ System.out.println("Iam a base class constructor"); }
 * base1(int x){
 * System.out.println("Iam an overloaded constructor with value as:"+x); } }
 * class derived extends base1{ derived(int x,int y){ super(x);
 * System.out.println("Iam a derived class constructor with value as"+y); }
 * 
 * } class childofderived extends derived{ childofderived(int x,int y,int z){
 * super(x,y); System.out.
 * println("Iam a overloaded child of derived class constructor with :"+z); } }
 * 
 * public class Codewith_oops { public static void main(String[] args) { //
 * base1 base=new base1(); //derived der=new derived(); childofderived chd=new
 * childofderived(2,3,4); } }
 */

//Inheritance
/*
 * class Animal{ private int x;
 * 
 * public int getX() { return x; }
 * 
 * public void setX(int x) { this.x = x; } public String base(String x) { //
 * System.out.println("Iam a animal base class with"+x+"varities"); return x; }
 * } class dog extends Animal{ int y;
 * 
 * public int getY() { return y; }
 * 
 * public void setY(int y) { this.y = y; } public String derived(String y) {
 * return y; // System.out.println("Iam a dog derived class"); } }
 * 
 * 
 * public class Codewith_oops { public static void main(String[] args) { Animal
 * ani=new Animal(); ani.setX(90); System.out.println(ani.getX());
 * System.out.println(ani.base("Iam a animal base class with\"+x+\"varitie"));
 * dog dg=new dog(); System.out.println(dg.derived("Iam a dog derived class"));
 * } }
 */

//Calculating radius,height of a cylinder
/*
 * class Cylinder{ private int radius; private int height; public int
 * getRadius() { return radius; } public void setRadius(int radius) {
 * this.radius = radius; } public int getHeight() { return height; } public void
 * setHeight(int height) { this.height = height; } } public class Codewith_oops
 * { public static void main(String[] args) { Cylinder cy=new Cylinder();
 * cy.setHeight(50); System.out.println(cy.getHeight()); cy.setRadius(40);
 * System.out.println(cy.getRadius()); } }
 */

//Constructor
/*
 * public class Codewith_oops { private int id; private String name; public
 * Codewith_oops(String myName,int myId){ name=myName; id=myId; } public String
 * getmyName() { return name; } public int getmyId() { return id; }
 * 
 * public static void main(String[] args) { Codewith_oops cons=new
 * Codewith_oops("Rumana",59); System.out.println(cons.getmyId());
 * System.out.println(cons.getmyName()); }
 * 
 * }
 */


//  Rock paper scissor 
  public class Codewith_oops {
	  public static void  main(String[] args) { // 0 for Rock // 1 for Paper // 2 for Scissor 
	  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 0 for Rock,1 for Paper,2 for Scissor");
  int userInput=sc.nextInt();
  Random random=new Random();
  int computerInput=random.nextInt(3); 
  if(userInput==computerInput) {
  System.out.println("Draw"); 
  } 
  else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1) {
  System.out.println("You won!"); 
  }
  else { 
	  System.out.println("Computer won");
  } // printing computer choice 
  if(computerInput==0) {
  System.out.println("Computer choice: Rock");
  } 
	  else if(computerInput==1){
  System.out.println("Computer choice: Paper");
  } 
  
	  else if(computerInput==2){
  System.out.println("Computer choice: Scissor"); 
	  }
  } 
	  }
  
 
//calculating area of rectangle
/*
 * class rectangle{ int length,breadth; public int area() { return
 * length*breadth; } public int perimeter() { return 2*(length+breadth); } }
 * public class Codewith_oops { public static void main(String[] args) {
 * rectangle rect=new rectangle(); rect.length=2; rect.breadth=4;
 * System.out.println(rect.area()); System.out.println(rect.perimeter()); } }
 */

//calculating area of square
/*
 * class square{ int side; public int area() { return side*side; } public int
 * perimeter() { return 4*side; } }
 * 
 * public class Codewith_oops { public static void main(String[] args) { square
 * sq=new square(); sq.side=3; System.out.println(sq.area());
 * System.out.println(sq.perimeter());
 * 
 * } }
 */

/*
 * class Employee{ int id; String name; int salary; public int Salary(int s) {
 * return s; } public String getName(String n) { return n; } public void
 * printdetails() { System.out.println("My name is "+name);
 * System.out.println("My id is "+id);
 * 
 * } } public class Codewith_oops { public static void main(String[] args) {
 * Employee rumi=new Employee(); rumi.id=123; rumi.name="kouser"; int
 * sal=rumi.Salary(10000); System.out.println(sal); rumi.printdetails(); }
 * 
 * }
 */