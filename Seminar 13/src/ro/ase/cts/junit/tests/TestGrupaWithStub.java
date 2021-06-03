package ro.ase.cts.junit.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.clase.dubluri.StubStudent;
import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.clase.IStudent;

public class TestGrupaWithStub {

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa=new Grupa(1045);
		IStudent student=new StubStudent();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	

}