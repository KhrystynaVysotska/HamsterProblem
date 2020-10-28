package ua.lviv.iot.manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ua.lviv.iot.model.Hamster;
import ua.lviv.iot.seller.Seller;

public class Launcher {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = args[0];
		Scanner scanner = new Scanner(new File(fileName));
		int numberOfFoodPackagesAvailable = scanner.nextInt();
		int numberOfHamstersInShop = scanner.nextInt();
		Hamster[] hamsters = new Hamster[numberOfHamstersInShop];
		for(int counter = 0; counter < numberOfHamstersInShop; counter++) {
			if(scanner.hasNext()) {
				hamsters[counter] = new Hamster(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()), numberOfHamstersInShop - 1);
			}
		}
		System.out.println(Seller.findMaxNumberOfHamsters(numberOfFoodPackagesAvailable, hamsters));
		System.out.println(Seller.counter);
	}
}
