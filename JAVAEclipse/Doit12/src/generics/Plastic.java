package generics;

public class Plastic extends Material {

	public String toString() {
		return "the material is Plastic.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Printing by Plastic.");
	}
}
