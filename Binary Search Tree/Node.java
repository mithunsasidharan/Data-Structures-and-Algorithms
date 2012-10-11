public class Node
{
	private Node left;
	private Node right;
	private int key;
	
	public Node(int key)
	{
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
	public void setLeft(Node left)
	{
		this.left = left;
	}
	
	public void setRight(Node right)
	{
		this.left = right;
	}
	
	public void SetKey(int k)
	{
		this.key = k;
	}
	
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}
	
	public int getKey()
	{
		return key;
	}
}