package workshop.book.entity;

public class Novel extends Publication {
	// 상속받은 속성이 아니라 Novel이 가지는 독자적인 속성
	private String author;
	private String genre;
	
	public Novel() {
	}

	public Novel(String title, String publishingDate, int page, int price, String author, String genre) {
		super(title, publishingDate, page, price);
		this.author = author;
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
}
