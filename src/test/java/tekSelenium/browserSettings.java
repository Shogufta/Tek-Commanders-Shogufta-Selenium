package tekSelenium;

import org.openqa.selenium.edge.EdgeDriver;

public class browserSettings {
    public static void main(String[] args) {

        EdgeDriver e = new EdgeDriver();

        e.get("https://www.google.com/chrome/");


        //Maximize Browser
        e.manage().window().maximize();


    }
}
