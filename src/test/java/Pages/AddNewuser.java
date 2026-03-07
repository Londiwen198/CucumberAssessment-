package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddNewuser {

        WebDriver driver;

        @FindBy(id = "signup-toggle")
       WebElement SignupButtonId;

        @FindBy(id = "register-firstName")
        WebElement FullNameFieldId;


        @FindBy(id = "register-lastName")
        WebElement LastNameFieldId;

        @FindBy(id = "register-email")
        WebElement EmailFieldId;

        @FindBy(id = "register-password")
        WebElement PasswordFieldId;

        @FindBy(id = "register-confirmPassword")
        WebElement ConfirmPasswordFieldId;

        @FindBy(id = "register-group")
        WebElement GroupDropdownId;

        @FindBy(id = "register-submit")
        WebElement CreateaccountButtonId;




        public AddNewuser (WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this); // important!
        }

    public void SignUphere () {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SignupButtonId));
        SignupButtonId.click();
    }


        public void Fullnames(String Fullnames) {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FullNameFieldId));
            FullNameFieldId.sendKeys(Fullnames);


        }


    public void Surname(String Surname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LastNameFieldId));
        LastNameFieldId.sendKeys(Surname);
    }

        public void Emailadress(String email){
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(EmailFieldId));
            EmailFieldId.sendKeys(email);
        }

            public void Password (String password) {
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(PasswordFieldId));
                PasswordFieldId.sendKeys(password);

        }

    public void ConfirmPassword (String Repassword) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ConfirmPasswordFieldId));
        ConfirmPasswordFieldId.sendKeys(Repassword);
    }
    public void SelectGroup(String group) {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
        WebElement brandDropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("register-group"))
        );
        Select selectBrand = new Select(brandDropdown);
        selectBrand.selectByVisibleText(group);
    }



    public void CreateAccount () {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CreateaccountButtonId));
        CreateaccountButtonId.click();

    }


    }

