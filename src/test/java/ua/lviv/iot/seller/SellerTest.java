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
		firstCaseHamsters[0] = new Hamster(1, 2, 0);
		firstCaseHamsters[1] =  new Hamster(2, 2, 0);
		firstCaseHamsters[2] =  new Hamster(3, 1, 0);
		
		secondCaseHamsters[0] = new Hamster(5, 0, 0);
		secondCaseHamsters[1] = new Hamster(2, 2, 0);
		secondCaseHamsters[2] = new Hamster(1, 4, 0);
		secondCaseHamsters[3] = new Hamster(5, 1, 0);
		
		thirdCaseHamsters[0] = new Hamster(1, 50000, 0);
		thirdCaseHamsters[1] = new Hamster(1, 60000, 0);
	}
	
	@Test
	public void testFirstCaseHamsters() {
		int result = SellerVersion2.findMaxNumberOfHamsters(7, firstCaseHamsters);
		assertEquals(2, result);
	}
	
	@Test
	public void testSecondCaseHamsters() {
		int result = SellerVersion2.findMaxNumberOfHamsters(19, secondCaseHamsters);
		assertEquals(3, result);
	}
	@Test
	public void testThirdCaseHamsters() {
		int result = SellerVersion2.findMaxNumberOfHamsters(2, thirdCaseHamsters);
		assertEquals(1, result);
	}
}
