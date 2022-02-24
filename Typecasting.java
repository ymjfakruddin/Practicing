class Typecasting
  
{
	public static void main(String[] args) 
	{
		A a1 = new B();//Up casting
		System.out.println(a1.a);
		a1.m1();
		//B b1 = (B)new A();System.out.println(b1.a);
		B b1 = (B)a1;// Down casting 
		System.out.println(b1.a);
	}
}
class A 
{
	int a = 10;
	public void m1()
	{
		System.out.println("It is A class of m1 method");
	}
}
class B extends A
{
	int a = 20;
	public void m1()
	{
		System.out.println("It is a B class of M2 method");
	}
}
/*
Output of this program
10
It is a B class of M2 method

Typecasting --class upcasting -implicitly 
down casting - explicitly


When ever we are focusing on type casting method and data members exection process is totally different 
please check the OUPUT to "UNDERSTAND"



*/


