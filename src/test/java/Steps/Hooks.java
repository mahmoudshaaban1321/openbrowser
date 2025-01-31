package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {
    public static WebDriver driver;
@Before
    public void Setup(){
        driver=new EdgeDriver();

    }
@After
    public void quit()
    {
        driver.quit();
    }
    /* Module - Features - Scenarios - Steps
    Given (Pre condition)0Navigate to website
    And بتكمل (ممكن تكمل شروط)
    When خطوات بتعملها
    And بتكمل (ممكن تكمل خطوات)
    Then
     لازم كل خطوة تتكتب مستقلة توضح
     */
}