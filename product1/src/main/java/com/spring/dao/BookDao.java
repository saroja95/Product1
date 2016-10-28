package com.spring.dao;

import java.util.List;

import com.spring.model.Book;

public interface BookDao {
static List<Book> getAllBooks() {
	// TODO Auto-generated method stub
	return null;
}
Book getBookByIsbn(int isbn);
void editBook(Book book);
void addBook(Book book);
void deleteBook(Book book);
}

