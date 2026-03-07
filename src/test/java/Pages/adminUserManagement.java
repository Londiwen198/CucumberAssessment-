package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class adminUserManagement {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='nav-user-section']")
    WebElement navLoginButtonXpath;
    @FindBy(id = "login-email")
    WebElement usernameFieldId;
    @FindBy(id = "login-password")
    WebElement passwordFieldId;
    @FindBy(id = "login-submit")
    WebElement loginButtonId;
    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/p")
    WebElement verifyLoginIsSuccessfullyXpath;

    @FindBy(xpath = "//div[@id='app-root']/nav/div/div[3]/div/button/span[3]")
    WebElement NavAdminButtonXpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[4]/span[2]")
    WebElement NavAdminpanelButtonXpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/nav/button[3]")
    WebElement NavApprovaltab;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/div/div/input")
    WebElement searchUserToApprove;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[3]/table/tbody/tr/td[6]/button[1]")
    WebElement ApproveUserButtonXpath;


    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/nav/button[2]")
    WebElement NavUsertab;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[1]/div[2]/input")
    WebElement SearchUsertopromoteXpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/select")
    WebElement clickuserroleDropdownXpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/div[2]/button")
    WebElement NavBacktoWebsiteButtonXpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]")
    WebElement LogoutButtonXpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/button[2]")
    WebElement deleteUserButtonXpath;


    public adminUserManagement(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNavLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(navLoginButtonXpath));
        navLoginButtonXpath.click();
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(usernameFieldId));
        usernameFieldId.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordFieldId.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButtonId.click();
    }

    public String getLoginSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyLoginIsSuccessfullyXpath));
        return verifyLoginIsSuccessfullyXpath.getText();

    }

    public String getAdminButtonText() {
        return NavAdminButtonXpath.getText();
    }

    public void login(String email, String password) {
        clickNavLoginButton();
        enterUsername(email);
        enterPassword(password);
        clickLoginButton();


    }

    public void clickadminButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(NavAdminButtonXpath));
        NavAdminButtonXpath.click();
    }


    public void ClickAdminpanel() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(NavAdminpanelButtonXpath));
        NavAdminpanelButtonXpath.click();


    }

    public void Aproveuser() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(NavApprovaltab));
        NavApprovaltab.click();


    }

    public void searchNewUser(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(searchUserToApprove));

        searchUserToApprove.clear();
        searchUserToApprove.sendKeys(email);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//td[text()='" + email + "']")
        ));
    }


    public void clickapprove() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ApproveUserButtonXpath));
        ApproveUserButtonXpath.click();

    }

    public void usermanagement() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(NavUsertab));
        NavUsertab.click();

    }


    public void searchUsertopromote(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(SearchUsertopromoteXpath));

        SearchUsertopromoteXpath.clear();
        SearchUsertopromoteXpath.sendKeys(email);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//td[text()='" + email + "']")
        ));
    }


    public void selectAdminRole() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clickuserroleDropdownXpath));
        clickuserroleDropdownXpath.click();
        WebElement adminOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='app-root']/div/div[3]/div/div[2]/table/tbody/tr/td[4]/select/option[@value='admin']")
        ));
        adminOption.click();
    }

    public void NavBacktowesite() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(NavBacktoWebsiteButtonXpath));
        NavBacktoWebsiteButtonXpath.click();
    }

    public void Logout() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LogoutButtonXpath));
        LogoutButtonXpath.click();
    }

    public void deleteUser(String email) {
        usermanagement();
        searchUsertopromote(email);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(deleteUserButtonXpath));
        deleteUserButtonXpath.click();
    }

}


