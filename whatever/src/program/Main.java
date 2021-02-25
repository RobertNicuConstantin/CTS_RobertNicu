package program;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		Giraffe giraffe = new Giraffe("girafa 1");
		Giraffe giraffe2 = new Giraffe("girafa 2");
		z.AddAnimal(giraffe);
		z.AddAnimal(giraffe2);
		
		z.feedAllAnimals();
	}

}
