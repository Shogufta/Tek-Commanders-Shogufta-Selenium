package tekSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class oprningBrowser {
    public static void main(String[] args) {

        ChromeDriver d = new ChromeDriver();

        d.get("https://www.facebook.com/");

        //Closing browser

        d.quit(); //closing browser
        d.close(); ///closing 1 tab



    }
}
