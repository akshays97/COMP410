package BST_A2;

public class BST_Node {
  String data;
  BST_Node left;
  BST_Node right;
  
  BST_Node(String data){ this.data=data; }

  // --- used for testing  ----------------------------------------------
  //
  // leave these 3 methods in, as is

  public String getData(){ return data; }
  public BST_Node getLeft(){ return left; }
  public BST_Node getRight(){ return right; }

  // --- end used for testing -------------------------------------------

  
  // --- fill in these methods ------------------------------------------
  //
  // at the moment, they are stubs returning false 
  // or some appropriate "fake" value
  //
  // you make them work properly
  // add the meat of correct implementation logic to them

  // you MAY change the signatures if you wish...
  // make the take more or different parameters
  // have them return different types
  //
  // you may use recursive or iterative implementations

  
  public boolean containsNode(String s){ 
	  int x = s.compareTo(data);
	  if (x == 0) return true;
	  else if (x < 0){
		  if (left != null) return left.containsNode(s);
		  return false;
	  }
	  else{
		  if (right != null) return right.containsNode(s);
		  return false;
	  }
  }
  public boolean insertNode(String s){ 
	  int x = s.compareTo(data);
	  if (x == 0) return false;
	  else if (x < 0){
		  if (left != null) return left.insertNode(s);
		  else {
			  left = new BST_Node(s);
			  return true;
		  }
	  }
	  else{
		  if (right != null) return right.insertNode(s);
		  else {
			  right = new BST_Node(s);
			  return true;
		  }
	  }

  }
  public boolean removeNode(String s){ return false; }
  public BST_Node findMin(){ 
	  if (left == null) return this;
	  return left.findMin();
  }
  public BST_Node findMax(){ 
	  if (right == null) return this;
	  return right.findMax();
  }
  public int getHeight(){ 
	  int left_h = 0;
	  int right_h = 0;
	  if (left != null) left_h = left.getHeight() + 1;
	  if (right != null) right_h = right.getHeight() + 1;
	  return Math.max(left_h, right_h);
  }
  
  

  // --- end fill in these methods --------------------------------------


  // --------------------------------------------------------------------
  // you may add any other methods you want to get the job done
  // --------------------------------------------------------------------
  
  public String toString(){
    return "Data: "+this.data+", Left: "+((this.left!=null)?left.data:"null")
            +",Right: "+((this.right!=null)?right.data:"null");
  }
}