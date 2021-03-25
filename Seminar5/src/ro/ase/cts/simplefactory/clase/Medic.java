package ro.ase.cts.simplefactory.clase;

public class Medic extends PersonalSpital {

	public Medic(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic []");
		return builder.toString();
	}

	
}
