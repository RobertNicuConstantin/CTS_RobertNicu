package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		
		ManagerSala managerSala = new ManagerSala("Sala Nr.3");
        Observer client1 = new Client("Alin");
        Observer client2 = new Client("Marius");
        Observer client3 = new Client("Ion");

        managerSala.adaugareAbonat(client1);
        managerSala.adaugareAbonat(client2);
        managerSala.adaugareAbonat(client3);

        managerSala.trimiteAnunt("Fotbal");
        managerSala.trimiteAnunt("Volei");
        managerSala.stergereAbonat(client3);
        managerSala.trimiteAnunt("Handbal");

	}

}
