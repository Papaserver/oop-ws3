package com.codecool.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		Cat cat = new Cat("Shere Khan", false);
//		cat.feed();

		Dog dog = new Dog("Capone", true);
//		dog.feed();

		Owner owner = new Owner();
		owner.ownAnimals(cat);
		owner.ownAnimals(dog);
		owner.feedAnimals();
    }


}
