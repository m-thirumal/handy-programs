/**
 * 
 */
package com.thirumal.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thirumal
 *
 */
public class StackAndHeapMemory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//recursiveComputation(10); // Stack overflow error
		heapMemoryAllocationError();
	}

	/**
	 *  Stack overFlow error when stack memory is filled
	 *  Stack memory is used to store local variables and references to other objects in the method 
	 *  Each thread has their own stack which stores local variables and these variables are not accessible globally
	 *  stack memory size is small where it follows LIFO(Last In First Out) order.
	 *  –Xss to specify stack size for each thread.
	 * @param count
	 */
	public static void recursiveComputation(int count) {
		System.out.println("ha" + count);
		if (count == 0) {
			return;
		} else {
			recursiveComputation(++count);
		}
	}
	
	/**
	 * Heap out of memory Error when there is no space left to allocate new Object
	 *  heap memory is used to store objects. 
	 *  objects stored in heap are globally accessible.
	 *  Heap memory size is bigger where we can create and store objects in any order
	 *  We can change the size of heap memory using jvm parameters : -Xms for initial heap memory and –Xmx for maximum heap memory
	 */
	public static void heapMemoryAllocationError() {
		List<String> heapList=new ArrayList<>();
		while(true) {
			heapList.add("Fuck you god !");
		}
	}

}
