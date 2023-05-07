package Dz5;

import com.beust.jcommander.JCommander;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.Keys.DOWN;

public class Dz5x1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1) http://only-testing-blog.blogspot.com/2014/01/textbox.html?
        //Написать программу реализующую действие показанное на "видео1.mp4".
        //После выполнения программы на консоли должна выводится информация в следующем виде:
        //
        //Автомобили доступные для выбора:
        //Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
        //Страны из первой таблицы:
        //USA, Russia, Japan, Mexico, India, Malaysia, Greece.
        //Страны из второй таблицы:
        //France, Germany, Italy, Spain.

        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");

        WebElement carElement = driver.findElement(By.id("Carlist"));
        carElement.click();
        carElement.sendKeys(DOWN);
        carElement.sendKeys(DOWN);
        carElement.sendKeys(DOWN);
        carElement.sendKeys(DOWN);
        carElement.sendKeys(DOWN);

        WebElement carElement2 = driver.findElement(By.id("car6"));
        carElement2.click();

        WebElement countryElement = driver.findElement(By.xpath("//select[@name='FromLB']"));
        Select countySelect = new Select(countryElement);
        countySelect.selectByIndex(2);
        countySelect.selectByValue("India");
        countySelect.deselectByValue("India");
        countySelect.selectByValue("Germany");
        countySelect.selectByValue("Italy");
        countySelect.selectByValue("Malaysia");
        countySelect.deselectByValue("Malaysia");
        countySelect.selectByValue("Spain");
        WebElement addElement = driver.findElement(By.xpath("//input[@value='->']"));
        addElement.click();

        System.out.println("Автомобили доступные для выбора:");
        Select carSelect = new Select(carElement);
        List<WebElement> cars = carSelect.getOptions();
        for (WebElement car : cars) {
            System.out.print(car.getText() + " ");
        }

        System.out.println("\nСтраны из 1-ой таблицы: \n");
        List<WebElement> countries = countySelect.getOptions();
        for (WebElement cont : countries) {
            System.out.print(cont.getText() + " ");
        }

        System.out.println("\nСтраны из 2-ой таблицы: \n");
        WebElement coutryElem2 = driver.findElement(By.xpath("//select[@name='ToLB']"));
        Select elemSelect = new Select(coutryElem2);
        List<WebElement> coutries2 = elemSelect.getOptions();
        for (WebElement cont2 : coutries2) {
            System.out.print(cont2.getText() + " ");
        }
        driver.quit();
    }
}




