package ConsumerLab;


class Main {
  public static void main(String[] args) {
	
	  	System.out.println("The sentiment value of glow is " +Review.sentimentVal("glow"));
		System.out.println("The total sentiment value of simpleReview is "+Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
		System.out.println("The star rating for simpleReview is " + Review.starRating("src/ConsumerLab/simpleReview.txt"));
		System.out.println("Negative review: " +Review.fakeReview("src/ConsumerLab/simpleReview.txt", false));
		System.out.println("Positive review: " +Review.fakeReview("src/ConsumerLab/simpleReview.txt", true));
	}
}
