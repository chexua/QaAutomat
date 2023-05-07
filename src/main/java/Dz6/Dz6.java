package Dz6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Dz6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Необходимо автоматизировать сценарий, который показан на видео “Сценарий для автоматизации.mp4”.

        driver.get("https://www.google.com/search");
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        WebElement searchField = driver.findElement(By.xpath("//textarea[@type='search']"));
        searchField.sendKeys("https://www.guinnessworldrecords.com/account/register?");
        searchField.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='Create account | Guinness World Records']"));
        WebElement firstPage = driver.findElement(By.xpath("//h3[text()='Create account | Guinness World Records']"));
        Set<String> firstWindows = driver.getWindowHandles();
        actions.moveToElement(firstPage).keyDown(Keys.CONTROL).click(firstPage).keyUp(Keys.CONTROL).build().perform();
        Set<String> secondWindows = driver.getWindowHandles();
        secondWindows.removeAll(firstWindows);
        String secondWindowHandle = secondWindows.iterator().next();
        WebElement searchField2 = driver.findElement(By.xpath("//textarea[@type='search']"));
        searchField2.clear();
        searchField2.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        searchField2.sendKeys(Keys.ENTER);
        Set<String> firstWindowsUp = driver.getWindowHandles();
        WebElement secondPage = driver.findElement(By.xpath("//h3[text()='AlertsDemo - H Y R Tutorials']"));
        actions.moveToElement(secondPage).keyDown(Keys.CONTROL).click(secondPage).keyUp(Keys.CONTROL).build().perform();
        Set<String> secondWindowsUp = driver.getWindowHandles();
        secondWindowsUp.removeAll(firstWindowsUp);
        String thirdWindowHandle = secondWindowsUp.iterator().next();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        Thread.sleep(2000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
        WebElement lastname = driver.findElement(By.xpath("//input[@id='lname']"));
        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        fname.clear();
        fname.sendKeys("Dmitry");
        lastname.clear();
        lastname.sendKeys("Kovtunovych");
        submitBtn.click();
        Thread.sleep(2000);
        System.out.println(driver.findElements(By.xpath("//p")).get(1).getText());
        driver.switchTo().window(secondWindowHandle);
        driver.findElement(By.xpath("//input[@id='LastName']"));
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kovtunovych");
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Dmitry");
        driver.findElement(By.xpath("//input[@id='DateOfBirthDay']")).sendKeys("09");
        driver.findElement(By.xpath("//input[@id='DateOfBirthMonth']")).sendKeys("06");
        driver.findElement(By.xpath("//input[@id='DateOfBirthYear']")).sendKeys("1978");
        Select select1 = new Select(driver.findElement(By.xpath("//select[@id='Country']")));
        select1.selectByVisibleText("Ukraine");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='input-large create-application-name']"));
        WebElement countryField = driver.findElement
                (By.xpath("//input[@class='input-large create-application-name']"));
        countryField.sendKeys("Dnipro");
        driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys("mail@mail.ua");
        driver.findElement(By.xpath("//input[@id='ConfirmEmailAddress']")).sendKeys("mail@mail.ua");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("qa24ITstep");
        WebElement confirmPass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPass.sendKeys("itstepqa24");
        confirmPass.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[@for='ConfirmPassword']"));
        System.out.println(driver.findElement(By.xpath("//span[@for='ConfirmPassword']")).getText());
        driver.switchTo().window(thirdWindowHandle);
        driver.findElement(By.xpath("//button[@id='alertBox']"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        //Alert alert = driver.switchTo().alert();
        //alert.accept();
        Thread.sleep(2000);
        System.out.println("1-й алерт: "+driver.findElement(By.xpath("//div[@id='output']")).getText());
        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
        Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
        alert1.dismiss();
        System.out.println("2-ой алерт: "+driver.findElement(By.xpath("//div[@id='output']")).getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
        Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(2000);
        alert2.sendKeys("Final step of this task");
        alert2.accept();
        System.out.println("3-й алерт: "+driver.findElement(By.xpath("//div[@id='output']")).getText());
        Thread.sleep(2000);
        driver.quit();

     }

    }
