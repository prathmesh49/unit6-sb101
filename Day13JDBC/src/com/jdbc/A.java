package com.jdbc;

public class A {
	static {
		System.out.println("inside a static block-1");
	}
	static {
		System.out.println("inside a static block-2");
	}
	{
		System.out.println("inside a non-static block");
	}
	A(){
		System.out.println("inside a constructor");
	}
	void fun() {
	System.out.println("inside a fun method");	
	}
	public static void main(String[] args) {
		System.out.println("inside a main method");
		A a = new A();
		a.fun();
	}
}
