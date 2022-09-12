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

        //wait
        //Declare and initialise a fluent wait
        FluentWait wait = new FluentWait(driver);
        
        driver.manage().window().maximize();
        // driver.manage().deleteAllCookies();

        //corap ten rengi
        // driver.get("https://www.a101.com.tr/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/?integration_colour=S%C4%B0YAH#");
        // System.out.println("giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah SAYFASI ACILDI");
        controller.GetStart(driver);


        //close cerez kullanım uyarısı
        // driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
        controller.CloseCookieAlert(driver);


        //siyah oldugunu dpğrula
        // driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a/img")).click();
        // System.out.println("SİYAH DOĞRULANDI");
        controller.CheckBlack(driver);


        //sepete ekle butonuna tıklanır
        // driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button")).click();
        // System.out.println("SEPETe EKLE BUTON TIKLANDI");
        controller.AddToBasket(driver);

       //Specify the timout of the wait      
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
       //System.out.println("BEkle");
       Bekle(driver);
       



        //Sepet iGörüntüler Butonuna Tıklanır
        // driver.findElement(By.xpath("//*[@id='js-modal-basket']/div[3]/a[3]")).click();  
        // System.out.println("SEPETI GÖRÜNTÜLE TIKLANDI");
        controller.GoToBasket(driver);
        Bekle(driver);

        //Sepeti Onayla Butonuna Tıklanır
        // driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a")).click();  
        // System.out.println("SEPETI ONAYLA TIKLANDI");
        controller.AcceptToBasket(driver);
        Bekle(driver);

        //Uye Olmadan devam et Butonuna tıklanır
        // driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a")).click();  
        // System.out.println("UYEOLMADAN DEVAM ET TIKLNADI");
        controller.ContuniewithoutSignIn(driver);
        Bekle(driver);

        //eposta set et ve devam et e tıkla
        // String  email="jsp10356@xcoxc.com";
        // driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input")).sendKeys(email);
        // driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button")) .click();  // Devam Et Tıkla
        controller.SetToMail(driver);
        Bekle(driver);

        //Adres olusturma

        driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a")).click();  //Yeni adres olustur butonuna tıklıyoruz
        //Adres Başlığı
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[2]/div/div/label/input")).sendKeys("Test Adres Başlık");
        //İsim Giriyoruz
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[3]/div[1]/div/label/input")).sendKeys("Test İsim");
        //Soyİsim Giriyoruz
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[3]/div[2]/div/label/input")).sendKeys("Test Soyİsim");
        //Telefon Giriyoruz
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[4]/div/div/label/input")).sendKeys("111-111-1111");
        //İl Giriyoruz
        // driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[5]/div[1]/div/label/div/select")).sendKeys("İSTANBUL");
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[2]")).click();
        Bekle(driver);
        //İlçe Giriyoruz
        //driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[5]/div[2]/div/label/div/select")).sendKeys("ADALAR");
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[2]")).click();
        Bekle(driver);
        //Mahalle Giriyoruz
        //driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[6]/label/div/select")).sendKeys("NIZAM MAH");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[6]/label/div/select/option[2]")).click();



        //Burda sıkıntı war mahalleyi alamıyoruz BAKILACAKKKK:!!!!!!!!!!!!  thread ile cozduk devam eilecek
        
        // Select objSelect = new Select(driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[6]/label/div/select")));
        // objSelect.getFirstSelectedOption();
        
        // objSelect.selectByValue("35388");
        // objSelect.sendKeys("BURGAZADA MAH");
        
        Bekle(driver);
        
        
        // //Adres Giriyoruz
        // driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[7]/label/textarea")).sendKeys("Test Adresidir");
        // //PostaKodu Giriyoruz
        // driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[8]/div/div/label/input")).sendKeys("11111");

        
        

        
    }

    //Bekleme Methodumuz
    public static void Bekle(WebDriver driver){

        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        System.out.println("BEkle");

    }


    
}
