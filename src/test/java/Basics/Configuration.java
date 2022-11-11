package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Configuration {
    public static void main(String[] args) {
        //Create a playwrite session
        Playwright playwright = Playwright.create();

        //set the launching options for launching browser
        LaunchOptions launchOptions = new LaunchOptions();
        launchOptions.setChannel("chrome");
        launchOptions.setHeadless(false);
        Browser browser = playwright.chromium().launch(launchOptions);

        //Creating a page and go to the link
        Page page = browser.newPage();
        page.navigate("https://playwright.dev/");

        System.out.println(page.title());
        System.out.println(page.url());

        //close the browser
        browser.close();

        //close the playwrite session
        playwright.close();
    }
}
