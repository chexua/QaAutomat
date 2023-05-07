package TestNGen1;

import Dz7.Dz7;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class Task5 {
    //Task5:
    //Открыть сайт http://only-testing-blog.blogspot.com/2014/01/textbox.html?.
    // Написать тест, проверяющий содержит ли модальное окно, которое появляется
    // после нажатия на кнопку “Show Me Alert”необходимый текст.
    //После написания всех тестов нужно создать отдельно файл testngHomework.xml
    // после запуска которого все ваши вышенаписанные тесты будут запускаться и проходить.

    @Test
    public void Test5showAlert(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");

        Dz7 ModCl = new Dz7(driver);
        Actions actions1 = new Actions(driver);
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        WebElement alert = driver.findElement(By.xpath("//input[@onclick='myFunction1()']"));
        actions1.moveToElement(alert).click().perform();
        ModCl.waitForAlertAndSwitchToIt();
        Alert alerts = driver.switchTo().alert();
        System.out.println(alerts.getText());
        assertEquals(alerts.getText(),"Hi.. This is alert message!");
        alerts.accept();
        driver.quit();

    }
}
