package com.project;

import java.io.*;
import java.util.Scanner;

public class User_pass{


	void registerNewUser() throws IOException{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your Username: ");
		String id = myObj.next();
		System.out.println("Enter your password: ");
		String pass = myObj.next();

		BufferedWriter bw = new BufferedWriter(new FileWriter("Login Details.txt", true));
		bw.write(id + "," + pass);
		bw.flush();
		bw.newLine();
		bw.close();
		System.out.println("****User has been registered****");

	}

	void logIn() throws IOException{
		System.out.println("****User Login****");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your Username: ");
		String id = myObj.next();
		System.out.println("Enter your password: ");
		String pass = myObj.next();

		BufferedReader br = new BufferedReader(new FileReader("Login Details.txt"));
		/*String record;
		boolean flag = true;
		while((record = br.readLine()) != null){
			String[] arrOfStr = record.split(",", -2);
			do{
				if(arrOfStr[0].contains(id) && arrOfStr[1].contains(pass)){
					System.out.println("****Successfully Log IN****");
					flag = false;
				}else{
					System.out.println("****LOGIN FAILED TRY AGAIN****\n");

				}
			}while(flag);
			br.close();
		}*/
		String record;
		int flag = 0;
		while((record = br.readLine()) != null){
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
	}
}