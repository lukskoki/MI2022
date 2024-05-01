package hr.fer.oop.zad1;


public class Plane extends Aircraft{
	
	private int capacity;
	private int[] motorStatus;
	
	public Plane(String model, String dateProduced, int capacity, int[] motorStatus) {
		super(model, dateProduced);
		this.capacity = capacity;
		this.motorStatus = motorStatus;
		// TODO Auto-generated constructor stub
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int[] getMotorStatus() {
		return motorStatus;
	}

	public void setMotorStatus(int[] motorStatus) {
		this.motorStatus = motorStatus;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " and has "+motorStatus.length+" motors and capacity of "+capacity+"";
	}

	@Override
	public Status aircraftStatus() {
		int min = motorStatus[0];
		for (int x: motorStatus) {
			if (x < min) {
				min =x;
			}
			
		}
		
		if (min < 80) {
			return Status.OUT_OF_SERVICE;
		} else if (min >= 80 && min < 100) return Status.NEED_CHECK;
		else return Status.FUNCTIONAL;
	}
}
