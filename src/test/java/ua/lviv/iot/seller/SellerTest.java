package ua.lviv.iot.seller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ua.lviv.iot.model.Hamster;

public class SellerTest {
	private Hamster[] firstCaseHamsters = new Hamster[3];
	private Hamster[] secondCaseHamsters = new Hamster[4];
	private Hamster[] thirdCaseHamsters = new Hamster[2];
	
	@Before
	public void initTestArray() {
		firstCaseHamsters[0] = new Hamster(1, 2, 2);
		firstCaseHamsters[1] =  new Hamster(2, 2, 2);
		firstCaseHamsters[2] =  new Hamster(3, 1, 2);
		
		secondCaseHamsters[0] = new Hamster(5, 0, 3);
		secondCaseHamsters[1] = new Hamster(2, 2, 3);
		secondCaseHamsters[2] = new Hamster(1, 4, 3);
		secondCaseHamsters[3] = new Hamster(5, 1, 3);
		
		thirdCaseHamsters[0] = new Hamster(1, 50000, 1);
		thirdCaseHamsters[1] = new Hamster(1, 60000, 1);
	}
	
	@Test
	public void testFirstCaseHamsters() {
		assertEquals(2, Seller.findMaxNumberOfHamsters(7, firstCaseHamsters));
	}
	
	@Test
	public void testSecondCaseHamsters() {
		assertEquals(3, Seller.findMaxNumberOfHamsters(19, secondCaseHamsters));
	}
	@Test
	public void testThirdCaseHamsters() {
		assertEquals(1, Seller.findMaxNumberOfHamsters(2, thirdCaseHamsters));
	}
}
