package com.pr.methods;

public class Eg1 {
	int a=10;
	int b=20;//instance variables
	double e=10;
	double f=30;
  static int c=20;
   static int d=40;//static variables
   //methods without return type and without parameters
	public void add() {
		System.out.println(a+b);
		System.out.println(c+a);
	}
	public static void mul() {
		System.out.println(c*d);
		
	}
	//methods with return type
	public int div() {
		return b/a;
	}
	public double sub() {
		return f-e;
	}
//	methods with parameters
	public int sum(int x,int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Eg1 eg1 =new Eg1();
		/*int sum=eg1.a+eg1.b;
		System.out.println(sum);
		int pro=eg1.a*c;
		System.out.println(pro);
		// TODO Auto-generated method stub
		*/
		int x=1;
		int y=2;
		new Eg1().add();
		System.out.println(new Eg1().div());
		mul();
		System.out.println(new Eg1().sub());
		System.out.println(eg1.sum(x,y));

	}

}
