package ua.lviv.iot.seller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.lviv.iot.model.Hamster;

public class SellerTest {
	@Test
	public void testFirstCaseHamsters() {
		Hamster[] firstCaseHamsters = {new Hamster(200, 0),new Hamster(1, 0),new Hamster(1, 100), new Hamster(400, 0)};
		SellerVersion3 seller = new SellerVersion3(firstCaseHamsters, 150);
		int result = seller.findMaxNumberOfHamsters();
		assertEquals(2, result);
	}
	
	@Test
	public void testSecondCaseHamsters() {
		Hamster[] secondCaseHamsters = {new Hamster(10, 0),new Hamster(2, 6),new Hamster(1, 0), new Hamster(1, 0)};
		SellerVersion3 seller = new SellerVersion3(secondCaseHamsters, 12);
		int result = seller.findMaxNumberOfHamsters();
		assertEquals(3, result);
	}
	@Test
	public void testThirdCaseHamsters() {
		Hamster[] firstCaseHamsters = {new Hamster(1, 2),new Hamster(2, 2),new Hamster(3, 1)};
		SellerVersion3 seller = new SellerVersion3(firstCaseHamsters, 7);
		int result = seller.findMaxNumberOfHamsters();
		assertEquals(2, result);
	}
	@Test
	public void testForthCaseHamsters() {
		Hamster[] forthCaseHamsters = {new Hamster(5, 0),new Hamster(2, 2),new Hamster(1, 4),new Hamster(5, 1)};
		SellerVersion3 seller = new SellerVersion3(forthCaseHamsters, 19);
		int result = seller.findMaxNumberOfHamsters();
		assertEquals(3, result);
	}
	@Test
	public void testFifthCaseHamsters() {
		Hamster[] fifthCaseHamsters = {new Hamster(1, 50000),new Hamster(1, 60000)};
		SellerVersion3 seller = new SellerVersion3(fifthCaseHamsters, 2);
		int result = seller.findMaxNumberOfHamsters();
		assertEquals(1, result);
	}
	@Test
	  public void testSixthCaseHamsters() {
	    Hamster[] sixthCaseHamsters = {new Hamster(1, 5),new Hamster(2, 4),new Hamster(3, 3), new Hamster(4, 2), new Hamster(5, 1)};
	    SellerVersion3 seller = new SellerVersion3(sixthCaseHamsters, 12);
	    int result = seller.findMaxNumberOfHamsters();
	    assertEquals(2, result);
	  }
	@Test
	  public void testSeventhCaseHamsters() {
	    Hamster[] seventhCaseHamsters = {new Hamster(100, 1),new Hamster(1, 100),new Hamster(101, 0), new Hamster(0, 101)};
	    SellerVersion3 seller = new SellerVersion3(seventhCaseHamsters, 50);
	    int result = seller.findMaxNumberOfHamsters();
	    assertEquals(1, result);
	  }
	@Test
	  public void testEighthCaseHamsters() {
	    Hamster[] eighthCaseHamsters = {new Hamster(100, 1),new Hamster(1, 100),new Hamster(101, 0), new Hamster(0, 101)};
	    SellerVersion3 seller = new SellerVersion3(eighthCaseHamsters, 100);
	    int result = seller.findMaxNumberOfHamsters();
	    assertEquals(1, result);
	  }
	@Test
	  public void testNinthCaseHamsters() {
	    Hamster[] ninthCaseHamsters = {new Hamster(100, 1),new Hamster(1, 100),new Hamster(101, 0), new Hamster(0, 101)};
	    SellerVersion3 seller = new SellerVersion3(ninthCaseHamsters, 202);
	    int result = seller.findMaxNumberOfHamsters();
	    assertEquals(2, result);
	  }
	@Test
	  public void testTenthCaseHamsters() {
	    Hamster[] tenthCaseHamsters = {new Hamster(0, 0),new Hamster(0, 1),new Hamster(1, 0)};
	    SellerVersion3 seller = new SellerVersion3(tenthCaseHamsters, 3);
	    int result = seller.findMaxNumberOfHamsters();
	    assertEquals(3, result);
	  }
}
