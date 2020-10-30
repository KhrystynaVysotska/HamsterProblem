package ua.lviv.iot.model;

public class Hamster {

	private int dailyNorm;
	private int greedinessPerOneHamster;
	
	public Hamster(int dailyNorm, int greedinessPerOneHamster) {
		this.dailyNorm = dailyNorm;
		this.greedinessPerOneHamster = greedinessPerOneHamster;
	}
	public int getDailyNorm() {
		return dailyNorm;
	}
	public int getGreedinessPerOneHamster() {
		return greedinessPerOneHamster;
	}
	public int getTotalFoodConsuming(int numberOfOtherHamsters) {
		return dailyNorm + greedinessPerOneHamster * numberOfOtherHamsters;
	}
}
