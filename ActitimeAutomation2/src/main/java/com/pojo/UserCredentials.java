package com.pojo;

public class UserCredentials {

	private String userName;
	private String password;
	private String description;
	private String expectedResult;

	public UserCredentials() {

	}

	public UserCredentials(String userName, String password, String description, String expectedResult) {
		this.userName = userName;
		this.password = password;
		this.description = description;
		this.expectedResult = expectedResult;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExpectedResult() {
		return expectedResult;
	}

	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

}
