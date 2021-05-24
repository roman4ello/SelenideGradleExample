import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideExampleMain {
    public static void main(String[] args) throws InterruptedException {
        Configuration.browser = Browsers.CHROME;
        open("https://www.youtube.com/");
        Thread.sleep(10_000);
        Selenide.element(By.cssSelector("input#search")).setValue("There Once Was a Dog ukraine").submit();

        $("div[id='title-wrapper']").click();
        Thread.sleep(60_000);
    }
}
