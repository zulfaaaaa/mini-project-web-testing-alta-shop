//package starter.SelectCategory;
//
//import net.thucydides.core.annotations.Step;
//import net.thucydides.core.pages.PageObject;
//import org.openqa.selenium.By;
//
//public class SelectCategory extends PageObject {
//
//    private By emailField() {
//        return By.xpath("//label[text()='Email']/following-sibling::input");
//    }
//    private By passwordField() {
//        return By.xpath("//label[text()='Password']/following-sibling::input");
//    }
//
//    private By SignBtn() {
//        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span");
//    }
//    private By Login(){
//        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
//    }
//    private By Category(){
//        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[1]/div[1]");
//    }
//    private By selectCategory (){
//        return By.xpath("/html/body/div/div[2]/div/div[1]");
//    }
//    private By productlist(){ return By.xpath("/html/body/div/div[1]/main/div/div/div[2]");}
//
//    @Step
//    public void OnAltaShopPage(){
//        open();
//        $(SignBtn()).shouldBeVisible();
//    }
//    @Step
//    public void inputEmail(String email){
//        $(emailField()).type(email);
//    }
//    @Step
//    public void inputpassword(String password){
//        $(passwordField()).type(password);
//    }
//    @Step
//    public void clickSignButton(){
//        $(SignBtn()).click();
//    }
//    @Step
//    public void clickSubmitLogin(){
//        $(Login()).click();
//    }
//    @Step
//    public void clickCategory(){
//        $(Category()).click();
//    }
//    @Step
//    public void userSelectCategory(){
//        $(selectCategory()).click();
//    }
//    @Step
//    public void categoryPage(){
//        waitABit(3);
//        $(productlist()).shouldBeVisible();
//    }
//}
//
