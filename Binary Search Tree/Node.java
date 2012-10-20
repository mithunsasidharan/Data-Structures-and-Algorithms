public class Node {

	private Node left;
	private Node right;
	private int key;

	public Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.left = right;
	}

	public void SetKey(int key) {
		this.key = key;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public int getKey() {
		return key;
	}

	public boolean add(int key) {
		if (key == this.key)
			return false;
		else if (key < this.key) {
			if (left == null) {
				left = new Node(key);
				return true;
			} else
				return left.add(key);
		} else if (key > this.key) {
			if (right == null) {
				right = new Node(key);
				return true;
			} else
				return right.add(key);
		}
		return false;
	}
	
	public boolean search(int value){
		if (value == this.key)
			return true;
		else if (value < this.key){
			if (left == null)
				return false;
			else
				return left.search(value);
		}else if (value > this.key){
			if (right == null)
				return false;
			else
				return right.search(value);
		}
		return false;
	}
	
    public boolean remove(int value, Node parent) {
        if (value < this.key) {
              if (left != null)
                    return left.remove(value, this);
              else
                    return false;
        } else if (value > this.key) {
              if (right != null)
                    return right.remove(value, this);
              else
                    return false;
        } else {
              if (left != null && right != null) {
                    this.key = right.minValue();
                    right.remove(this.key, this);
              } else if (parent.left == this) {
                    parent.left = (left != null) ? left : right;
              } else if (parent.right == this) {
                    parent.right = (left != null) ? left : right;
              }
              return true;
        }
  }
    
    public int minValue() {
        if (left == null)
              return key;
        else
              return left.minValue();
  }
}