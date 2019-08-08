package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat1 = new Cat("Pers", "white", 5, 9.5);
	Cat cat2 = new Cat("Linda", "black", 3, 6.2);
	Cat cat3 = new Cat("Nuts", "white", 8, 10);


	cat1.play();
	cat2.eat();
	cat3.voice();

	cat1.setAge(6);

	System.out.println(cat1);
	System.out.println(cat2);
	System.out.println(cat3);




    }
}
