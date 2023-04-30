package Dz4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dz4x2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));

        //2)
        //Написать метод в параметры которого принимаются два ВебЭлемента.
        //метод выводит в консоль информацию какой из двух элементов располагается  выше на странице,
        //какой из элементов располагается левее на странице,
        //а также какой из элементов занимает большую площадь.
        //Параметры метода могут также включать в себя другие аргументы, если это необходимо.

        driver.get("https://uhomki.com.ua/");

    }

}
