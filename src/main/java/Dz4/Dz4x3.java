package Dz4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dz4x3 {
    //3)
    //Написать метод который выводит сообщение об айди элемента,
    //значении тэга элемента , значении класса элемента,
    //значении атрибута name элемента, текста данного элемента,
    //а также о координатах центра контейнера данного элемента.
    //Создать свой тип исключений, который будет вызываться если у элемента
    //нет определенного атрибута и на экран будет выводиться сообщение об отсутствии данного атрибута.

        public static void metBez (WebElement elem) throws AllMetod {
            int centW = elem.getSize().width / 2;
            int centH = elem.getSize().height / 2;
            System.out.println("координаты центра контейнера " + centW + " : " + centH);

            try {
                if (elem.getAttribute("id") == null) {
                    throw new AllMetod.BezID();
                } else {
                    System.out.println("значение атрибута ID элемента: " + elem.getAttribute("id"));
                }
                if (elem.getTagName() == null) {
                    throw new AllMetod.BezTagName();
                } else {
                    System.out.println("значение атрибута Тэг элемента: " + elem.getTagName());
                }
                if (elem.getAttribute("class") == null) {
                    throw new AllMetod.BezClass();
                } else {
                    System.out.println("значение атрибута Класс элемента: " + elem.getAttribute("class"));
                }
                if (elem.getAttribute("name") == null) {
                    throw new AllMetod.BezName();
                } else {
                    System.out.println("значение атрибута Имя элемента: " + elem.getAttribute("name"));
                }
                if (elem.getText() == null) {
                    throw new AllMetod.BezText();
                } else {
                    System.out.println("значение атрибута Текст элемента: " + elem.getText());
                }
            } catch (AllMetod.BezID a) {
                System.out.println(a.getMEssege());
            } catch (AllMetod.BezTagName a) {
                System.out.println(a.getMEssege());
            } catch (AllMetod.BezClass a) {
                System.out.println(a.getMEssege());
            } catch (AllMetod.BezName a) {
                System.out.println(a.getMEssege());
            } catch (AllMetod.BezText a) {
                System.out.println(a.getMEssege());
            }

        }
    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://uhomki.com.ua/");

        try {
            metBez(driver.findElement(By.xpath("//input[@class='search__input']")));
        } catch (AllMetod ex) {
            System.out.println(ex.getMessage());
        }
        driver.quit();
    }

    }













