package javabasic.class1.ex;

import java.util.Iterator;

public class MovieReviewMain2  {
	
	public static void main(String[] args) {
		MovieReview[] reviews = new MovieReview[2];
		
		
		MovieReview tajja = new MovieReview();
		tajja.title = "타짜";
		tajja.review = "묻고 더블로 가";
		reviews[0] = tajja;
		
		MovieReview aboutTime = new MovieReview();
		aboutTime.title ="어바웃타임";
		aboutTime.review = "인생 시간 영화";
		reviews[1] = aboutTime;
		
		
		for (MovieReview review : reviews) {
			System.out.println("영화제목: " + review.title + ", 리뷰: " + review.review);
			
		}
	
		
	}

}
