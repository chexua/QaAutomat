package TestNGen2;
//Написать тест, который будет проверять поисковую строку сайта https://www.foxtrot.com.ua/
//Использовать в качестве проверочных слов три следующих слова:
//“машина”, “input”, “смысл”.

import Dz7.Dz7;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class Task4 {
    WebDriver driver;
    @Test(dataProvider = "search")
    public void searchTest(String searchParams, String rezultat) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://www.foxtrot.com.ua/");
        driver.manage().window().maximize();
        Dz7 waiters = new Dz7(driver);

        WebElement element = waiters.waitPresenceOfElementReturn(By.xpath("//a[@class='button user-confirm-location-button']"));
        element.click();
        WebElement element1 = waiters.waitVisibilityOfElementLocatedReturn(By.xpath("//input[@type='search']"));
        element1.sendKeys(searchParams);
        element1.sendKeys(Keys.ENTER);

        WebElement resultLine = waiters.waitPresenceOfElementReturn(By.xpath("//h1[text()]"));

        if (resultLine.getText().contains("Знайдено по запиту")){
            String resultSearch=resultLine.getText().replace("Знайдено по запиту «","").replace("»","");
            assertEquals(resultSearch,rezultat);
        }else if (resultLine.getText().contains("Результати пошуку")){
            String resultSearch= driver.findElement
                    (By.xpath("//div[@class='search-page__box-title']/label")).getText().replace("«","").replace("»","");
            assertEquals(resultSearch,rezultat);
        }
    }


    @DataProvider(name = "search")
    public Object[][] searchObj() {
        return new Object[][]{
                {"машина","машина"}, {"input","input"}, {"смысл","смысл"}
        };
    }
}

