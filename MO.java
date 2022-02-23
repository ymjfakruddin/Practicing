class  MO
{
	public static void main(String[] args) 
	{
		MO m = new MO();
		m.m1();
		m.m1(10);
	}
	public void m1()
	{
		System.out.println("it is a m1 method");
	}
	public void m1(int a)
	{
		System.out.println("It is m1 method and Int a"+a);
	}
	public void m1(int a,int b)
	{
		System.out.println("it is a m1 method and iNt a and int b"+a+" "+b);
	}

}
