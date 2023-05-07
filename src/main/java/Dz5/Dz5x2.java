package Dz5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Dz5x2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2) http://www.ashortjourney.com/
        //Написать программу, которая будет автоматизировать сценарий показанный на видео "Сценарий для автоматизии.mp4".

        Actions actions = new Actions(driver);
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(7000);
        //1
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-sound']"))).
                release().build().perform();
        Thread.sleep(5000);
        //2
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-sound']")))
                .release().build().perform();
        Thread.sleep(5000);
        //3
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-sound']")))
                .release().build().perform();
        Thread.sleep(5000);
        //4
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-credits']")))
                .release().build().perform();
        Thread.sleep(5000);
        //5
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-credits']")))
                .release().build().perform();
        Thread.sleep(5000);
        //6
        actions.moveToElement(driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//li[@id='ui-sound']")))
                .release().build().perform();
        Thread.sleep(5000);
        //7
        WebElement roundbig = driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"));
        WebElement sound = driver.findElement(By.xpath("//*[local-name() = 'circle'][1]"));

        actions.moveToElement(roundbig).clickAndHold().moveToElement(sound,600,100).
                release().build().perform();
        Thread.sleep(5000);

        driver.findElements(By.xpath("//div[@id='postcard-back-content']/textarea"))
                .get(0).sendKeys("                             Слава Україні!!!");
        Thread.sleep(5000);
        driver.quit();

    }

    }
