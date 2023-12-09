package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "재밌어요";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "감동적입니다";

        System.out.println("제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}
