package starter.Register;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Register extends PageObject {

    private By buttonregist() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div/a");
    }
    private By nameField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }
    private By emailField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }
    private By passwordField() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input"); }

    private By RegisterBtn() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[4]/button");
    }
    private By PageLogin() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[1]");
    }

    @Step
    public void onLoginPageForRegister() {
        open();
        $(buttonregist()).shouldBeVisible();
    }
    @Step
    public void clickRegist(){ $(buttonregist()).click();
    }
    @Step
    public void inputName(String name){
        $(nameField()).type(name);
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
    public void clickRegisterButton(){
        $(RegisterBtn()).click();
    }
    @Step
    public void successRegister() {
        waitOnPage();
        $(PageLogin()).shouldBeVisible();
    }
}