package Dz4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Dz4x1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));

        //1)
        //Написать программу, которая будет открывать пять различных страниц в новых окнах:
        //    https://uhomki.com.ua/
        //    https://zoo.kiev.ua/
        //    https://www.w3schools.com/
        //    https://taxi838.ua/ru/dnepr/
        //    https://klopotenko.com/
        //
        //Прописать цикл, который будет переключаться поочередно через все страницы,
        //для каждой страницы выводить в консоль название и ссылку на эту страницу.
        //И будет закрывать ту страницу в названии которой есть слово зоопарк.


        driver.navigate().to("https://uhomki.com.ua/");
        Set<String> setFirst = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setSecond = driver.getWindowHandles();
        setSecond.removeAll(setFirst);
        String finalDesc = setSecond.iterator().next();
        driver.switchTo().window(finalDesc);
        driver.get("https://zoo.kiev.ua/");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setThird = driver.getWindowHandles();
        setThird.removeAll(setFirst);
        setThird.removeAll(setSecond);
        String finalDesc1 = setThird.iterator().next();
        driver.switchTo().window(finalDesc1);
        driver.get("https://www.w3schools.com/");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setFour = driver.getWindowHandles();
        setFour.removeAll(setFirst);
        setFour.removeAll(setSecond);
        setFour.removeAll(setThird);
        String finalDesc2 = setFour.iterator().next();
        driver.switchTo().window(finalDesc2);
        driver.get("https://taxi838.ua/ru/dnepr/");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setFive = driver.getWindowHandles();
        setFive.removeAll(setFirst);
        setFive.removeAll(setSecond);
        setFive.removeAll(setThird);
        setFive.removeAll(setFour);
        String finalDesc3 = setFive.iterator().next();
        driver.switchTo().window(finalDesc3);
        driver.get("https://klopotenko.com/");
        driver.quit();



    }
}
