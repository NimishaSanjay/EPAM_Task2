package EPAM2_Task2.epam2;

public class SimpleInterest {
	public double simpleInterest(double principal, double rate, double time) {
		double simple_interest = (principal * rate * time) / 100;
		return Math.round(simple_interest * 100.0) / 100.0;
	}
}