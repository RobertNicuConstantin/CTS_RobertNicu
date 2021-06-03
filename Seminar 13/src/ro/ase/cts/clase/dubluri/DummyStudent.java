package ro.ase.cts.clase.dubluri;

import java.util.List;

import ro.ase.cts.junit.clase.IStudent;

public class DummyStudent implements IStudent {

	// DUMMY MOCKUP 
	//- deoarece nu trebuie sa modificam metodele de mai jos 
	// (nu avem nevoie de ele)
	
	// deci e folosit doar cand nu se foloseste vreo metoda
	// pentru obiectul (studentul) extern
	
	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return false;
	}

	
}