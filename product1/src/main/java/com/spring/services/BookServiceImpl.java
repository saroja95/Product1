package com.spring.services;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;
	import com.spring.dao.BookDao;
	import com.spring.model.Book;
	@Service
	public class BookServiceImpl implements BookServices {

		@Autowired
	private BookDao bookDao;

		public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	@Transactional
		public List<Book> getAllBooks() {
			return BookDao.getAllBooks();
		}
	public Book getBookByIsbn(int isbn) {
		return bookDao.getBookByIsbn(isbn);
	}
	public void deleteBook(Book isbn) {
		bookDao.deleteBook(isbn);
	}

	public void addBook(Book book) {
		bookDao.addBook(book);
		}

	public void editBook(Book book) {
		bookDao.editBook(book);
		}
	}
