package Q3FinalLab;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -



public class SoccerPlayer implements Comparable <SoccerPlayer> {

	private String myName;
	private GoalsScored myGoals;
	
	public SoccerPlayer()
	{
		setName("");
		setGoals("");
	}
	
	public SoccerPlayer(String name, String goalList)
	{
      setName(name);
      setGoals(goalList);


	}
	
	public void setName(String name)
	{
      myName=name;

	}	
	
	public void setGoals(String goalList)
	{

	   myGoals= new GoalsScored(goalList);
	}
	
	public void setGoal(int spot, double goal)
	{
       myGoals.setGoal(spot,goal);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGoals()
	{
		return myGoals.getNumGoals();
	}

	public double getSum()
	{
		return myGoals.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/getNumGoals();
	}

	public double getAverageMinusLow()
	{
		return getAverage()-myGoals.getLowGoal();
	}
	
	public double getHighGrade()
	{
		return myGoals.getHighGoal();		
	}
	
	public double getLowGrade()
	{
		return myGoals.getLowGoal();	
	}
	
	public String getGoalList() {
		String goals ="";
		for(double goal:myGoals.getGoals()) {
			goals +=goal+" ";
		}
		return goals;
	}
	
	public int compareTo(SoccerPlayer param) {
		if(getAverage()>param.getAverage()) 
			return -1;
		else if (getAverage()< param.getAverage())
			return 1;
		return 0;
	}
	
	public String getFifaScoringRanking() {
		String goals ="";
		for(double goal1:myGoals.getGoals()) {
		if(goal1 < 5) 
			return "30";
		else if(goal1 < 15 ) 
			return "40";
		else if(goal1 < 20)
			return "50";
		else if(goal1 < 40)
			return "65";
		else
			return "85";
		}
		return goals;
		
	}
	
	public String toString()
	{
		return getName() + "=" + getGoalList();
	}	
}