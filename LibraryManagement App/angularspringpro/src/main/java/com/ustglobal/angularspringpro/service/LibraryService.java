package com.ustglobal.angularspringpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ustglobal.angularspringpro.dto.BookInventary;
import com.ustglobal.angularspringpro.dto.BookRegistration;
import com.ustglobal.angularspringpro.dto.BookTransaction;
import com.ustglobal.angularspringpro.dto.UserBean;

public interface LibraryService<Users> {

	public boolean registerUser(UserBean userInfo);
	public UserBean loginUser(String userEmail,String password);
	public boolean updateUser(UserBean userInfo);
	public boolean removeUser(int id);
	public List<UserBean> getAllUsers();
	public boolean addBook(BookInventary bookDto);
	public boolean deleteBook(int id);
	public boolean updateBook(BookInventary bookDto);
	public BookInventary getBook(BookInventary bookDto);
	public List<BookInventary> getAllBooks();
	
	/*
	 * public StudentBookDto acceptBookRequest(int userId,int bookId); public
	 * List<StudentBookDto> getIssueBookList(int userId); public boolean
	 * returnBook(int bookId);
	 */
	public List<UserBean> searchByName(String userName);
	public boolean changePassword(String email,String password,String newPassword);
	public boolean requestBook(BookInventary book,int id);
	public List<BookRegistration> getAllBook();
	public boolean removeBook(int bId);
	
	public boolean allocateBook(BookRegistration request);

	public List<BookTransaction> getAlluserBooks(int id);
	
	public boolean removeBookReg(int bId);
	public int addBookAgain(BookTransaction book);
	public boolean addBookAgain1(BookRegistration book);

}

