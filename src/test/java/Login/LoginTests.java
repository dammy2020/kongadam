package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;

public class LoginTests {

    private WebDriver driver;



    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);

//1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.findElement(By.linkText("Login / Signup")).click();
        driver.findElement(By.id("username")).sendKeys("akandedamilola20@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dami2019");
        driver.findElement(By.xpath("//*[@class=\"_0a08a_3czMG _988cf_1aDdJ\"]")).click();
        //driver.findElement(By.cssSelector("a[href=\"/content/stay-home-essentials\"]")).click();
        //driver.findElement(By.xpath("//a[@href='/content/stay-home-essentials']")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/content/stay-home-essentials']")));
        Thread.sleep(8000);
        driver.findElement(By.xpath("//a[@href='/content/stay-home-essentials']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//a[@href='https://www.konga.com/category/beverages-582']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//a[@href='/product/nescafe-breakfast-3-in-1-10-sachet-3893185']")).click();
        Thread.sleep(8000);
        driver.findElements(By.xpath("//button[@class=\"_0a08a_3czMG _6d187_pzjfk\"]")).get(1).click();
        Thread.sleep(8000);
        driver.navigate().to("https://www.konga.com/checkout/complete-order");


    }

    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }

}
