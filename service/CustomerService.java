package service;

import model.User;

public interface CustomerService {
	public User signUp(User user);
	public User getLogin(String userName, String pw);
}