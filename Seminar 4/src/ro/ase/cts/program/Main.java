package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;
import ro.ase.cts.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
		BrokerTranzactie broker2 = BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		BrokerTranzactieLazy lazy1= BrokerTranzactieLazy.getInstance("ana", 2, 30);
		BrokerTranzactieLazy lazy2= BrokerTranzactieLazy.getInstance("anamaria", 1, 30);
		System.out.println(lazy1.toString());
		System.out.println(lazy2.toString());
		
		
		Restaurant r1= Restaurant.getInstance("Belvedere", 50, 10.5);
		Restaurant r2= Restaurant.getInstance("Del Ponte", 40, 8.5);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
