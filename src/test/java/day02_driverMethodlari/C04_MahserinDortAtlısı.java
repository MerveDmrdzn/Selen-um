package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class C04_MahserinDortAtlısı {
    public static void main(String[] args) {

        // 1 - driver için gerekli ayarlamaları yap
        System.setProperty("Webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        // 2 - webDriver obejesi oluştur
        WebDriver driver =new ChromeDriver();

        // 3 - window u max yap
        driver.manage().window().maximize();

        // 4 - gecikmeler için max planlama suresını olustur
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // bu dört ADIM her testin başında yapacağımız işlemler
    }
}
