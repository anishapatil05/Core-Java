package anisha.abstraction;

public class AnimalSoundImpl implements AnimalCat, AnimalDog {

//	method from AnimalDog
	public void soundDog() {
		System.out.println("The dog Barks");
	}

//	method from AnimalCat
	public void SoundOfCat() {
		System.out.println("the cat sound like meow");
	}

	@Override
//	Method from Animal
	public String sound() {
		// TODO Auto-generated method stub
		return "The Dog and Cat sounds";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalSoundImpl obj = new AnimalSoundImpl();
		System.out.println(obj.sound());
		obj.soundDog();
		obj.SoundOfCat();

	}

}
