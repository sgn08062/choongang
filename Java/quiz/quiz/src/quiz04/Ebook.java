package quiz04;

public class Ebook extends Book {
    double fileSize;

    Ebook(String title, String author, double price, double fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    double getFinalPrice(){
        return price*0.9;
    }

    public String toString(){
        return "제목: " + title + ", 저자: " + author + ", 가격: " + this.getFinalPrice() + "원, 파일 크기: " + fileSize;
    }

    public String findBook(String title){
        if(title.equals(this.title)){
            return title;
        }else{
            return null;
        }
    }

    public double findBook(double maxPrice){
        if(maxPrice > this.price){ return this.price;}
        else{return maxPrice;}
    }
}
