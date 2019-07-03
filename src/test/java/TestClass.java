import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestClass {

    @Before
    public void setUp() {
        Selenide.open("https://ru.selenide.org");
    }

    @Test
    public void someTest() {
        $(By.xpath("//div[@class='wrapper']//header//a//img")).click();

    }
}