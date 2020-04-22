package com.qa.account.data.services;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AccountNumGen {

	public String chooseLetter(String firstLetter){
		
		char firstChar = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(int i = 0; i <= 3; i++){
			int randomIndex = (int) (Math.random() * list.size());
			if(randomIndex == 1) {
				firstChar = 'a';				
			}
			else if(randomIndex == 2) {
				firstChar = 'b';
			}
			else {
				firstChar='c';
			}
		}
		String charToString = String.valueOf(firstChar);
		return charToString;
		 
	}
	
	public String randomLastLetters(String lastLetters) {
		
		String length = "";
		SecureRandom random = new SecureRandom();
		String remainder = "";
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(int i = 0; i <= 3; i++){
			int randomIndex = (int) (Math.random() * list.size());
			if(randomIndex == 1) {
				length = "a";
			}
			else if(randomIndex == 2) {
				length = "b";
			}
			else {
				length="c";
			}
		}
		
		if(length=="a") {
			int num = random.nextInt(100000);
			remainder = String.format("%05d", num);

		}
		
		if(length=="b") {
			int num = random.nextInt(10000000);
			remainder = String.format("%07d", num);

		}
		if(length=="c") {
			int num = random.nextInt(10000000);
			remainder = String.format("%09d", num);

		}
		return remainder;
	}
	
	public String randomAccountNumber(String accountNumber, String firstLetter, String lastLetters) {
		
		accountNumber = chooseLetter(firstLetter) + randomLastLetters(lastLetters);
		System.out.println(accountNumber);
		return accountNumber;
		
	}
	
}
