package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	//test reading from files
	  
     System.out.println(Review.sentimentVal("test"));
     System.out.println(Review.sentimentVal("apple"));
     System.out.println(Review.sentimentVal("brother"));
     System.out.println(Review.sentimentVal("mother"));

	//read in the positive adjectives in postiveAdjectives.txt
	try {
	Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
	while(input.hasNextLine()){
	String temp = input.nextLine().trim();
	System.out.println(temp);

	}
	input.close();
	}
	catch(Exception e){
	System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
	}
  }
}