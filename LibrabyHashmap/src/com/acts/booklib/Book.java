package com.acts.booklib;

import java.time.LocalDate;
import java.util.Objects;

public class Book implements Comparable<Book>{
	
	String title;
	int price;
	LocalDate publsishedDate;
	String authorName;
	int quantity;
	BookType book;
	public Book(String title, int price, LocalDate publsishedDate, String authorName, int quantity, BookType book) {
		super();
		this.title = title;
		this.price = price;
		this.publsishedDate = publsishedDate; 
		this.authorName = authorName;
		this.quantity = quantity;
	    this.book = book;
	    
	    
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getPublsishedDate() {
		return publsishedDate;
	}
	public void setPublsishedDate(LocalDate publsishedDate) {
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
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(authorName, book, price, publsishedDate, quantity, title);
//	}
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
