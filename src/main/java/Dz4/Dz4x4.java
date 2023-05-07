package Dz4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dz4x4 extends Throwable {
    //4)
    //https://uhomki.com.ua/
    //Написать метод, который будет выводить в консоль тексты всех
    //элементов, которые можно найти по заданнму параметру.
    //Например при помощи него можно будет получить значения всех элементов
    //из списков заданных на "Рисунок 4.png" и "Рисунок 5.png".
    public static void metAllElem (WebDriver driver){

        for (WebElement elem1:
                driver.findElements(By.xpath("//div[text()='Каталог']/following-sibling::ul//a"))){
            System.out.println(elem1.getText());
        }
        for (WebElement elem2:
                driver.findElements(By.xpath("//div[@class='products-menu j-products-menu']//div/a"))){
            System.out.println(elem2.getText());}

    }
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://uhomki.com.ua/");
        metAllElem(driver);
        driver.quit();

    }



}
