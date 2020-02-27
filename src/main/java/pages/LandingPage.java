package pages;

import org.openqa.selenium.By;

public class LandingPage {

    By singInMenu = By.xpath("//*[@class='HeaderMenu-link no-underline mr-3']");
    By loginField = By.xpath("//*[@class='form-control input-block']");
    By passwordField = By.xpath("//*[@id=\"password\"]");
    By singInButton = By.xpath("//*[@class='btn btn-primary btn-block']");

    public By getSingInMenu() {
        return singInMenu;
    }

    public By getLoginField() {
        return loginField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getSingInButton() {
        return singInButton;
    }
}
