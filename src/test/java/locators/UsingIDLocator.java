package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {
    public static void main(String[] args) {

        ChromeDriver c = new ChromeDriver();

        c.get(" https://retail.tekschool-students.com/");

        c.manage().window().maximize();

        // step1 Locate the Element
        By signInLink = By.id("signinLink");

        // step2 Ask Selenium to find the Element
        WebElement signInElement = c.findElement(signInLink);

        //Step3 Perform the Action

        signInElement.click();



    }
}
