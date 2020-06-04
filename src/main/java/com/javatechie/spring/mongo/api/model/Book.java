package com.javatechie.spring.mongo.api.model;





import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString

@Document(collection = "Book")
public class Book {
	
	@Transient
    public static final String SEQUENCE_NAME = "books_sequence";
	
	@Id
	private long id;
	private String bookName;
	private String authorName;
	
	public Book() {}
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + "]";
	}
	
	
}
