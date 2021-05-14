package exercises;

public class Smurf {

	private String name;
	private static Smurf papa;

	public static Smurf createSmurf(String name) {
		if (name == "papa") {
			if (Smurf.papa== null) {
				Smurf.papa = new Smurf(name);
			}
			return Smurf.papa;
		}
		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
