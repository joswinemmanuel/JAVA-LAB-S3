interface Prey {
	public void flee();
}

interface Predator {
	public void hunt();
}

class Lion implements Predator {
	public void hunt() {
		System.out.println("Lion is hunting");
	}
}

class Deer implements Prey {
	public void flee() {
		System.out.println("Deer is fleeing");
	}
}

class Fish implements Prey, Predator {
	 public void hunt() {
		 System.out.println("Fish is hunting smaller fishes");
	 }
	 
	 public void flee() {
		 System.out.println("Fish in fleeing from larger fishes");
	 }
}

public class test  {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.hunt();
		
		Deer deer = new Deer();
		deer.flee();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
	}
}

/*
Lion is hunting
Deer is fleeing
Fish is hunting smaller fishes
Fish in fleeing from larger fishes
*/
