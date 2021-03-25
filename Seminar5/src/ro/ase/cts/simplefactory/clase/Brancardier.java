package ro.ase.cts.simplefactory.clase;

public class Brancardier extends PersonalSpital {

	public Brancardier(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}
}
