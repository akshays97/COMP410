/**
 * COMP 410
 *See inline comment descriptions for methods not described in interface.
 *
*/
package LinkedList_A1;

public class LinkedListImpl implements LIST_Interface {
  Node sentinel; //this will be the entry point to your linked list (the head)
  private int numElts;
  
  public LinkedListImpl(){//this constructor is needed for testing purposes. Please don't modify!
    sentinel=new Node(0); //Note that the root's data is not a true part of your data set!
  }
  
  //implement all methods in interface, and include the getRoot method we made for testing purposes. Feel free to implement private helper methods!
  
  public Node getRoot(){ //leave this method as is, used by the grader to grab your linkedList easily.
    return sentinel;
  }

  @Override
  public boolean insert(double elt, int index) {
	  
	  Node b = new Node(elt);

	  if (index == size()){
		  if (size() == 0){
			  sentinel.next = b;
			  sentinel.prev = b;
			  b.prev = sentinel;
			  b.next = sentinel;
			  numElts++;
			  return true;
		  }
		  else{
			  b.prev = sentinel.prev;
			  sentinel.prev.next = b;
			  sentinel.prev = b;
			  b.next = sentinel;
			  numElts++;
			  return true;  
		  }
	  }
	  else if (index >= 0 && index < size()){
		  Node a = sentinel;
		  for (int i = 0; i <= index; i++){
			  a = a.next;
		  }
		  b.prev = a.prev;
		  a.prev.next = b;
		  b.next = a;
		  a.prev = b;
		  numElts++;
		  return true;
	  }
	  return false;


	  // TODO Auto-generated method stub
  }

  @Override
  public boolean remove(int index) {
	  // TODO Auto-generated method stub
	  
	  if (index >= 0 && index <size()){
		  if (index == 1){
			  
			  sentinel.next = sentinel.next.next;
			  sentinel.next.prev = sentinel;
			 
		  }
		  else if (index == size()){
			  
			  sentinel.prev = sentinel.prev.prev;
			  sentinel.prev.next = sentinel;
			  
		  }
		  else{
			  Node a = sentinel;
			  for (int i = 0; i <= index; i++)
				  a = a.next;
			  a.prev.next = a.next;
			  a.next.prev = a.prev;  
			  
		  }
		  numElts--;
		  return true;
	  }
		  return false;
  }

  @Override
  public double get(int index) {
	  // TODO Auto-generated method stub
	  
	  if (index >= 0 && index < size()){
		  Node a = sentinel;
		  for (int i = 0; i <= index; i++){
			 a = a.next;
		  }
		  return a.data;
	  }
		  return Double.NaN;
	  
	  
  }

  @Override
  public int size() {
	  // TODO Auto-generated method stub
	  
	  return numElts;
  }

  @Override
  public boolean isEmpty() {
	  // TODO Auto-generated method stub
	  return size() == 0;
  }

  @Override
  public void clear() {
	  // TODO Auto-generated method stub
	  sentinel = new Node(0);
	  numElts =  0;
  }
  
}