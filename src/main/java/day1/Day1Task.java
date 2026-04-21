package day1;

import java.util.regex.Pattern;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Day1Task {

	protected Playwright playwright;
	protected Browser browser;
	protected BrowserContext browserContext;
	protected Page page;
	protected Pattern pattern;
	@BeforeTest
	public void start() {
		playwright = Playwright.create();
		browser=playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		browserContext=browser.newContext();
		page = browserContext.newPage();
		page.navigate("https://www.demoblaze.com");
	}
	@AfterTest
	public void close() {
		page.pause();
	}
	
}
