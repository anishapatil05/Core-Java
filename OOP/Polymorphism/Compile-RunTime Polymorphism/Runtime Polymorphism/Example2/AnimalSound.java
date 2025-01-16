package com.anisha.runtimepolymorphism.examples;

public class AnimalSound {

	public static void main(String[] args) {
		System.out.println("****Interface Level & class ****");
//		reference of Interface
		AnimalBehaviour sounds = new Animal();
		sounds.makeSound("Animals");

//		child class  AnimalCat();
		sounds = new AnimalCat();
		sounds.makeSound("cat");

//		child class  AnimalDog();
		sounds = new AnimalDog();
		sounds.makeSound("Dog");

		AnimalCat cat = new AnimalCat();
		cat.catFood();

		AnimalDog dog = new AnimalDog();
		dog.eat();
		dog.foodOfDog();

	}

}
