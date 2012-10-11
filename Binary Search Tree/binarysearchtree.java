
public class binarysearchtree {
	Node root;
	
	public binarysearchtree()
	{
		root = null;
	}
	
	public boolean insert(int key)
	{
		if (root == null)
		{
			root.SetKey(key);
			return true;
		}
		else 
			return false;
		// TODO: Need to complete the function.
		}
	}
