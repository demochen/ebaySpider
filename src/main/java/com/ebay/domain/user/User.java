package com.ebay.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
    @Column(name="UserName")
	private String userName;
	
    @Column(name="PassWord")
	private String passWord;

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	

}
