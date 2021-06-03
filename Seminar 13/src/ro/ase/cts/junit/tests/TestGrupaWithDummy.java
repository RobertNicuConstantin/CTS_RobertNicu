package ro.ase.cts.junit.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.dubluri.DummyStudent;
import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.clase.IStudent;

public class TestGrupaWithDummy {

	@Test
	public void testAdaugaStudent() {
		IStudent student= new DummyStudent();
		Grupa grupa= new Grupa(1083);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getStudenti().size());
	}
	
}
