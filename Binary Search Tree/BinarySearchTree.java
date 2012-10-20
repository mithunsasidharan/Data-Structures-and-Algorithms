public class BinarySearchTree {
	Node root;

	public BinarySearchTree(){
		root = null;
	}

	public boolean add(int value) {
		if (root == null) {
			root = new Node(value);
			return true;
		} else
			return root.add(value);
	}
	
	public boolean search(int value){
		if (root == null){
			return false;
		}else
			return root.search(value);
	}
	
    public boolean remove(int value) {
        if (root == null)
              return false;
        else {
              if (root.getKey() == value) {
                    Node auxRoot = new Node(0);
                    auxRoot.setLeft(root);
                    boolean result = root.remove(value, auxRoot);
                    root = auxRoot.getLeft();
                    return result;
              } else {
                    return root.remove(value, null);
              }
        }
  }
}