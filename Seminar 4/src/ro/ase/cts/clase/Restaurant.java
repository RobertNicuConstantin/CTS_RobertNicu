package ro.ase.cts.clase;

public class Restaurant {
	private String name;
	private int mese;
	private double pretMeniu;
	
	private static  Restaurant restaurant =null;
	
	private Restaurant(String name, int mese, double meniuri) {
		super();
		this.name = name;
		this.mese = mese;
		this.pretMeniu = meniuri;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setMese(int mese) {
		this.mese = mese;
	}


	public void setMeniuri(double meniuri) {
		this.pretMeniu = meniuri;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Restaurant [name=");
		builder.append(name);
		builder.append(", mese=");
		builder.append(mese);
		builder.append(", pret meniu=");
		builder.append(pretMeniu);
		builder.append("]");
		return builder.toString();
	}
	
	
	public static synchronized Restaurant getInstance(String nume, int mese, double meniuri) {
		if(restaurant==null) {
			restaurant=new Restaurant(nume, mese, meniuri);
		}
		return restaurant;
	}
	
	

}
