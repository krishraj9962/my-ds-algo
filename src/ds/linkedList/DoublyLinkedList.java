package ds.linkedList;

public class DoublyLinkedList<E> {
	

	private Node<E> first;
	private int size;
	
	public DoublyLinkedList(){
		this.size = 0;
	}
	
	public void addFirst(E e){
		Node<E> nItem = new Node<E>(e);
		if(size() == 0){
			first = nItem;			
		} else{
			nItem.next = first;
			first.prev = nItem;
			first = nItem;
		}		
		size++;	
	}
	
	public E removeFirst() throws Exception{
		if(size() == 0)
			throw new Exception("list is empty");
			
		E item = first.item;
		
		first = first.next;
		if(first != null) {
			first.prev.next = null;
			first.prev = null;
		}			
//		first.prev.next = null;
//		first.prev = null;		
		size--;
		return item;		
	}
	
	public void addLast(E e){
		Node<E> nItem = new Node<E>(e);
		if(size() == 0){
			first = nItem;
			size++;
		}else {		
			Node<E> current = first;
			while(current != null){
				if(current.next == null){
					nItem.prev = current;
					current.next = nItem;
					size++;
					break;
				}
				current = current.next;
			}
		}			
	}
	
	public E removeLast() throws Exception{
		if(size() == 0)
			throw new Exception("List is empty!");
		
		E item = null;
		if(size() == 1){
			item = first.item;
			first = null;
			size--;
			return item;
		}
		
		Node<E> current = first;
		
		for(int i = 1; i <= size() - 2 && current != null ; i++)
			current = current.next;
		
		item = current.next.item;
		current.next.prev = null;
		current.next = null;
		size--;
		return item;
	}
	
	public void addAt(int index, E e) throws Exception{
		if(index > size() || index < 0)
			throw new Exception("Invalid argument exception");
		Node<E> nItem = new Node<E>(e);			
		Node<E> current = first;
		if(current == null) {
			first = nItem;
			size++;
		}else {
			for(int i = 1; i<= index -1 && current != null; i++)
				current = current.next;
			
			nItem.next = current.next;
			nItem.prev = current;
			if(current.next != null)
				current.next.prev = nItem;
			current.next = nItem;
			size++;
			
		}
	}
	
	
	public E removeAt(int index) throws Exception{
		if(size() == 0 || index >= size() || index < 0)
			throw new Exception("Invalid parameter exp");
		E item = null;
		if(index == 0 ){
			item = first.item;
			first = first.next;
			if(first != null)
				first.prev = null;			
			size--;
			return item;
		} else {
			Node<E> current = first;
			for(int i = 1 ; i <= index -1 && current != null; i++)
				current = current.next;
			item = current.next.item;
			current.next = current.next.next;
			if(current.next != null){
				current.next.prev.next = null;
				current.next.prev = current;				
			}			
			size--;
			return item;
			
		}	
		
	}
	
	@Override
	public String toString() {		
		StringBuffer sb = new StringBuffer();
		Node<E> current = first;
		sb.append("[");
		while(current != null) {
			sb.append(current.item + " ");
			current = current.next;
		}
		sb.append("]");
		return sb.toString();
	}
	
	int size(){
		return size;
	}


	private class Node<E>{
		E item; 
		Node<E> next;
		Node<E> prev;
		
		public Node(E item){
			this.item = item;
		}
		
	}

}
