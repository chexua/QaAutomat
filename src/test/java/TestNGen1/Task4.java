package TestNGen1;

import Dz7.Dz7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class Task4 {
    //Task4:
    //Открыть сайт https://www.guinnessworldrecords.com/Account/Login.
    //Написать тест, проверяющий что изначально чек-бокс “RememberMe” не выбран.
    //Потом кликнуть на него и реализовать проверку того, что он выбран.
    //После снова нажать на чек-бокс и проверить что он снова не выбран.
    @Test
    public void checkboxchoice() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        Dz7 met = new Dz7(driver);
        Actions actions = new Actions(driver);
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='RememberMe']"));
        met.waitElementSelectionStateTobe(checkbox, false);
        assertTrue(checkbox.isSelected() == false, "чек-бокс выбран");
        WebElement box = driver.findElement(By.xpath("//input[@id='RememberMe']"));
        box.click();
        met.waitElementSelectionStateTobe(checkbox, true);
        assertTrue(checkbox.isSelected() == true, "чек-бокс не выбран");
        box.click();
        met.waitElementSelectionStateTobe(checkbox, false);
        assertTrue(checkbox.isSelected() == false, "чек-бокс выбран");
        driver.quit();

    }
}
