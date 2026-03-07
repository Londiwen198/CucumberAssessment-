package utils;

import Pages.AddNewuser;
import Pages.adminUserManagement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver;
    public static adminUserManagement adminUserManagement;
    public AddNewuser addNewuser;



    protected static String registeredEmail;
    protected static String registeredPassword;

    public Base() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.startBrowser("edge", "https://ndosisimplifiedautomation.vercel.app/#practice");
        addNewuser = PageFactory.initElements(driver, AddNewuser.class);

        adminUserManagement = PageFactory.initElements(driver, adminUserManagement.class);
    }
}













