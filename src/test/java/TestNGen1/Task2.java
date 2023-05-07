package TestNGen1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Task2 {
    //Task2:
    //Открыть сайт https://uhomki.com.ua/ru/.  Проверить, что после нажатия кнопки “ Оплата и доставка”
    // открывается страница с нужной ссылкой.
    //А именно https://uhomki.com.ua/ru/oplata-i-dostavka/.

        @Test
        public void openList() throws InterruptedException{
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://uhomki.com.ua/ru/");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.xpath("//span[3]/a[text()='Оплата и доставка']"));
            element.click();
            System.out.println(driver.getCurrentUrl());
            String proverochnijURL = "https://uhomki.com.ua/ru/oplata-i-dostavka/";
            assertTrue(driver.getCurrentUrl().equals(proverochnijURL), "URL не соответствует желаемому https://uhomki.com.ua/ru/oplata-i-dostavka/");
            driver.quit();

        }
    }




