package ua.lviv.iot.seller;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.model.Hamster;

public class SellerVersion2 {
	private static List<Hamster> suitableHamsters;
	public static int findMaxNumberOfHamsters(int numberOfFoodPackagesAvailable, Hamster[] hamsters) {
		suitableHamsters = new LinkedList<>();
		for(Hamster hamster:hamsters) {
			if(checkIfCanLiveWithAllPrevious(hamster, numberOfFoodPackagesAvailable)) {
				suitableHamsters.add(hamster);
			} else {
				Hamster greediestHamster = findGreediestHamsterAmongSuitable();
				hamster.setTotalFoodConsuming(suitableHamsters.size()-1);
				if(greediestHamster != null && greediestHamster.getTotalFoodConsuming() > hamster.getTotalFoodConsuming()) {
					suitableHamsters.remove(greediestHamster);
					suitableHamsters.add(hamster);
				}
			}
		}
		return suitableHamsters.size();
	}
	
	private static Hamster findGreediestHamsterAmongSuitable() {
		int currentNumberOfHamsters = suitableHamsters.size();
		if(currentNumberOfHamsters == 0) {
			return null;
		}
		Hamster greediestHamster = suitableHamsters.get(0);
		greediestHamster.setTotalFoodConsuming(currentNumberOfHamsters-1);
		for(Hamster suitableHamster: suitableHamsters) {
			suitableHamster.setTotalFoodConsuming(currentNumberOfHamsters-1);
			if(greediestHamster.getTotalFoodConsuming() < suitableHamster.getTotalFoodConsuming()) {
				greediestHamster = suitableHamster;
			}
		}
		return greediestHamster;
	}
	
	private static boolean checkIfCanLiveWithAllPrevious(Hamster hamster, int numberOfFoodPackagesAvailable) {
		int currentNumberOfHamsters = suitableHamsters.size();
		int totalFoodPackages = 0;
		if(currentNumberOfHamsters == 0) {
			return hamster.getTotalFoodConsuming() <= numberOfFoodPackagesAvailable;
		} else {
		    hamster.setTotalFoodConsuming(currentNumberOfHamsters); 
		    totalFoodPackages += hamster.getTotalFoodConsuming();
			for(Hamster suitableHamster:suitableHamsters) {
				suitableHamster.setTotalFoodConsuming(currentNumberOfHamsters);
				totalFoodPackages += suitableHamster.getTotalFoodConsuming();
			}
			return totalFoodPackages <= numberOfFoodPackagesAvailable;
		}
	}
}
