package todo1;

public class Main {

	public static void main(String[] args) {
		
		Anjing Bravo = new Anjing("Bravo", "Golden Retriever", 1, 29);
		Anjing Oscar = new Anjing("Oscar", "German Shepherd", 3, 30);
		Anjing Romeo = new Anjing("Romeo", "Beagle", 2, 12);
		Anjing Juliet = new Anjing("Juliet", "Poodle", 1, 20);
		
		Bravo.info();
		Bravo.bark();
		System.out.println();
		
		Oscar.info();
		Oscar.makan();
		System.out.println();
		
		Romeo.info();
		Romeo.jalan();
		System.out.println();
		
		Juliet.info();
		Juliet.jalan();
		
	}

}
