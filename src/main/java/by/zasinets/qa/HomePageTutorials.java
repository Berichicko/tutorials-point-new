package by.zasinets.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageTutorials {
    private final WebDriver driver;

    public HomePageTutorials(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getText() {
        return driver.findElement(By.xpath("//*[text()=\"Premium \"]")).getText().contains("Premium ");

    }

    public boolean getTitle() {
        return driver
                .getTitle().contains("Online Tutorials Library");
    }
}
