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
		return ok(enter.render(books));
		
	}
	
	// to create book 
	
	public Result create() {
		Form<Book> bookForm = formFactory.form(Book.class);
		
		
		return ok(create.render(bookForm));
	}
	
	
	// for saving book
	
	public Result save() {
		Form<Book> bookForm=formFactory.form(Book.class).bindFromRequest();
		Book book=bookForm.get();
		Book.add(book);
		return redirect(routes.BooksController.index());
	}
	
	public Result edit(Integer id) {
		
		Book book=Book.findById(id);
		if(book==null) {
			return notFound("book not found");
		}
		Form<Book> bookForm=formFactory.form(Book.class).fill(book);
		return ok(edit.render(bookForm));
	}
	
	public Result update() {
		Book book=formFactory.form(Book.class).bindFromRequest().get();
		Book oldBook=Book.findById(book.id);
		if(oldBook==null) {
			return notFound(" Book Not Found ");
		}
		oldBook.title=book.title;
		oldBook.author=book.author;
		oldBook.prize=book.prize;
		
		return redirect(routes.BooksController.index());
		
	}
	
	public Result destroy(Integer id) {
		return TODO;
	}
	
	
	public Result show(Integer id) {
		return TODO;
	}
	
	
	
}
