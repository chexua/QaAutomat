package Dz3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dz3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // номер 1
        driver.get("https://uhomki.com.ua/ru/koshki/1074/");
        Thread.sleep(2000L);
        By.xpath("//html/body/div[2]/div[2]/div/div[1]/div/div/div[2]/div[4]/div/div/a/span").findElement(driver).click();
        Thread.sleep(5000L);
        driver.quit();

    }
}
