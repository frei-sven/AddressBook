package ch.bbw.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.addressbook.Address;

public class TestAddress {

	@Before
	public void setup() {
	}
	
	@Test
	public void test1() {
		assertTrue("Test Address",  1==1);
	}
	
	@Test
	public void test2() {
		Address adresse = new Address(1, "Sven", "Frei", "6988");
		
		assertTrue("Test Firstname", adresse.getFirstname().equals("Sven"));
	}

}
