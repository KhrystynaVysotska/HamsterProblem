package ua.lviv.iot.seller;

import ua.lviv.iot.model.Hamster;
import ua.lviv.iot.structure.MinHeap;

public class SellerVersion3 {
	private Hamster[] hamsters;
	private int numberOfFoodPackagesAvailable;

	public SellerVersion3(Hamster[] hamsters, int numberOfFoodPackagesAvailable) {
		this.hamsters = hamsters;
		this.numberOfFoodPackagesAvailable = numberOfFoodPackagesAvailable;
	}

	public int findMaxNumberOfHamsters() {
		MinHeap heap = new MinHeap(hamsters.length);
		return findMaxNumberOfHamsters(0, hamsters.length - 1, heap);
	}

	private int findMaxNumberOfHamsters(int startPosition, int lastPosition, MinHeap heap) {
		if(lastPosition < startPosition) {
			return startPosition;
		}
		heap.clearHeap();
		int mediumPosition = (startPosition + lastPosition) / 2;
		int foodPackagesConsumed = 0;
		for (Hamster hamster : hamsters) {
			heap.insert(hamster.getTotalFoodConsuming(mediumPosition));
		}
		for (int counter = 0; counter <= mediumPosition; counter++) {
			foodPackagesConsumed += heap.deleteMinimum();
		}
		if (foodPackagesConsumed <= numberOfFoodPackagesAvailable) {
			return findMaxNumberOfHamsters(mediumPosition + 1, lastPosition, heap);
		} else  {
			return findMaxNumberOfHamsters(startPosition, mediumPosition - 1, heap);
		}
	}

}
