package com.spring.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="bookapp")
public class Book {// Book has Category
@Id
@Column(name="isbn")
@GeneratedValue(strategy=GenerationType.AUTO)
private int isbn;

@NotEmpty(message="Title is mandatory")
private String title;


@NotEmpty(message="publication is mandatory")
private String publication;



@Min(value=100,message="Minimum value should be greater than 100")
private int price;
private String author;
@ManyToOne
@JoinColumn(name="category")//category is the name of the foreign key column in bookApp table
private Category category;

public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}


}


