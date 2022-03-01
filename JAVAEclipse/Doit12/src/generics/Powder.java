package generics;

public class Powder extends Material {

	public String toString() {
		return "the material is Powder.";
	}
	
	@Override
	public void doPrinting() {
		System.out.println("Printing by Powder.");
	}
}
