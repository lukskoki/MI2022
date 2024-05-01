package hr.fer.oop;

public class MobileAgent extends Agent implements Movable{

	private int taskId;
	
	public MobileAgent(String name, int ID) {
		super(name, ID);
		// TODO Auto-generated constructor stub
	}
	
	public int getTaskId() {
		return taskId;
	}
	
	public String getAgentType() {
		return "mobile agent";
	}
	
	public void doRemoteTask() {
		taskId = (int) Math.floor(Math.random() *(10 - 1 + 1) + 1);
	}
}
