package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("Animal is moving.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("Human is walking.");
	}
	
	public void readBook() {
		System.out.println("Human is reading.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("Tiger is running.");
	}
	
	public void hunting() {
		System.out.println("Tiger is hunting.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("Eagle is flying.");
	}
	
	public void catching() {
		System.out.println("Eagle is catching.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		/*
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		*/
	}
	
	public void moveAnimal ( Animal  animal ) {
		animal.move();
		if( animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		else if( animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else if( animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.catching();
		}
		else {
			System.out.println("Can not found the moving.");
		}
	}

}
