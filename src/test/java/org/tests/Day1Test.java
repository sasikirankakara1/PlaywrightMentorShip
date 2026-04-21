package org.tests;


import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import day1.Day1Task;

public class Day1Test extends Day1Task {
	
	@Test
	public void taskOne() throws Exception {
		System.out.println("Browser Launched Successfully");
	}
	@Test
	public void taskTwo() throws Exception {
		String actual = page.title();
//		System.out.println("Page Title is: "+actual);
		String expected = "Google";
//		Assert.assertTrue(actual.equals(expected));
		pattern = Pattern.compile(expected,pattern.CASE_INSENSITIVE);
		Assert.assertTrue(pattern.matcher(actual).find());
	}
	@Test
	public void taskThree() throws Exception {
		String actual = page.url();
		String exp ="https://www.google.com";
		System.out.println("Current URL is: "+actual);
		pattern = Pattern.compile(exp,pattern.CASE_INSENSITIVE);
		Assert.assertTrue(pattern.matcher(actual).find());
	}
	
	@Test
	public void testName() throws Exception {
		String actual = page.title();
		pattern = Pattern.compile("^google$",pattern.CASE_INSENSITIVE);
		Assert.assertTrue(pattern.matcher(actual).matches());
	}
	
	@Test
	public void testUrl() throws Exception {
		String actual = page.url();
		pattern = Pattern.compile("^https://(www\\.)?google\\.com(/.*)?$",pattern.CASE_INSENSITIVE);
		Assert.assertTrue(pattern.matcher(actual).matches());
	}
	@Test
	public void testNames() throws Exception {
		String actual = page.url();
		pattern = Pattern.compile("^https://(www\\.)?demoblaze\\.com(/.*)?$",pattern.CASE_INSENSITIVE);
		Assert.assertTrue(pattern.matcher(actual).matches());
	}
	
	@Test
	public void testNamess() throws Exception {
		String actual = page.url();
		pattern = Pattern.compile("^https://(www\\.)?demoblaze\\.com(/.*)?$",pattern.CASE_INSENSITIVE);
		Assert.assertTrue(pattern.matcher(actual).matches());
	}
}
