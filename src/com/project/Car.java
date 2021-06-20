package com.project;
// This is a base car class
// It has name, engine, design, maintenance and price variables which stores data accordingly

public class Car{
	String name = "Car";
	String engine = "This is a engine";
	String design = "It has 4 seats and average interiors design";
	String Maintenance = "This car has average maintenance";
	String price = "price in Rs";

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

//After this all cars' data is registered
class Alto extends Car{
	String name = "Maruti Suzuki Alto";
	String engine = "998cc with 25kmpl petrol and diesel";
	String design = "It has 4 seats and low interiors Hatchback design";
	String Maintenance = "This car has low maintenance";
	long price = 500000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class Swift extends Car{
	String name = "Maruti Suzuki Swift";
	String engine = "1197cc engine with 25kmpl Petrol and CNG";
	String design = "It has 4 seats and average interiors Hatchback design";
	String Maintenance = "This car has low maintenance";
	long price = 800000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class Baleno extends Car{
	String name = "Maruti Suzuki Baleno";
	String engine = "1197cc engine with 22kmpl Petrol and CNG";
	String design = "It has 4-5 seats and average interior Sedan design";
	String Maintenance = "This car has low-average maintenance";
	long price = 1000000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class City extends Car{
	String name = "Honda City";
	String engine = "1497cc engine with 20kmpl Petrol and CNG ";
	String design = "It has 4-5 seats and average interiors Sedan design";
	String Maintenance = "This car has average maintenance";
	long price = 1200000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class Laura extends Car{
	String name = "Skoda Laura";
	String engine = "1798cc engine with 18kmpl Petrol and CNG ";
	String design = "It has 4-5 seats and average interiors Sedan design";
	String Maintenance = "This car has average maintenance";
	long price = 1500000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class Scorpio extends Car{
	String name = "Mahindra Scorpio";
	String engine = "2179cc engine with 20kmpl Petrol and CNG ";
	String design = "It has 6-7 seats and above average interiors SUV design";
	String Maintenance = "This car has average high maintenance";
	long price = 2000000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class Fortuner extends Car{
	String name = "Toyota Fortuner";
	String engine = "2700cc engine with 18kmpl Petrol and CNG ";
	String design = "It has 6-7 seats and above average interiors SUV design";
	String Maintenance = "This car has average-high maintenance";
	long price = 3000000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}


class Model3 extends Car{
	String name = "Tesla Model 3";
	String engine = "Electric hi-performance engine and having range 263-353 miles  ";
	String design = "It has 4 seats and high-end interiors Sedan design";
	String Maintenance = "This car has average maintenance";
	long price = 6000000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class R8 extends Car{
	String name = "Audi R8";
	String engine = "5204cc engine with 7kmpl petrol  ";
	String design = "It has 2 seats and high end Sports-car interiors design";
	String Maintenance = "This car has high  maintenance";
	long price = 28000000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class Roadster extends Car{
	String name = "Tesla Roadster";
	String engine = "Electric hi-performance engine and having range 500-620 miles";
	String design = "It has 2 seats and high end Sports car interiors design";
	String Maintenance = "This car has average maintenance";
	long price = 30000000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}

class Aventador extends Car{
	String name = "Lamborghini Aventador";
	String engine = "6498cc engine with Petrol ";
	String design = "It has 2 seats and high end Sports car interiors design";
	String Maintenance = "This car has high maintenance";
	long price = 50000000;

	@Override
	public String toString(){
		return "Car{" +
				"Name='" + name + '\'' + "\n" +
				"Engine='" + engine + '\'' + "\n" +
				"Design='" + design + '\'' + "\n" +
				"Maintenance='" + Maintenance + '\'' + "\n" +
				"Price='" + " Rs" + price + '\'' +
				'}';
	}
}
