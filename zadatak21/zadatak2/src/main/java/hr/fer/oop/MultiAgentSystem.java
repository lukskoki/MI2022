package hr.fer.oop;

public class MultiAgentSystem{
	private static int generateId = 0;
	private static int count = 0;
	private int numberOfAgents;
	private Agent[] agents;
	
	public MultiAgentSystem(int numberOfAgents) {
		this.numberOfAgents = numberOfAgents;
		agents = new Agent[numberOfAgents];
	}
	public static int generateId() {
		if (count == 0) {
			count++;
			return 0;
			
		}
		generateId++;
		return generateId;
	}
	
	public int getNumberOfAgents() {
		return numberOfAgents;
	}
	
	public Agent[] getAgents() {
		return agents;
	}
	
	
	public void addAgent(Agent agent) {
		if (agent.getID() < numberOfAgents) {
			agents[agent.getID()] = agent;
		}
	}
	
	public void printSystemInfo() {
		for (Agent a: agents) {
			if (a != null) System.out.println(a.getAgentType() + a);
		}
	}
	
}
