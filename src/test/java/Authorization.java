import constant.Constants;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization extends Constants {

    WebDriver driver = new ChromeDriver();
    Constants getConstants = new Constants();

    private By inputEmail = By.xpath("//div[@class='form_auth_style']//input[@name='auth_email']");
    private By inputPassword = By.xpath("//div[@class='form_auth_style']//input[@name='auth_pass']");
    private By btnJoin = By.xpath("//div[@class='form_auth_style']//button[@name='form_auth_submit']");



    @Test
    public void authorization(){

        driver.get(getConstants.getUrl);
        driver.manage().window().maximize();
        driver.findElement(inputEmail).sendKeys(getConstants.login);
        driver.findElement(inputPassword).sendKeys(getConstants.password);
        driver.findElement(btnJoin).click();

    }

}
