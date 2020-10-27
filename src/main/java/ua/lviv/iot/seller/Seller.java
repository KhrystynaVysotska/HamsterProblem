package ua.lviv.iot.seller;

import ua.lviv.iot.model.Hamster;

public class Seller {
	private static Hamster[] hamsters;
	private static int numberOfFoodPackagesAvailable;

	public static int findMaxNumberOfHamsters(int numberOfFoodPackagesAvailable, Hamster[] hamsters) {
		Seller.hamsters = hamsters.clone();
		Seller.numberOfFoodPackagesAvailable = numberOfFoodPackagesAvailable;
		int length = hamsters.length;
		int maxNumberOfHamsters = getMaxNumberOfHamsters(0, length - 1) + 1;
		return maxNumberOfHamsters;
	}
	
	private static int getMaxNumberOfHamsters(int startPivotPosition, int endPivotPosition) {
		if(startPivotPosition > endPivotPosition) {
			return startPivotPosition - 1;
		}
		int pivotPosition = findPivotPosition(startPivotPosition, endPivotPosition);
		int numberOfFoodPackages = 0;
		for (int hamsterPosition = 0; hamsterPosition <= pivotPosition; hamsterPosition++) {
			hamsters[hamsterPosition].setTotalFoodConsuming(pivotPosition);
			numberOfFoodPackages += hamsters[hamsterPosition].getTotalFoodConsuming();
		}
		if(numberOfFoodPackages < numberOfFoodPackagesAvailable) {
			return getMaxNumberOfHamsters(pivotPosition + 1, endPivotPosition);
		} else if(numberOfFoodPackages > numberOfFoodPackagesAvailable) {
			return getMaxNumberOfHamsters(startPivotPosition, pivotPosition - 1);
		} else {
			return pivotPosition;
		}
	}

	private static int findPivotPosition(int startPosition, int endPosition) {
		Hamster pivot = hamsters[startPosition];
		int leftPosition = startPosition+1;
		for(int currentPosition = leftPosition; currentPosition <= endPosition; currentPosition++) {
			if(hamsters[currentPosition].getTotalFoodConsuming() < pivot.getTotalFoodConsuming()) {
				swap(currentPosition, leftPosition++);
			}
		}
		swap(startPosition, leftPosition-1);
		return leftPosition-1;
	}

	private static void swap(int currentPosition, int leftPosition) {
		Hamster temp = hamsters[currentPosition];
		hamsters[currentPosition] = hamsters[leftPosition];
		hamsters[leftPosition] = temp;
		
	}
}
