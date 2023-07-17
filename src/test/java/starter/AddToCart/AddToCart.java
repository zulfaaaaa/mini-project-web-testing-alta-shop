package starter.AddToCart;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddToCart extends PageObject {

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
    private By Beli(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[2]/div/div[3]/div[2]/button[2]/span");
    }
    private By shoppingchartbtn(){
        return By.xpath("/html/body/div/div[1]/header/div/button[1]");
    }
    private By btnBayar(){ return By.xpath("/html/body/div/div/main/div/div/div[2]/button");}

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
    @Step
    public void clickbeli(){
        $(Beli()).click();
    }
    @Step
    public void clickShoppingCart(){
        $(shoppingchartbtn()).click();
    }
    @Step
    public void CheckoutPage(){
        waitABit(3);
        $(btnBayar()).shouldBeVisible();
    }
}
//    private By emailField() {
//        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
//    }
//    private By passwordField() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input"); }
//
//    private By LoginBtn() {
//        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button");
//    }
//    private By onDashboard() {
//        return By.xpath("/html/body/div/div/header/div/div[1]/h3");
//    }
//    private By item1() { return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[2]/div/div[3]/div[2]/button[2]");}
//    private By item2() { return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[6]/div/div[3]/div[2]/button[2]");}
//    private By item3() { return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[8]/div/div[3]/div[2]/button[2]");}
//    private By shoppingchartbtn(){
//        return By.xpath("/html/body/div/div[1]/header/div/button[1]");
//    }
//    private By btnBayar(){ return By.xpath("/html/body/div/div/main/div/div/div[2]/button");}
//
//    @Step
//    public void OnLoginPage(){
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
//    public void OnDashboard(){
//        open();
//        $(onDashboard()).shouldBeVisible();
//    }
//    @Step
//    public void ClickItem1(){
//        $(item1()).click();}
//    @Step
//    public void ClickItem2(){
//        $(item2()).click();}
//    @Step
//    public void ClickItem3(){
//        $(item3()).click();
//    }
//    @Step
//    public void ClickShoppingChat(){
//        $(shoppingchartbtn()).click();
//    }
//    @Step
//    public void CheckoutPage(){
//        waitABit(3);
//        $(btnBayar()).shouldBeVisible();
//    }
//}
