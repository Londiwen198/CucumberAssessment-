package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteUser {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='nav-user-section']")
    WebElement loginButton;

    @FindBy(id = "login-email")
    WebElement emailField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton;

    @FindBy(xpath = "//*[@id='app-main-content']/section/div[1]/p")
    WebElement loginSuccessMessage;

    @FindBy(xpath = "//div[@id='app-root']/nav/div/div[3]/div/button/span[3]")
    WebElement adminButton;

    @FindBy(xpath ="//div[@id='app-root']/nav/div/div[3]/div/div/button[4]/span[2]")
    WebElement adminPanelButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/nav/button[2]")
    WebElement usersSectionButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[1]/div[2]/input")
    WebElement searchUserField;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/button[2]")
    WebElement deleteUserButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/div[2]/button")
    WebElement backToWebsiteButton;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]")
    WebElement logoutButton;

    public DeleteUser(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickLogin_Btn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginSubmitButton.click();
    }

    public String getLoginSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginSuccessMessage));
        return loginSuccessMessage.getText();
    }

    public void clickAdminButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(adminButton));
        adminButton.click();
    }

    public void clickAdminPanel() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(adminPanelButton));
        adminPanelButton.click();
    }

    public void clickDeleteUsersSection() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(usersSectionButton));
        usersSectionButton.click();
    }

    public void searchUserByEmailToDelete(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchUserField));
        searchUserField.clear();
        searchUserField.sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='" + email + "']")));
    }

    public void clickDeleteUserButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(deleteUserButton));
        deleteUserButton.click();
    }

    public void clickBackToWebsiteButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(backToWebsiteButton));
        backToWebsiteButton.click();
    }

    public void clickLogoutButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
    }
}
