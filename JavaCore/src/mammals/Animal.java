package mammals;

public abstract class Animal {
	protected int age;
	private String species;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Animal(int age, String species) {
		super();
		this.age = age;
		this.species = species;
	}

	public abstract void display();

}
