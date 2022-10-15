package com.acts.bookstore;



public class Books {
	private String title;
	private BookType bookType;
	private int price;
	private String publishedDate;
	private String authorName;
	private int quantity;
	
	public Books(String title, BookType bookType, int price, String publishedDate, String authorName,int quantity
			) {
		super();
		this.title = title;
		this.bookType = bookType;
		this.price = price;
		this.publishedDate = publishedDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BookStore [title=" + title + ", bookType=" + bookType + ", price=" + price + ", publishedDate="
				+ publishedDate + ", authorName=" + authorName + ", quantity=" + quantity + "]\n";
	}
	
	

}
