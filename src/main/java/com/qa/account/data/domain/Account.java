package com.qa.account.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Account {

	@GeneratedValue
	private long id;
	
	private long randomNumber;
	
	public Account(long id, long randomNumber) {
		super();
		this.id = id;
		this.randomNumber = randomNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(long randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	
	
}
