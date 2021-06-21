package com.project;

import java.io.*;
import java.util.Scanner;

public class User_pass{

	//method to register a new user which throws IOException
	void registerNewUser() throws IOException{
		//id is used to store the username
		//pass is used to store the password
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter your Username: ");
		String id = myObj.next();
		System.out.print("Enter your password: ");
		String pass = myObj.next();
		//used buffer writer to write data in Login Details file
		BufferedWriter bw = new BufferedWriter(new FileWriter("Login Details.txt", true));
		bw.write(id + "," + pass);
		//flush is used to clear the stream data
		bw.flush();
		//adds a new line
		bw.newLine();
		//close the stream
		bw.close();
		System.out.println("****User has been registered****");

	}
//login method to authenticate user info with the login details file
	int logIn() throws IOException{
		System.out.println("****User Login****");
		//id is used to store the username
		//pass is used to store the password
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter your Username: ");
		String id = myObj.next();
		System.out.print("Enter your password: ");
		String pass = myObj.next();
		//bufferReader is used to read the data in file
		BufferedReader br = new BufferedReader(new FileReader("Login Details.txt"));
		//record is used to get the store the data for a specific stream
		String record;
		//flag is used to check if the login success or not
		int flag = 0;
		//while statement to read the lines until it hits null
		while((record = br.readLine()) != null){
			//arrOfStr is used to store the data in the form of array
			//split method is used to split the data for a specific character
			String[] arrOfStr = record.split(",", -2);
			if(arrOfStr[0].contains(id) && arrOfStr[1].contains(pass)){
				flag = 1;
			}
		}
		br.close();
		if(flag == 1){
			System.out.println("\nSuccessfully Log IN\n");

		}else{
			System.out.println("****LOGIN FAILED TRY AGAIN****\n");
		}
		return flag;
	}
}