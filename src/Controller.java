import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Controller {

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


    
    
}
