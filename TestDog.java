package oops;

public class TestDog {

	public static void main(String[] args) {
		
		System.out.println("Parent Class");
		Animal a1=new Animal();
		a1.eat();
		System.out.println("1st Child Class of Animal");
		Dog d1=new Dog();
		d1.eat();
		d1.bark();
		System.out.println(d1.color);
		
		//a1.bark();
		
		System.out.println(" Child Class of Dog");

		BabyDog babyDog=new BabyDog();
		babyDog.eat();
		babyDog.bark();
		babyDog.cry();
		
		System.out.println("2nd Child Class of Animal");
		Cat cat=new Cat();
		cat.eat();
		cat.sleep();
		//cat.bark();

		
	}

}
