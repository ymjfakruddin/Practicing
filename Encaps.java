import java.util.Scanner;
class   Encaps
{
	private String name ;
	private int wheelsNo;
	Encaps(String names ,int wheels)
	{
		name = names;
		wheelsNo = wheels;
	}
	public String getName()
	{
		return name;
	}
	public int getNo()
	{
		return wheelsNo;
	}
	public String setName(String name)
	{
		this.name = name ;
		return name;
	}
	public int  setNo(int no)
	{
		wheelsNo = no;
		return  no;
	}
	public static void main(String[] args) 
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name and No of wheels for  your vehicle");
	Encaps bike1 = new  Encaps(sc.next(),sc.nextInt());
	System.out.println(bike1.getName());System.out.println(bike1.getNo());

	}
}
