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
		System.out.println("Page Title is: "+actual);
		String expected = "Google";
		Assert.assertTrue(actual.equals(expected));
	}
	@Test
	public void taskThree() throws Exception {
		String actual = page.url();
		System.out.println("Current URL is: "+actual);
		pattern = Pattern.compile(actual,pattern.CASE_INSENSITIVE);
		Assert.assertTrue(pattern.matcher(actual).find());
	}
}
