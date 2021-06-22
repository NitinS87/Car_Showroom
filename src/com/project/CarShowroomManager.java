package com.project;

import java.io.IOException;
import java.util.Scanner;

public class CarShowroomManager{


	public static void main(String[] args) throws IOException{
		// write your code here
		Scanner sc = new Scanner(System.in);
		//Instantiation of Showroom class and use its function for adding, showing , updating and issuing the car
		Showroom sh = new Showroom();
//status is used to check the flow of program using while statement
		boolean status;
		do{
			System.out.println("*****Welcome to Star Showroom*****");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			//choice is used to input the index value
			String choice = sc.next();
			switch(choice){
				case "1" ->{
					System.out.println("\n------REGISTER NEW USER------");
					//user_pass class is instantiated to call its method
					User_pass up = new User_pass();
					//register method is called to register a new user
					up.registerNewUser();
					status = true;
				}
				case "2" -> {
					User_pass up = new User_pass();
					//
					if(up.logIn() == 1){
						//show the available cars in showroom class
						sh.showAvailableCars();
						//calling the chooseCar function to ask the user to choose a car
						sh.chooseCar();
						//for creating receipt the method in showroom class is formed
						sh.Receipt();

						status = true;
					}else{
						status = true;
					}
				}
				case "3" -> {
					System.out.println("Thank you for using our program");
					status = false;
				}
				default -> status = true;
			}
		}while(status);
	}
}
