package Dz3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dz3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.jetbrains.com/idea/download/#section=windows");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[1]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/span/a")).click();
        Thread.sleep(5000L);
        driver.quit();

        // номер 1
        //Найти как можно кликнуть на кнопку "Вход" элемент используя 4
        //различных локатора(Это могут быть и 4 варианта xpath, нужно чтобы они отличались)
        //By.xpath("//html/body/div[2]/div[2]/div/div[1]/div/div/div[2]/div[4]/div/div/a/span").findElement(driver).click();
        //driver.findElement(By.className("userbar__button-text")).click();
        //driver.findElement(By.linkText("Вхо")).click();
        //driver.findElement(By.partialLinkText("Вход")).click();


        // номер 2
        //Найти элемент "Каталог", а при помощи него найти путь к элементу
        //"Собаки/кошки общее" используя xpath.
        //driver.findElement(By.xpath("/html/body/div[2]/footer/div/div/div/div[2]/div/div/ul/li[3]/a"));


        // номер 3
        //Найти данный элемент по тексту "IT специальностям"
        //driver.findElement(By.linkText("IT специальностям")).click();


        // номер 4
        //Найти путь к данному элементу
        //span[text()='Аквариумы']
        //<span class="productsMenu-submenu-t">Аквариумы</span>


        // номер 5
        //Найти путь к данному элементу не используя текст
        //driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/div[2]/div/div/div[1]/div/span"));



        // номер 6
        //Найти локатор данного элемента не используя текст
        //driver.findElement(By.xpath("/html/body/main/section[3]/div/h2"));



        // номер 7
        //найти 10 элементов на странице, для нахождения которых можно использовать
        //только айди и с которыми можно взаимодействовать. (Кликнуть, ввести текст и т.д.)
        //driver.findElement(By.id("search2")).click();
        //driver.findElement(By.id("learntocode_searchbtn")).click();
        //driver.findElement(By.id("nav_search_btn")).click();
        //driver.findElement(By.id("cert_navbtn")).click();
        //driver.findElement(By.id("navbtn_menu")).click();
        //driver.findElement(By.id("w3loginbtn")).click();
        //driver.findElement(By.id("signupbtn_topnav")).click();
        //driver.findElement(By.id("sectionxs_tutorials")).click();
        //driver.findElement(By.id("sectionxs_references")).click();
        //driver.findElement(By.id("sectionxs_exercises")).click();



        // номер 8
        //Отыскать один элемент на основе другого.
        //Для нахождения первого элемента можете использовать любые методы и локаторы,
        //для прописывания дальнейшего поиска второго элемента не использовать текст.
        //driver.findElement(By.xpath("//*[@id="academy_page"]/main/section[2]/div/div/div[5]/a/h3")).click();
        //driver.findElement(By.xpath("//*[@id="academy_page"]/main/section[2]/div/div/div[1]/a/h3[1]")).click();


        // номер 9
        //Найти данный элемент не используя текст. Используя только имя класса.
        //driver.findElement(By.className("wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary"));


        // номер 10
        //найти локаторы к двум данным кнопкам.
        //Пользоваться любыми локаторами и методами.
        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[1]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/span/a")).click();


    }
}
