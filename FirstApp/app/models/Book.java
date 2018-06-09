package models;

import java.util.HashSet;
import java.util.Set;

public class Book {

	public Integer id;
	public String title;
	public Integer prize;
	public String author;
	
	
	public Book() {
		
	}
	
	public Book(Integer id, String title,Integer prize, String author) {
		this.id=id;
		this.title=title;
		this.prize=prize;
		this.author=author;
	}
	
	private static Set<Book> books;
	
	static {
		books=new HashSet<>();
		books.add(new Book(1,"C++",345,"dennis ricchie"));
		books.add(new Book(2,"Java",345,"Rayan Goshling"));
	}
	
	public static Set<Book> allBooks(){
		return books;
	}
	
	
	public static Book findById(Integer id) {
		for(Book book:books) {
			if(id.equals(book.id)) {
				return book;
			}
		}
		
		return null;
	}
	
	public static void add(Book book) {
		books.add(book);
	}
	
	public static boolean remove(Book book) {
		return books.remove(book);
	}


//	public Integer getId() {
//		return id;
//	}
//
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//
//	public String getTitle() {
//		return title;
//	}
//
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//
//	public Integer getPrize() {
//		return prize;
//	}
//
//
//	public void setPrize(Integer prize) {
//		this.prize = prize;
//	}
//
//
//	public String getAuthor() {
//		return author;
//	}
//
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	
	
	
}
