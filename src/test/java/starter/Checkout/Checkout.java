package starter.Checkout;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Checkout extends PageObject {

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
    private By productList() {return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div[1]/table/thead/tr/th[1]");}
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
    @Step
    public void clickBtnBayar(){
        $(btnBayar()).click();
    }
    @Step
    public void TransactionPage(){
        waitABit(3);
        $(productList()).shouldBeVisible();
    }
}