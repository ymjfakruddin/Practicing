class GFG 
{

	public static void swap(Integer i,Integer j)
	{
         Integer temp = i;
		 i = j;
		 j = temp;
	 System.out.println("i"+i+"  j "+j); 
	}
	public static void main(String[] args) 
	{
	   Integer a = new Integer(10);
	   Integer b = new Integer(20);
	   swap(a,b);
	   System.out.println("i =jeelan "+a+", j fsdaf="+b);


     }
}
//wHEN WE TRY THIS PROGRAM TO EXECUTE IT WILL THROUGH AN COMPILE TIME ERROR 
//A:\>javac GFG.java
//Note: GFG.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.
//BECOZ IN JAVA OBJECT CAN'T PASS BECAUSE OF POINTERS  CONCEPT NOT SUPPORTED IN JAVA AND iT WILL NOT ADDRESS THE LOCATION  OF THE MEMORY