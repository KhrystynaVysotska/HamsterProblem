package ua.lviv.iot.structure;

import static org.junit.Assert.*;
import org.junit.Test;

public class MinHeapTest {

	MinHeap heap = new MinHeap(5);
	
	@Test
	public void testDeletion() {
		heap.insert(11);
		heap.insert(10);
		heap.insert(9);
		heap.insert(10);
		heap.insert(7);
		assertEquals(7, heap.deleteMinimum());
		assertEquals(9, heap.deleteMinimum());
		assertEquals(10, heap.deleteMinimum());
		assertEquals(10, heap.deleteMinimum());
		assertEquals(11, heap.deleteMinimum());
	}
}
