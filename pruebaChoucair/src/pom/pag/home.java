package pom.pag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home {

    WebDriver driver;
    By txtbus=By.name("search[search_query]");

    public home(WebDriver driver){
        this.driver=driver;
    }

    public void settxtbus(String settxtbus){
        driver.findElement(txtbus).sendKeys(settxtbus);
    }

    public String gethomeTitle(){
        return driver.getTitle();
    }
}
