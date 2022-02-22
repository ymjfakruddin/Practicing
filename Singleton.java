class Singleton 
{
	static Singleton instance = null;
	private Singleton()
	{
	}
	public static void main(String[] args) 
	{
		Singleton a = Singleton.factory();
	}
	public static  Singleton factory()
	{
	if (instance == null)

	{
		instance = new Singleton();
        
	}
	return instance;
	}
		
}
