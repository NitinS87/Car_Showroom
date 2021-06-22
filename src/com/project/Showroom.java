package com.project;
//This class store no. of cars and update the array of cars

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Showroom{
	String[] cars;
	int no_of_cars;

	//Default Constructor which stores default limits and values.
	Showroom(){
		this.cars = new String[100];
		this.no_of_cars = 11;
		cars[0] = "Maruti Suzuki Alto";
		cars[1] = "Maruti Suzuki Swift";
		cars[2] = "Maruti Suzuki Baleno";
		cars[3] = "Honda City";
		cars[4] = "Skoda Laura";
		cars[5] = "Mahindra Scorpio";
		cars[6] = "Toyota Fortuner";
		cars[7] = "Tesla Model 3";
		cars[8] = "Audi R8";
		cars[9] = "Tesla Roadster";
		cars[10] = "Lamborghini Aventador";

	}

//showAvailableCars is used to show the cars

	void showAvailableCars(){
		System.out.println("Available Cars are: ");
		for(int i = 0; i < this.no_of_cars; i++){
			if(this.cars[i] == null){
				continue;
			}
			System.out.println(i + 1 + ". " + cars[i]);
		}
	}
	//chosenCar and chosenCarPrice for storing the car name and price
	static String chosenCar;
	static long chosenCarPrice;

	//auth() function stores the user authentication steps, username and password

	void chooseCar(){
		Scanner sc = new Scanner(System.in);
		//wantToBuy variable for giving user the choice to buy or not
		//chosenCar and chosenCarPrice for storing the car name and price
		String wantToBuy;

		//loop for switch case to ask the user for a certain car details
		do{
			System.out.print("Which car do you wish to buy(Please enter numeric keyword): ");
			String show = sc.next();
			switch(show){
				case "1" -> {
					Alto alto = new Alto();
					System.out.println(alto);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = alto.name;
					chosenCarPrice = alto.price;
				}
				case "2" -> {
					Swift swift = new Swift();
					System.out.println(swift);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = swift.name;
					chosenCarPrice = swift.price;
				}
				case "3" -> {
					Baleno baleno = new Baleno();
					System.out.println(baleno);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = baleno.name;
					chosenCarPrice = baleno.price;
				}
				case "4" -> {
					City city = new City();
					System.out.println(city);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = city.name;
					chosenCarPrice = city.price;
				}
				case "5" -> {
					Laura laura = new Laura();
					System.out.println(laura);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = laura.name;
					chosenCarPrice = laura.price;
				}
				case "6" -> {
					Scorpio scorpio = new Scorpio();
					System.out.println(scorpio);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = scorpio.name;
					chosenCarPrice = scorpio.price;
				}
				case "7" -> {
					Fortuner fortuner = new Fortuner();
					System.out.println(fortuner);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = fortuner.name;
					chosenCarPrice = fortuner.price;
				}
				case "8" -> {
					Model3 model3 = new Model3();
					System.out.println(model3);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = model3.name;
					chosenCarPrice = model3.price;
				}
				case "9" -> {
					R8 r8 = new R8();
					System.out.println(r8);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = r8.name;
					chosenCarPrice = r8.price;
				}
				case "10" -> {
					Roadster roadster = new Roadster();
					System.out.println(roadster);
					System.out.print("Do you want to buy this car(Press y if yes or press n if not): ");
					wantToBuy = sc.next();
					chosenCar = roadster.name;
					chosenCarPrice = roadster.price;
				}
				case "11" -> {
					Aventador aventador = new Aventador();
					System.out.println(aventador);
					System.out.print("Do you want to buy this car(Press 'y' if yes or press 'n' if not): ");
					wantToBuy = sc.next();
					chosenCar = aventador.name;
					chosenCarPrice = aventador.price;
				}
				default -> {
					System.out.print("You have entered wrong");
					wantToBuy = "n";
				}
			}
		}while(!wantToBuy.equals("y"));
		//issueCar for issuing chosenCar and update it in the array
		issueCar(chosenCar);

		System.out.print("Enter the amount of the car " + chosenCarPrice + ": ");
	}

	//issueCar is used to issue and buy a car
	void issueCar(String Car){
		for(int i = 0; i < this.cars.length; i++){
			if(this.cars[i].equals(Car)){
				System.out.println(Car + " has been issued!");
				this.cars[i] = null;
				return;
			}
		}
		System.out.println("This car does not exist");
	}

	//Receipt() is used to write the price of the car and give a receipt using file handling
	void Receipt(){
		Scanner sc = new Scanner(System.in);
		//amount variable is used to store the car price entered by the user
		long amount;
		//loop for finding out that the entered amount is correct or not
		do{
			amount = sc.nextLong();

			if(amount < chosenCarPrice || amount > chosenCarPrice){
				System.out.println("You have entered wrong amount");
				System.out.println("Please enter the correct amount");

			}else{
				System.out.println("Thank you, Come Back Again!");
				System.out.println("Your receipt is on the way: ");
			}
		}while(chosenCarPrice != amount);
		//Writing a file
		try{
			int random_int = (int)Math.floor(Math.random()*(20000-50+1)+50);
			String fname = "Receipt" + random_int +".txt";
			//random number is added to receipt to avoid naming conflict

			FileWriter fileWriter = new FileWriter(fname);
			fileWriter.write("------------------------------------------------------------");
			fileWriter.write("\n----- Welcome To Star Showroom-----");
			fileWriter.write("\nYou have bought " + chosenCar);
			fileWriter.write("\nThis is your receipt of Rs" + chosenCarPrice);
			fileWriter.write("\nCome Back Soon");
			fileWriter.write("\n------------------------------------------------------------");
			fileWriter.close();
			System.out.println("Your receipt has been generated!");
			System.out.println("Please collect your receipt");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
