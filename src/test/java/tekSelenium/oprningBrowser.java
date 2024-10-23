package tekSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class oprningBrowser {

    // Trying to click on sign in button in retail app
    public static void main(String[] args) {

        ChromeDriver d = new ChromeDriver();

        d.get("https://www.facebook.com/");

        d.manage().window().maximize();

        String pageTitle = d.getTitle(); // Get application meta data title

        System.out.println(pageTitle);

        //Closing browser

      //  d.quit(); //closing browser
    //    d.close(); ///closing 1 tab



    }
}
