package com.project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CarShowroomManager{


	public static void main(String[] args) throws IOException{
		// write your code here
		Scanner sc = new Scanner(System.in);
		//Instantiation of Showroom class and use its function for adding, showing , updating and issuing the car
		Showroom sh = new Showroom();

		boolean status = false;
		do{
			System.out.println("*****Welcome to Star Showroom*****");
			System.out.println("Enter your choice: ");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			String choice = sc.next();
			if(choice.equals("1")){
				System.out.println("\n------REGISTER NEW USER------\n");
				User_pass up = new User_pass();
				up.registerNewUser();
				status = true;
			}else if(choice.equals("2")){
				User_pass up = new User_pass();
				up.logIn();
				if(up.logIn() == 1){
					sh.showAvailableCars();
					//calling the chooseCar function to ask the user to choose a car
					sh.chooseCar();

					sh.Receipt();

					status = true;
				}
				else{
					status = false;
				}
			}else{
				System.out.println("Thank you for using our program");
				status = false;
			}
		}while(status);
	}
}
