package TestNGen1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class Task1 {
    //Task1:
    //Открыть сайт https://dan-it.com.ua/uk/ . На этой странице открыть в новых вкладках ссылки
    // “Java”, “Quality Assurance (QA)”, “FrontEnd”.
    //Прописать тест, проверяющий количество открытых окон. Он должен проходить, если количество
    // открытых окон равно 4.

    @Test
    public void quantityOpenWind() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dan-it.com.ua/uk/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//h3[text()='Java']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//h3[text()='Quality Assurance (QA)']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//h3[text()='FrontEnd']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String> description = driver.getWindowHandles();
        assertTrue("Внимание! Количество окон меньше чем 4!!! ", description.size() == 4);
        driver.quit();

    }

}






