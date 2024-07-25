package javabasic.class1.ex;

public class MovieReviewMain1  {
	
	public static void main(String[] args) {
		MovieReview tajja = new MovieReview();
		tajja.title = "타짜";
		tajja.review = "묻고 더블로 가";
		
		MovieReview aboutTime = new MovieReview();
		aboutTime.title ="어바웃타임";
		aboutTime.review = "인생 시간 영화";
		
		
		System.out.println("영화제목: " + tajja.title + ", 리뷰: " + tajja.review);
		System.out.println("영화제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
		
	}

}
