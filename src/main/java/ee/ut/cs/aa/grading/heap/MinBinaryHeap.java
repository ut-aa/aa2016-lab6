package ee.ut.cs.aa.grading.heap;

import java.util.List;

public interface MinBinaryHeap<T extends Comparable<T>> {
	
	/**
	 * Switches elements in the array such that heap property holds for every element.
	 * Worst-case time complexity: Theta(n)
	 * 
	 * @param array 
	 */
	void minHeapify(List<T> array);
	
	
	/**
	 * Removes and returns element with minimum value. On empty
	 * heap returns null.
	 * Worst-case time complexity: Theta(log(n))
	 * 
	 * @return Element at the top of the heap or null if empty.
	 */
	T extractMin();
	
	
	/**
	 * Returns element with minimum value without removing it. On empty
	 * heap returns null.
	 * Worst-case time complexity: Theta(1)
	 * 
	 * @return Element at the top of the heap or null if empty.
	 */
	T peek();
	
	
	/**
	 * Adds element to the heap.
	 * Worst-case time complexity: Theta(log(n))
	 * 
	 * @param element
	 */
	void add(T element);
	
	
	/**
	 * Removes element from the heap if possible.
	 * Worst-case time complexity: Theta(log(n))
	 * 
	 * @param element
	 * @return True if element was removed and false otherwise.
	 */
	boolean remove(T element);
	
	
	/**
	 * Checks if heap contains the element.
	 * 
	 * @param element
	 * @return True if heap contains element and false otherwise.
	 */
	boolean contains(T element);
	
	
	/**
	 * @return True if heap is empty and false otherwise.
	 */
	boolean isEmpty();
	
	
	/**
	 * @return List containing the heap.
	 * (for testing purposes only! Real implementation would not provide this.)
	 */
	List<T> getArray();
}
