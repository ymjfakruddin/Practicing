class Methods

{
	//driver code 
	public static void main(String[] args) 
	{
		m1();
		m2(10);
		System.out.println(m3(20));
		//instance	
		Methods mt1 = new Methods();
		mt1.o1();
		mt1.o3("Seeeeee");
		
	}
	/*types of methods in java 
	1)static 
	2)Instance
	3)synchronized  -- used in multithreading
	4)volatie
	5)final
	6)abstract
	
	**/

	// static methods
	public static void m1()
	{
		System.out.println("It is a  m1 method");
	}
	//parameters passing
	public static void m2(int i)
	{
		System.out.println("It is a  m2 method");
		System.out.println(i);
	}
	//return statement
	public static int m3(int i1)
	{
    System.out.println("It is a m3 method");
	return i1;
	}
  public void o1()
	{
	  System.out.println("it Is o1 or instance method");

	}
	public void o2(int a ,String s)
	{
		System.out.println("it is O2");
	}
	public int o3(String s)
	{
		System.out.println("It is a O3 method");
		return 10;
	}
	/* Memory Allocation Area for methods
	--Method calls are implemented through a stack---
	1)class loader-method area --- heap area --- stack area!!!!!!!
	**/
}

	
