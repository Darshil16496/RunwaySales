package com.practice;

import org.testng.annotations.Test;

public class DeleteOrgTest {
	@Test(groups = "regression")
	public void deleteOrg() {
		System.out.println("Organization is Deleted");
	}
	
	@Test(groups = "smoke")
	public void deleteOrgMultiple() {
		System.out.println("Multiple Organization Deleted");
	}
	
	public void deleteOrgById() {
		System.out.println("Multiple Organization Deleted");
	}
	
	public void deleteOrgById1() {
		System.out.println("Multiple Organization Deleted");
	}
}
