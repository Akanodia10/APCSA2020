package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	
	  	System.out.println("The sentiment value of glow is " +Review.sentimentVal("glow"));
		System.out.println("The total sentiment value of simpleReview is "+Review.totalSentiment("simpleReview.txt"));
		System.out.println("The star rating for simpleReview is " + Review.starRating("simpleReview.txt"));
		System.out.println("Negative review: " +Review.fakeReview("simpleReview.txt", false));
		System.out.println("Positive review: " +Review.fakeReview("simpleReview.txt", true));
	}
}
