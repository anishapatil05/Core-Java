package com.anisha.runtimepolymorphism.examples;

//subclass
public class AnimalCat extends Animal {
//	Overriden method
	public void makeSound(String animalType) {
		System.out.println("AnimalCat :sound of cat...Mehew");
	}

//	normal
	public void catFood() {
		System.out.println("The cat eats mouse");
	}

}
