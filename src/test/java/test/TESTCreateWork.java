package test;

import java.io.IOException;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMCreateWork1;

public class TESTCreateWork extends BaseTest{
	@Test
	public void workCreation() throws IOException {
		
		POMCreateWork1 work = new POMCreateWork1(driver);
		work.createWork();
	}
}