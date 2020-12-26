import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Selenide.$;
public class Takotest {
    @Test
    public void TestChrome() throws InterruptedException {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.google.com");
        Thread.sleep(3000);
        $(".gLFyf").setValue("Tako").sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }
}
