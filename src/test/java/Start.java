import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void test() {

        wd = new ChromeDriver();
        wd.get("https://demoqa.com/");
    }


}
