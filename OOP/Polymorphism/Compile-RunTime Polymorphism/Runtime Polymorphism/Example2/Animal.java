package com.anisha.runtimepolymorphism.examples;

// Superclass : Animal
public class Animal implements AnimalBehaviour {
//	Overriden method
	public void makeSound(String animalType) {
		System.out.println("Animal :Some generic animal sounds");
	}

//	Concrete method
	public void eat() {
		System.out.println("Animals are eating");
	}

}
