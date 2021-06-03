package ro.ase.cts.junit.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.TesteNormaleCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@SuiteClasses({ TestGrupa.class, TestGrupaCuFixture.class, TestGrupaWithDummy.class, TestGrupaWithFake.class,
		TestGrupaWithStub.class })
//@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory({TesteUrgenteCategory.class, TesteNormaleCategory.class})
public class SuitaCustom {

}