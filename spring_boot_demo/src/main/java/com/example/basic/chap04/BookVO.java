package com.example.basic.chap04;

public class BookVO {
    private String title;
    private String author;
    private long id;
    public BookVO(String title, String author, long id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public BookVO() {
    }

    @Override
    public String toString() {
        return "BookVO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
