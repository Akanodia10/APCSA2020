package Q3FinalLab;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;


public class GoalsScored {
	private double[] goals;

	public GoalsScored() {
		setGoals("");
	}

	public GoalsScored(String goalList) {
		setGoals(goalList);
	}

	public void setGoals(String goalList) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(goalList);
		int numGoals = input.nextInt();
		//System.out.println(numGrades);
		
		goals = new double[numGoals];
		
		//System.out.println(input.next());
		input.next();
		
		for (int i = 0; i < numGoals; i++) {
			//grades[i] = Double.parseDouble(input.next());
			goals[i] = input.nextDouble();
		}
	}

	public void setGoal(int spot, double goal) {
		goals[spot] = goal;
	}

	public double getSum() {
		double sum = 0.0;
		for(double goal:goals) {
			sum += goal;
		}
		return sum;
	}

	public double getLowGoal() {
		double low = Double.MAX_VALUE;
		for(double goal:goals) {
			if(goal<low)
				low = goal;
		}
		return low;
	}

	public double getHighGoal() {
		double high = Double.MIN_VALUE;
		for(double goal:goals) {
			if(goal>high)
				high = goal;
		}
		return high;
	}

	public int getNumGoals() {
		return goals.length;
	}
	
	public String getFifaRanking(double goal) {
		if(goal < 5) 
			return "F";
		else if(goal < 15 ) 
			return "D";
		else if(goal < 20)
			return "C";
		else if(goal < 40)
			return "B";
		else
			return "A";
	}
	
	public double[] getGoals() {
		return goals;
	}

	public String toString() {
		String output = "";
		for(double goal:goals) {
			output += goal + "\n" + getFifaRanking(goal) + "\n";
		}
		return output;
	}
}