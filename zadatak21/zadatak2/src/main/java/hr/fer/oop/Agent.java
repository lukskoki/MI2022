package hr.fer.oop;

public abstract class Agent {
	private String name;
	private final int ID;
	
	public Agent(String name, int ID) {
		
		this.name = name;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "(name: "+name+", id: "+ID+")";
	}

	public abstract String getAgentType();
		

	
	
}
