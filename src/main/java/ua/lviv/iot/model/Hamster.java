package ua.lviv.iot.model;

public class Hamster {

	private int dailyNorm;
	private int greedinessPerOneHamster;
	private int totalFoodConsuming;
	public Hamster(int dailyNorm, int greedinessPerOneHamster, int numberOfOtherHamsters) {
		this.dailyNorm = dailyNorm;
		this.greedinessPerOneHamster = greedinessPerOneHamster;
		setTotalFoodConsuming(numberOfOtherHamsters);
	}
	public int getDailyNorm() {
		return dailyNorm;
	}
	public int getGreedinessPerOneHamster() {
		return greedinessPerOneHamster;
	}
	public int getTotalFoodConsuming() {
		return totalFoodConsuming;
	}
	public void setTotalFoodConsuming(int numberOfOtherHamsters) {
		this.totalFoodConsuming = dailyNorm + greedinessPerOneHamster * numberOfOtherHamsters;
	}
}
