package pom.tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.pag.home;
import pom.pag.regis;

import java.util.concurrent.TimeUnit;

public class usertes {

    WebDriver driver;
    String expectedResult = null;
    String actualResult = null;
    home objhome;
    regis objregis;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver1.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.magneto365.com/es/empleos/choucair");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }


    @Test(priority = 0)
    public void home(){
        objhome = new home(driver);
        objhome.settxtbus("medellin");
    }
}
