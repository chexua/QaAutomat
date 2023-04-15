import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ls0 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/itm/123909050971?_trkparms=pageci%3A45cb56ba-d776-11ed-ac11-e23440c9edfc%7Cparentrq%3A6a319e791870acb157634b49ffffb2b0%7Ciid%3A1");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        driver.findElement(By.xpath("//*[@class=\"ux-call-to-action__text\"]")).click();
        //System.out.println(driver.findElement(By.linkText("Apply now")).getText());
        Thread.sleep(5000);
        driver.quit();

    }

}
