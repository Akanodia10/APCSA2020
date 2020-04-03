package Q3FinalLab;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;


public class FCBarcelonaLast5seasons
{
	private String name;
	private SoccerPlayer[] squadLineup;
	
	public FCBarcelonaLast5seasons()
	{
		name="";
		squadLineup=new SoccerPlayer[0];
	}
	
	public FCBarcelonaLast5seasons(String name, int playerCount)
	{
     this.name=name;
     squadLineup = new SoccerPlayer[playerCount];
	
	}
	
	public void addPlayer(int playerNum, SoccerPlayer s)
	{
     squadLineup[playerNum]=s;

	}
	
	public String getSeasonName()
	{
	   return name;	
	}
	
	public double getSquadAverage()
	{
		double squadAverage=0.0;
        double squadSum=0.0;
       for(SoccerPlayer s:squadLineup) {
    	   squadSum += s.getAverage();
       }
        squadAverage = squadSum/squadLineup.length; 
		return squadAverage;
	}
	
	public double getSquadAverage(int playerNum)
	{
		return squadLineup[playerNum].getAverage();
	}

	public double getStudentAverage(String playerName)
	{
      double average = 0.0;
      
      for(SoccerPlayer s:squadLineup) {
    	  if(s.getName().equals(playerName)) 
    		  average = s.getAverage();
      }


		return average;
	}
	
	public String getPlayerName(int playerNum)
	{
		return squadLineup[playerNum].getName();
	}

	public String getPlayerWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";

        for(SoccerPlayer s:squadLineup) {
        	if(s.getAverage() > high) {
        		high = s.getAverage();
        		hName=s.getName();
        	}
        }

		return hName;
	}

	public String getPlayerWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
        
		for(SoccerPlayer s:squadLineup) {
        	if(s.getAverage() < low) {
        		low = s.getAverage();
        		hName=s.getName();
        	}
        }

		return hName;
	}

	
	public String getTrashatScoringList(double failingRank)
	{
		String output="";
		@SuppressWarnings("unused")
		int count=0;
		for(SoccerPlayer s:squadLineup) {
			if (s.getAverage() < failingRank) {
				count++;
				output+=s.getName() + ",";
			}
			
			
		}

		return output;
	}
	
	
	
	
	
	
	public void sort() {
		Arrays.sort(squadLineup);;
	}
	
	public String toString()
	{
		String output=""+getSeasonName()+"\n";
        for(SoccerPlayer s:squadLineup) {
        	output+= s.getName() + "=" + s.getGoalList() + "         "+ "Average goals a Season:" + s.getAverage()+ "         "+ "FIFA Shooting Ranking:" + " " + s.getFifaScoringRanking()+ "\n";
        }



		return output;
	}  	
}