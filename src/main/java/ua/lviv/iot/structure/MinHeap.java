package ua.lviv.iot.structure;

public class MinHeap {
	private int[] elements;
	private int lastElementPosition;

	public MinHeap(int capacity) {
		elements = new int[capacity + 1];
	}

	public void insert(int value) {
		elements[++lastElementPosition] = value;
		swim(lastElementPosition);
	}
	
	public int deleteMinimum() {
		int minimumElement = elements[1];
		exchange(1, lastElementPosition--);
		sink(1);
		return minimumElement;
	}
	
	public boolean isEmpty() {
		return lastElementPosition == 0;
	}
	
	public void clearHeap() {
		lastElementPosition = 0;
	}

	
	private void sink(int position) {
		while (2*position <= lastElementPosition) {
			int child = 2*position;
			if(child < lastElementPosition && less(child+1, child)) {
				child++;
			}
			if(less(position, child)) {
				break;
			}
			exchange(position, child);
			position = child;
		}
	}

	private void swim(int position) {
		while (position > 1 && less(position, position / 2)) {
			exchange(position, position / 2);
			position = position / 2;
		}
	}

	private boolean less(int firstElementPosition, int secondElementPosition) {
		return elements[firstElementPosition] - elements[secondElementPosition] < 0;
	}

	private void exchange(int firstElementPosition, int secondElementPosition) {
		int swap = elements[firstElementPosition];
		elements[firstElementPosition] = elements[secondElementPosition];
		elements[secondElementPosition] = swap;
	}

}
