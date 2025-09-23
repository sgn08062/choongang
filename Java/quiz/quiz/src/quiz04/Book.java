package quiz04;

//부모클래스

public class Book {
    String title;
    String author;
    double price;

    // 생성자
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

	// 기본 할인 없음
    double getFinalPrice() { 
        return price;
    }

    // toString() 오버라이드
    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", 가격: " + price + "원";
    }
}