package test;

import java.io.IOException;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMCreateCustomer1;

public class TESTCreateCustomer extends BaseTest{
	@Test
	public void customerCreation() throws IOException{
		
		POMCreateCustomer1 customer = new POMCreateCustomer1(driver);
		customer.createCustomer();
	}
}
