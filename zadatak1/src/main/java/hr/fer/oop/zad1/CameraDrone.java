package hr.fer.oop.zad1;

import java.util.Arrays;

public class CameraDrone extends Aircraft implements Unmanned{
	private int range;
	private int[] qualities;
	public CameraDrone(String model, String date, int range, int[] qualities) {
		super(model, date);
		this.range = range;
		this.qualities = qualities;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int[] getQualities() {
		return qualities;
	}
	public void setQualities(int[] qualities) {
		this.qualities = qualities;
	}
	@Override
	public Status aircraftStatus() {
		double sum = 0;
		int n = 0;
		double average = 0;
		for (int q: qualities) {
			sum+= q;
			n++;
		}
		average = sum/n;
		if (average > 70 && average <= 100) return Status.FUNCTIONAL;
		else if (average >= 50 && average <=70) return Status.NEED_CHECK;
		else  return Status.OUT_OF_SERVICE;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " and has "+qualities.length+" elements";
	}
	@Override
	public double coverArea(Number height) {
		// TODO Auto-generated method stub
		double visina = height.doubleValue();
		return visina*range;
	}
	
	
}
