package ua.lviv.iot.manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ua.lviv.iot.model.Hamster;
import ua.lviv.iot.seller.Seller;

public class Launcher {
	public static void main(String[] args) throws IOException {
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
		int maxMaxNumberOfHamsters = Seller.findMaxNumberOfHamsters(numberOfFoodPackagesAvailable, hamsters); 
		String outputFileName = "D:\\AlgorithmLabs\\SecondLab\\hamsterAlgorithm\\hamstersOutput.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
		writer.write(maxMaxNumberOfHamsters + "\ncounter: " + Seller.counter);
		writer.close();
	}
}
