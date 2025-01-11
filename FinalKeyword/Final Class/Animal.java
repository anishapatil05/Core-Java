package com.anisha.polymorphism.methods;

/* Example of Fianl Class (Preventing Inheritance): Animal 
 * Introducing Sounds of Animal : catSound(), dogSound(), sparrowSound(), hoseCrowSound()
*/
public final class Animal {

//	method1
	public void catSound() {
		System.out.println("Sound of cat : mehow");
	}
	
//	method2
	public void dogSound() {
		System.out.println("Dog is  : Barking");
	}
	
//	method3
	public void sparrowSound() {
		System.out.println("Sparrow sounding like : cheep-cheep-cheep");
	}
	
//	method4
	public void houseCrowSound() {
		System.out.println("House crow sounding : kaaa- kaaa");
	}
	public static void main(String[] args) {
//	 Calling method
		Animal sound = new Animal();
		sound.catSound();
		sound.dogSound();
		sound.sparrowSound();
		sound.houseCrowSound();

	}

}
