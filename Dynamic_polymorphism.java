import java.util.Scanner;

class Animal {
	public void cry() {
		System.out.println("Animal is crying");
	}
}

class Cat extends Animal {
	public void cry() {
		System.out.println("Cat is crying MEEOOWW");
	}
}

class Dog extends Animal {
	public void cry() {
		System.out.println("Dog is barking WOOF WOOF");
	}
}

public class test {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);

		Animal animal;

		System.out.print("1) For a DOG\n2) For a CAT\nEnter your choice : ");
		choice = sc.nextInt();
		if(choice == 1)
			animal = new Dog();
		else if(choice == 2)
			animal = new Cat();
		else
			animal = new Animal();

		animal.cry();
	}
}

/*
1) For a DOG
2) For a CAT
Enter your choice : 1
Dog is barking WOOF WOOF
*/
