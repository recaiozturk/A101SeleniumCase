import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Controller {

    int randomNumber;

    //Siparişi istenilen ürünün sayfasını açar
    public void GetStart(WebDriver driver){
      
        driver.get("https://www.a101.com.tr/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/?integration_colour=S%C4%B0YAH#");
        System.out.println("İSTENİLEN ÜRÜN SAYFASI ACILDI");
    }

    //Çerez Cookie uyarısnı kapatır
    public void CloseCookieAlert(WebDriver driver){

        driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
        System.out.println("COOKİE UYYARISI KAPATILDI");
    }

    //Ürünün siyah olduğunu doğrular
    public void CheckBlack(WebDriver driver){

        driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
        System.out.println("ÜRÜNÜN SİYAH OLDUĞU DOĞRULANDI");  
    }

    //Sepete Ekle Butonuna Tıklar
    public void AddToBasket(WebDriver driver){

        driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button")).click();
        System.out.println("ÜRÜN SEPETE EKLENDİ");  
    }


    //Sepeti Görüntüle Butonuna Tıklar
    public void GoToBasket(WebDriver driver){

        driver.findElement(By.xpath("//*[@id='js-modal-basket']/div[3]/a[3]")).click();  
        System.out.println("SEPET GÖRÜNTÜLENDİ");  
    }

    //Sepeti Onayla Butonuna Tıklar
    public void AcceptToBasket(WebDriver driver){

        driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a")).click();
        System.out.println("SEPET ONAYLANDI");  
    }

    //Üye Olmadan Devam Et Butonuna Tıklar
    public void ContuniewithoutSignIn(WebDriver driver){

        driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a")).click();  
        System.out.println("ÜYE OLMADAN DEVAM EDİLİYOR");  
    }

    //Eposta girilir ve devam et butonuna tıklanır
    public void SetToMail(WebDriver driver){

        String  email="jsp10356@xcoxc.com";
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input")).sendKeys(email);
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button")) .click(); 
        System.out.println("EPOSTA GİRİLDİ-DEVAM EDİLİYOR...");  
    }


    //Adres bilgilerini Giriyoruz
    public void SetAdress(WebDriver driver){

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
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[2]")).click();       
        //İlçe Giriyoruz
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[2]")).click();      
        //Mahalle Giriyoruz       
        WaitWithThread(1000);

        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[6]/label/div/select/option[2]")).click();
        //Açık Adres Giriyoruz
        randomNumber = GenerateRandomNumber(1000);
        
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[7]/label/textarea")).sendKeys("Test Adresidir"+randomNumber);
        //posta kodu giriyoruz
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/div[8]/div/div/label/input")).sendKeys("11111");
        WaitWithThread(1000);

        //Keydet butonuna tıklıyoruz
        driver.findElement(By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/button[1]")).click();     
        WaitWithThread(3000);

        //RadioButtonTıklıyoruz
        driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[2]/ul/li/label/div[2]/div")).click(); 
        WaitWithThread(3000);

        //Keydet ve Devam et Butonuno Tıklıyoruz
        driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
        WaitWithThread(1000);

        System.out.println("ADRES GİRİLİP KAYDEDİLDİ-DEVAM EDİLİYOR");  


    }

    public void ConfirmLastPage(WebDriver driver){

        String  confirmText =driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[5]/div/div[2]/b")).getText();

        WaitWithThread(1000);

        System.out.println( confirmText + "  yazısı teyit edildi");
        System.out.println("TEST BİTTİ");
    }

    //ThreadSleep ile bekleme
    public static void WaitWithThread(int  duration){

        try {
            Thread.sleep(duration);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }

    }

    //Timeout ile Bekleme
    public static void WaitLittleBit(WebDriver driver){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

    }

    //Rastgele sayı üretiyoruz
    private int GenerateRandomNumber(int size){
        Random rand = new Random(); 
        int upperbound = size;
        int int_random = rand.nextInt(upperbound);

        return int_random;
    }


    
    
}
