package starter.Login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By emailField() {
        return By.xpath("//label[text()='Email']/following-sibling::input");
    }
    private By passwordField() {
        return By.xpath("//label[text()='Password']/following-sibling::input");
    }

    private By SignBtn() {
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span");
    }
    private By Login(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }


    @Step
    public void OnAltaShopPage(){
        open();
        $(SignBtn()).shouldBeVisible();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputpassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickSignButton(){
        $(SignBtn()).click();
    }
    @Step
    public void clickSubmitLogin(){
        $(Login()).click();
    }

//    private By emailField() {
//        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
//    }
//    private By passwordField() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input"); }
//
//    private By LoginBtn() {
//        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button");
//    }
//    private By DashboardPage() {
//        return By.xpath("/html/body/div/div/header/div/div[1]/h3");
//    }
//
//    @Step
//    public void onLoginPageForLogin() {
//        open();
//        $(LoginBtn()).shouldBeVisible();
//    }
//    @Step
//    public void inputEmail(String email){
//        $(emailField()).type(email);
//    }
//    @Step
//    public void inputPassword(String password){
//        $(passwordField()).type(password);
//    }
//
//    @Step
//    public void clickLoginButton(){
//        $(LoginBtn()).click();
//    }
//    @Step
//    public void successLogin() {
//        waitFor(3);
//        $(DashboardPage()).shouldBeVisible();
//    }
}