package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

public class Category {
	@Id
	private int cid;
	@Column(name="category")
	private String categoryName;
	@OneToMany(mappedBy="category")
	List books1;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List getBooks() {
		return books1;
	}
	public void setBooks(List books) {
		this.books1 = books;
	}


	}



