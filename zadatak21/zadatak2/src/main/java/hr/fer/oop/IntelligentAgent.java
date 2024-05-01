package hr.fer.oop;

public class IntelligentAgent extends Agent{
	IntelligentAgentType type;

	public IntelligentAgent(String name, int ID, IntelligentAgentType type) {
		super(name, ID);
		this.type = type;
	}

	public IntelligentAgentType getType() {
		return type;
	}

	public void setType(IntelligentAgentType type) {
		this.type = type;
	}
	
	public String getAgentType() {
		return "intelligent agent";
	}
}
