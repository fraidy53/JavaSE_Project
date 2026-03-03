package mylab.library.entity;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private int publishYear;
    private boolean isAvailable;

    // 기본 생성자
    public Book() {
        this.isAvailable = true;
    }

    // 모든 필드 초기화 생성자
    public Book(String title, String author, String isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.isAvailable = true;
    }

    // Getter
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getPublishYear() { return publishYear; }
    public boolean isAvailable() { return isAvailable; }

    // Setter
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setPublishYear(int publishYear) { this.publishYear = publishYear; }
    public void setAvailable(boolean available) { isAvailable = available; }

    // 도서 대출
    public boolean checkOut() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    // 도서 반납
    public void returnBook() {
        isAvailable = true;
    }

    // 도서 정보 출력
    @Override
    public String toString() {
        return "책 제목: " + title +
                "\t저자: " + author +
                "\tISBN: " + isbn +
                "\t출판년도: " + publishYear +
                "\t대출 가능 여부: " + (isAvailable ? "가능" : "대출 중");
    }
}