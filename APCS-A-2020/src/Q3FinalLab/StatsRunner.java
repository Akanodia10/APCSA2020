package Q3FinalLab;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class StatsRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the FC Barcelona Squad!");
		
		@SuppressWarnings("resource")
		Scanner file = new Scanner(new File("/Users/arnavkanodia/git/APCSA2020/APCS-A-2020/src/Q3FinalLab/SoccerStats.dat"));

					String squadName = file.nextLine();
					int numPlayers = file.nextInt();
					file.nextLine();
					
					FCBarcelonaLast5seasons theSquad = new FCBarcelonaLast5seasons(squadName, numPlayers);
					
					for(int i=0; i<numPlayers; i++)
					{
						String stuName = file.nextLine();
						String gradeList = file.nextLine();			
						theSquad.addPlayer(i,new SoccerPlayer(stuName, gradeList));
					}
					
					out.println("\n\n"+theSquad);
					theSquad.sort();
					
					out.println();
					out.println("Sorted:");

					out.println("\n\n"+theSquad);
					
					out.println("Not a Shooter = " + theSquad.getTrashatScoringList(15));	
					out.println("Highest Goals per Season Average = " + theSquad.getPlayerWithHighestAverage());
					out.println("Lowest Goals per Season Average = " + theSquad.getPlayerWithLowestAverage());
				    
					
					out.println("Squad average per Season = " + theSquad.getSquadAverage());
			  }
			}











