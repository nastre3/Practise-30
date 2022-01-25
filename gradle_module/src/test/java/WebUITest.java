import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class WebUITest {

    private WebDriver webDriver;

    @Before
    public void setup() {
        // WebDriverManager.chromedriver().setup();
        // webDriver = new ChromeDriver();
    }

    @Test
    public void webTest() {
        // webDriver.navigate().to("https://www.google.com/");
    }

    @After
    public void tearDown() {
        // webDriver.close();
    }
}