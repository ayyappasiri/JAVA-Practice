/**
 * Created by i81113 on 9/12/2016.
 */

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {
    ChromeDriver driver;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("www.google.com");

    }

        @Test
        public void firefoxTest(){

            //check title
            Assert.assertEquals("Title check failed!", "Teknosa Alışveriş Sitesi - Herkes İçin");

            driver.close();
            driver.quit();
        }
}
