package com.acts.hashset;

import java.util.Objects;

public class Book implements Comparable<Book>{
	
	String title;
	String price;
	String publsishedDate;
	String authorName;
	int quantity;
	BookType book;
	public Book(String title, String price, String publsishedDate, String authorName, int quantity, String book) {
		super();
		this.title = title;
		this.price = price;
		this.publsishedDate = publsishedDate;
		this.authorName = authorName;
		this.quantity = quantity;
	    this.book = BookType.valueOf(book);
	    
	    
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublsishedDate() {
		return publsishedDate;
	}
	public void setPublsishedDate(String publsishedDate) {
		this.publsishedDate = publsishedDate;
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
	public BookType getBook() {
		return book;
	}
	public void setBook(BookType book) {
		this.book = book;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(authorName, book, price, publsishedDate, quantity, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && book == other.book && Objects.equals(price, other.price)
				&& Objects.equals(publsishedDate, other.publsishedDate) && quantity == other.quantity
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", publsishedDate=" + publsishedDate + ", authorName="
				+ authorName + ", quantity=" + quantity + ", book=" + book + "]";
	}
	@Override
	public int compareTo(Book o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	
	
	

}
