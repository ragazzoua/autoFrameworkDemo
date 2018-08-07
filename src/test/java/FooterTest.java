import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.close;

public class FooterTest {

    @BeforeClass
    public void setUp() {
        /*WebDriverRunner.setWebDriver(initChromeDriver());*/
        Configuration.browser = "chrome";
        ChromeDriverManager.getInstance().setup();

    }

    @Test
    public void checkFooter() {
        new MainPage().openMainPage("https://www.ukad-group.com/") //open page
                .checkFooterVisible();
    }

    @AfterClass
    public void tearDown() {
        close();
    }
}
