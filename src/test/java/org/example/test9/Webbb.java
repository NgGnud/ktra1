package org.example.test9;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webbb {
    private WebDriver driver;
    @BeforeEach
    void setUp() {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    void Test() throws InterruptedException {
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(500);
        driver.findElements(By.xpath("//*[@id=\"myPage\"]/header/div[2]/div/div[2]/div[2]/div[2]/a")).get(0).click();
        Thread.sleep(500);
        driver.findElements(By.xpath("//*[@id=\"ModalLogin\"]/div/div/div/div[1]/div[3]/a[1]")).get(0).click();
        Thread.sleep(500);
        driver.findElements(By.xpath("//*[@id=\"name\"]")).get(0).sendKeys("dungdz");
        Thread.sleep(500);
        driver.findElements(By.xpath("//*[@id=\"phone\"]")).get(0).sendKeys("01122445533");
        Thread.sleep(500);
        driver.findElements(By.xpath("//*[@id=\"email\"]")).get(0).sendKeys("dungdz@gmail.com");
        Thread.sleep(500);
        driver.findElements(By.xpath("//*[@id=\"pass-regis\"]")).get(0).sendKeys("dungdz");
        Thread.sleep(500);
        driver.findElements(By.xpath("//*[@id=\"pass-confirm\"]")).get(0).sendKeys("dungdz");
        Thread.sleep(500);
        driver.findElements(By.xpath("//*[@id=\"register-btn\"]")).get(0).click();
        Thread.sleep(500);
    }
}
