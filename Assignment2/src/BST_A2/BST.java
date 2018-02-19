package BST_A2;

public class BST implements BST_Interface {
  public BST_Node root;
  int size;
  
  public BST(){ size=0; root=null; }
  
  @Override
  //used for testing, please leave as is
  public BST_Node getRoot(){ return root; }

@Override
public boolean insert(String s) {
	if (root == null){
		root = new BST_Node(s);
		size++;
		return true;
	}
	else if(root.insertNode(s)){
		size++;
		return true;
	}
	return false;
}

@Override
public boolean remove(String s) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public String findMin() {
	if (size == 0) return null;
	return root.findMin().toString();
}

@Override
public String findMax() {
	if (size == 0) return null;
	return root.findMax().toString();
}

@Override
public boolean empty() {
	if (size == 0) return true;
	return false;
}

@Override
public boolean contains(String s) {
	if (size == 0) return false;
	return root.containsNode(s);
}

@Override
public int size() {
	return size;
}

@Override
public int height() {
	if (size == 0) return -1;
	return root.getHeight();
}

}