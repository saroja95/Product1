package com.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Book;
import com.spring.model.Category;
import com.spring.services.BookServices;
import com.spring.services.BookServices;
@Controller
public class BookController {
	@Autowired
private BookServices bookService;
	private BookServices bookServices;

public BookServices getBookService() {
	return bookServices;
}

public void setBookService(BookServices bookService) {
	this.bookServices = bookService;
}
@RequestMapping("/getAllBooks")
public ModelAndView getAllProducts(){
	BookServices bookServices = null;
	List<Book> books = bookServices.getAllBooks();
	return new ModelAndView("booksList","books",books);
}
@RequestMapping("getBookByIsbn/{isbn}")
public ModelAndView getBookByIsbn(@PathVariable(value="isbn") int isbn){
	BookServices bookServices = null;
	Book b=bookServices.getBookByIsbn(isbn);
	return new ModelAndView("bookPage","bookObj",b);
}
//Two method for insert
//1. Method is to forward to bookForm.jsp


//2. Method is to insert the record by invoking dao method
//<a href=""></a> //get method
@RequestMapping(value="/admin/book/addBook",method=RequestMethod.GET)
public String getBookForm(Model model){
	Book book=new Book();
	Category category=new Category();
	category.setCid(1);//New Arrivals
	//set the category as 1 for the Book book
	book.setCategory(category);
	model.addAttribute("bookFormObj",book);
	return null;

}
@Bean
public MultipartResolver multipartResolver(){
	CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
	multipartResolver.setMaxUploadSize(10240000);
	return multipartResolver;
}	

}
