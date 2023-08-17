package com.practice;

import org.testng.annotations.Test;

public class createOrgTest {
	@Test(groups = "smoke")
	public void createOrg() {
		System.out.println("Organization is Created");
	}
	
	public void createOrgTwo() {
		System.out.println("Second Organization is Created");
	}

	public void createMultipleOrg() {
		System.out.println("You can create multiple org");
	}
}
