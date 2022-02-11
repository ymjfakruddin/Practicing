class  A
{
	public static void main(String[] args) 
	{
     Node n = new Node(10);
	 System.out.println(n.key);
	}
}
class Node
{
	int key;
	Node left;
	Node right;
	public Node(int item)
	{
       key = item;
	   left = right = null;
	}
}
