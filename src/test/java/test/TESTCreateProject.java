package test;

import java.io.IOException;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMCreateProject1;

public class TESTCreateProject extends BaseTest{
	@Test
	public void projectCreation() throws IOException {
		POMCreateProject1 project = new POMCreateProject1(driver);
		project.createProject();
	}

}
