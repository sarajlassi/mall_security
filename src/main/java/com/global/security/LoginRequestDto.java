package com.global.security;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequestDto {

	@NotEmpty
	private String login;
	
	@NotEmpty
	private String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginRequestDto(@NotEmpty String login, @NotEmpty String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public LoginRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
