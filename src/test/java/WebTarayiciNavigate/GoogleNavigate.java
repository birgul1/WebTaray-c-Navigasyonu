package WebTarayiciNavigate;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class GoogleNavigate extends TestBaseBeforeAfter {
    /*
    Google'a gidin.
    Selenium ile ilgili bir arama yapın.
    İlk sonuca tıklayın ve o siteye gidin.
    Başka bir siteye gidin.
    Bir önceki siteye geri dönün.
    Bir sonraki siteye ileri gidin.*/

    @Test
    public void Test() throws InterruptedException {

      driver.navigate().to("https://www.google.com");

      WebElement textbox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
      textbox.sendKeys("Selenium");
      textbox.sendKeys(Keys.ENTER);

      Thread.sleep(1000);
      driver.findElement(By.xpath("(//h3[text()='Selenium'])[1]")).click();

      Thread.sleep(1000);
      driver.navigate().to("https://www.amazon.com.tr/");

      Thread.sleep(1000);
      driver.navigate().back();

      Thread.sleep(1000);
      driver.navigate().forward();

    }
}
