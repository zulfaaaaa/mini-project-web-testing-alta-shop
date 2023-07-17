package starter.Login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginInvalidPassword extends PageObject {

    private By emailField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }
    private By passwordField() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input"); }

    private By LoginBtn() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button");
    }
    private By ErrorMessage() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]");
    }

    @Step
    public void onLoginPageForLogin() {
        open();
        $(LoginBtn()).shouldBeVisible();
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(LoginBtn()).click();
    }
    @Step
    public void invalidLogin() {
        waitABit(3);
        $(ErrorMessage()).shouldBeVisible();
    }
}