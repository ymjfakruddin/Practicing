class Wrapper 
{
public static void main(String[] args) 
	{
	int k = 19;
	Integer a = k;
  //Wrapper class -- Auto boxing and Un boxing
	Integer i = 10;
	int j = i;
	System.out.println(j);

	System.out.println(i2);
	int i5 = 12345;
	System.out.println(len(i5)+"Length of the Integer");
	}
	public static int len(int i3)//Method It will return the length of the Integer Value
		{
		int i4 = String.valueOf(i3).length();
		return i4;
		}
}
