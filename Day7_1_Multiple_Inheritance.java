abstract class Animal {
	protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
	}
	public abstract  void eat();
	public void walk () {
	    System.out.println("This animal walks on " + legs + " legs.");
	}
	
}

class Spider extends Animal {
	public Spider() {
		super(8);
	}
	public void eat () {
	    System.out.println("The spider eats a fire fly.");
	}
}

interface Pet {
    public String getName();
    public void setName (String n);
    public void play ();
}

class Cat extends Animal implements Pet {
	private String name;
	public Cat(String n) {
	    super(4);
	    name = n;
	}
	public Cat() {
	    this("");
	}
	public String getName() {
	    return name;
	}
	public void setName (String n) {
	    name = n;
	}
	public void play() {
	    System.out.println(name + " likes to play with string.");
	}
	public void eat() {
	    System.out.println("Cats like to eat spiders and mice.");
	}	
}

class Fish extends Animal implements Pet {
	private String name;
	public Fish() {
	    super(0);
	}
	public void setName (String name) {
	    this.name = name;
	}
	public String getName () {
	    return name;
	}
	public void play () {
	    System.out.println("Fish swim in their tanks all day.");
	}
	public void walk () {
	    super.walk();
	    System.out.println("Fish, of course, can't walk, they swim.");
	}
	public void eat () {
	    System.out.println("Fish eat pond scum.");
	}
}

class TestAnimals {
    public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Cat ();

        f.play();
        c.play();

        e.eat();
        e.walk();

        a.walk();
    }
}

/*
Fish swim in their tanks all day.
Fluffy likes to play with string.
Cats like to eat spiders and mice.
This animal walks on 4 legs.This animal walks on 0 legs.
Fish, of course, can't walk, they swim.
*/
