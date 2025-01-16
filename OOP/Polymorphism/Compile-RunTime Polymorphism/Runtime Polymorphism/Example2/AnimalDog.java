package com.anisha.runtimepolymorphism.examples;

public class AnimalDog extends Animal{

//	Overriden method
	public void makeSound(String animalType) {
		System.out.println(" AnimalDog :sound of Dog...Barking");
	}

//	normal
	public void foodOfDog() {
		System.out.println("The dog eats rooti");
	}
}
