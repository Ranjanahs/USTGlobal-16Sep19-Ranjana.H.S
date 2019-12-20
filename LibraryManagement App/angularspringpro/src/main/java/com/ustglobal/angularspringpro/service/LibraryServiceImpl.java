package com.ustglobal.angularspringpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.angularspringpro.dao.LibraryDAO;
import com.ustglobal.angularspringpro.dto.BookInventary;
import com.ustglobal.angularspringpro.dto.BookRegistration;
import com.ustglobal.angularspringpro.dto.BookTransaction;
import com.ustglobal.angularspringpro.dto.UserBean;

@Service
public class LibraryServiceImpl implements LibraryService{
	
	@Autowired
	 private LibraryDAO dao;
	
	
	public boolean registerUser(UserBean userInfo) {
		return dao.registerUser(userInfo);
	}

	@Override
	public UserBean loginUser(String userEmail, String password) {
		return dao.loginUser(userEmail, password);
	}

	@Override
	public boolean updateUser(UserBean userInfo) {
		return dao.updateUser(userInfo);
	}

	@Override
	public boolean removeUser(int id) {
		return dao.removeUser(id);
	}

	@Override
	public boolean addBook(BookInventary bookDto) {
		return dao.addBook(bookDto);	
	}

	@Override
	public boolean deleteBook(int id) {
		return dao.deleteBook(id);
	}

	@Override
	public boolean updateBook(BookInventary bookDto) {
		return dao.updateBook(bookDto);
	}

	@Override
	public BookInventary getBook(BookInventary bookDto) {
		return dao.getBook(bookDto);
	}

	@Override
	public List<UserBean> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public List<BookInventary> getAllBooks() {
		return dao.getAllBooks();
	}
	/*
	 * @Override public StudentBookDto acceptBookRequest(int userId, int bookId) {
	 * return dao.acceptBookRequest(userId, bookId); }
	 * 
	 * @Override public List<StudentBookDto> getIssueBookList(int userId) { return
	 * dao.getIssueBookList(userId); }
	 * 
	 * @Override public boolean returnBook(int bookId) { return
	 * dao.returnBook(bookId); }
	 */

	@Override
	public List<UserBean> searchByName(String userName) {
		return dao.searchByName(userName);
	}

	@Override
	public boolean changePassword(String email, String password, String newPassword) {
		return dao.changePassword(email, password, newPassword);
	}

	@Override
	public boolean requestBook(BookInventary book,int id) {
		return dao.requestBook(book,id);
	}

	@Override
	public List<BookRegistration> getAllBook() {
		return dao.getAllBook();
	}

	@Override
	public boolean removeBook(int bId) {
		return dao.removeBook(bId);
	}

	@Override
	public boolean allocateBook(BookRegistration bookAction) {
		return dao.allocateBook(bookAction);
	}

	@Override
	public List<BookTransaction> getAlluserBooks(int id) {
		return dao.getAlluserBooks(id);
	}

	@Override
	public boolean removeBookReg(int bId) {
		return dao.removeBookReg(bId);
	}

	@Override
	public int addBookAgain(BookTransaction book) {
		return dao.addBookAgain(book);
	}

	@Override
	public boolean addBookAgain1(BookRegistration book) {
		return dao.addBookAgain1(book);
	}
}
