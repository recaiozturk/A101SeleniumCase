import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.google.common.annotations.VisibleForTesting;


public class App {


    public static void main(String[] args) throws Exception {

        Controller controller= new Controller();

        System.setProperty("webdriver.chrome.driver","C://Users//90531//Desktop//chromedriver.exe");

        ChromeOptions options  = new ChromeOptions();
        //options.addArguments("incognito");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = new ChromeDriver();     
        driver.manage().window().maximize();

        controller.GetStart(driver);

        controller.CloseCookieAlert(driver);

        controller.CheckBlack(driver);

        controller.AddToBasket(driver);
        WaitLittleBit(driver);

        controller.GoToBasket(driver);
        WaitLittleBit(driver);

        controller.AcceptToBasket(driver);
        WaitLittleBit(driver);

        controller.ContuniewithoutSignIn(driver);
        WaitLittleBit(driver);

        controller.SetToMail(driver);
        WaitLittleBit(driver);

        controller.SetAdress(driver);
        controller.WaitWithThread(1000);

        controller.ConfirmLastPage(driver);
        
    }

    //Bekleme Methodumuz
    public static void WaitLittleBit(WebDriver driver){
      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    }

}
