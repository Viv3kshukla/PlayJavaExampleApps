package controllers;

import java.util.*;

import javax.inject.Inject;

import play.data.*;
import play.mvc.*;
import models.Book;
import views.html.*;

public class BooksController extends Controller{
	
	@Inject
	FormFactory formFactory;
	
	// for all books
	public Result index() {
		Set<Book> books=Book.allBooks();
		Book bk =new Book(1,"vivek",34,"aluthaeedf");
		return ok(enter.render(books));
		
	}
	
	// to create book 
	
	public Result create() {
		Form<Book> bookForm = formFactory.form(Book.class);
		
		
		return ok(create.render(bookForm));
	}
	
	
	// for saving book
	
	public Result save() {
		return TODO;
	}
	
	public Result edit(Integer id) {
		return TODO;
	}
	
	public Result update() {
		return TODO;	
	}
	
	public Result destroy(Integer id) {
		return TODO;
	}
	
	
	public Result show(Integer id) {
		return TODO;
	}
	
	
	
}
