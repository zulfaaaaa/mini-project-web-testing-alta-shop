package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.AddToCart.AddToCart;
import starter.Checkout.Checkout;
import starter.Login.*;
import starter.Register.*;
//import starter.SelectCategory.SelectCategory;
//import starter.RiwayatTransaction.RiwayatTransaction;

public class UserSteps {
    @Steps
    Register register;
    @Steps
    RegisteInvalidSameEmail registerInvalidSameEmail;
    @Steps
    RegisterInvalidFormatEmail registerInvalidFormatEmail;
    @Steps
    RegisterInvalidFormatName registerInvalidFormatName;
    @Steps
    RegisterBlankEmail registerBlankEmail;
    @Steps
    RegisterBlankName registerBlankName;
    @Steps
    RegisterBlankPassword registerBlankPassword;
    @Steps
    RegisterBlankData registerBlankData;
    @Steps
    Login login;
    @Steps
    LoginInvalidEmail loginInvalidEmail;
    @Steps
    LoginInvalidPassword loginInvalidPassword;
    @Steps
    LoginBlankEmail loginBlankEmail;
    @Steps
    LoginBlankPassword loginBlankPassword;
    @Steps
    LoginBlankData loginBlankData;
    @Steps
    AddToCart addToCart;
    @Steps
    Checkout checkout;
//    @Steps
//    SelectCategory selectCategory;
//    @Steps
//    RiwayatTransaction riwayatTransaction;

    // ======================= Register Valid =======================
    @Given("user on login page for register")
    public void userOnLoginPageForRegister() {
        register.onLoginPageForRegister();
    }
    @When("user click button register")
    public void userClickButtonRegister() {
        register.clickRegist();
    }
    @And("user input valid full name for register")
    public void userInputValidFullName() {
        register.inputName("Zulfa Syadiya");
    }
    @And("user input valid email for register")
    public void userInputValidEmail() {
        register.inputEmail("regzul@mail.com");
    }
    @And("user input valid password for register")
    public void userInputValidPassword() {
        register.inputPassword("123abc");
    }
    @And("user click register button")
    public void userClickRegisterButton() {
        register.clickRegisterButton();
    }
    @Then("user on login page succes register")
    public void successRegister() {
        register.successRegister();
    }

    // ======================= Register Invalid Same Email =======================
    @Given("user on login page for register same email")
    public void userOnLoginPageForRegisterSameEmail() {
       registerInvalidSameEmail.onLoginPageForRegister();
    }
    @When("user click button for register same email")
    public void userClickButtonRegisterSameEmail() {
        registerInvalidSameEmail.clickRegist();
    }
    @And("user input valid full name for register same email")
    public void userInputValidFullNameSameEmail() {
        registerInvalidSameEmail.inputName("Zulfa Syadiya");
    }
    @And("user input same email")
    public void userInputInvalidEmail() {
        registerInvalidSameEmail.inputEmail("cobadulu@mail.com");
    }
    @And("user input valid password for register same email")
    public void userInputValidPasswordSameEmail() {
        registerInvalidSameEmail.inputPassword("123abc");
    }
    @And("user click register button for register same email")
    public void userClickRegisterButtonSameEmail() {
        registerInvalidSameEmail.clickRegisterButton();
    }
    @Then("user should see an error message")
    public void userOnLoginPageAfterRegistSameEmail() {
        registerInvalidSameEmail.errormesagge();
    }

    // ======================= Register Incorrect Format Email =======================
    @Given("user on login page for register invalid format email")
    public void userOnLoginPageForRegisterInvalidFormatEmail() {
        registerInvalidFormatEmail.onLoginPageForRegister();
    }
    @When("user click button for register invalid format email")
    public void userClickButtonRegisterInvalidFormatEmail() {
        registerInvalidFormatEmail.clickRegist();
    }
    @And("user input valid full name for register invalid format email")
    public void userInputValidFullNameInvalidFormatEmail() {
        registerInvalidFormatEmail.inputName("Zulfa Syadiya");
    }
    @And("user input invalid format email")
    public void userInputInvalidFormatEmail() {
        registerInvalidFormatEmail.inputEmail("faill2xx22m@.com!@#");
    }
    @And("user input valid password for register invalid format email")
    public void userInputValidPasswordInvalidFormatEmail() {
        registerInvalidFormatEmail.inputPassword("123abc");
    }
    @And("user click register button for register invalid format email")
    public void userClickRegisterButtonInvalidFormatEmail() {
        registerInvalidFormatEmail.clickRegisterButton();
    }
    @Then("user on login page succes register invalid format email")
    public void successLoginInvalidFormatEmail() {
        registerInvalidFormatEmail.onPageRegist();
    }

    // ======================= Register Invalid Name  =======================
    @Given("user on login page for register invalid format name")
    public void userOnLoginPageForRegisterInvalidFormatName() {
        registerInvalidFormatName.onLoginPageForRegister();
    }
    @When("user click button for register invalid format name")
    public void userClickButtonRegisterInvalidFormatName() {
        registerInvalidFormatName.clickRegist();
    }
    @And("user input invalid format full name")
    public void userInputInvalidFormatName() {
        registerInvalidFormatName.inputName("72372431");
    }
    @And("user input valid email for register invalid format name")
    public void userInputEmailInvalidFormatName() {
        registerInvalidFormatName.inputEmail("nmfail2xx@mail.com");
    }
    @And("user input valid password for register invalid format name")
    public void userInputValidPasswordInvalidFormatName() {
        registerInvalidFormatName.inputPassword("123abc");
    }
    @And("user click register button for register invalid format name")
    public void userClickRegisterButtonInvalidFormatName() {
        registerInvalidFormatName.clickRegisterButton();
    }
    @Then("user on login page succes register invalid format name")
    public void successLoginInvalidFormatName() {
        registerInvalidFormatName.successLogin();
    }


    // ======================= Register Blank Name =======================
    @Given("user on login page for register blank name")
    public void userOnLoginPageForRegisterBlankName() {registerBlankName.onLoginPageForRegister();}
    @When("user click button for register blank name")
    public void userClickButtonRegisterBlankName() {
        registerBlankName.clickRegist();
    }
    @And("user input blank name for register")
    public void userInputValidFullNameBlankName() {
        registerBlankName.inputName("");
    }
    @And("user input valid email for register blank name")
    public void userInputBlankName() {
        registerBlankName.inputEmail("blanknamereg@mail.com");
    }
    @And("user input valid password for register blank name")
    public void userInputValidPasswordBlankName() {
        registerBlankName.inputPassword("123abc");
    }
    @And("user click register button for register blank name")
    public void userClickRegisterButtonBlankName() {
        registerBlankName.clickRegisterButton();
    }
    @Then("user on login page fail register blank name")
    public void userOnLoginPageAfterRegistBlankName() {
        registerBlankName.successLogin();
    }

    // ======================= Register Blank Email =======================
    @Given("user on login page for register blank email")
    public void userOnLoginPageForRegisterBlankEmail() {registerBlankEmail.onLoginPageForRegister();}
    @When("user click button for register blank email")
    public void userClickButtonRegisterBlankEmaill() {
        registerBlankEmail.clickRegist();
    }
    @And("user input valid full name for register blank email")
    public void userInputValidFullNameBlankEmail() {
        registerBlankEmail.inputName("Zulfa Syadiya");
    }
    @And("user input blank email for register")
    public void userInputBlankEmail() {
        registerBlankEmail.inputEmail("");
    }
    @And("user input valid password for register blank email")
    public void userInputValidPasswordBlankEmaill() {
        registerBlankEmail.inputPassword("123abc");
    }
    @And("user click register button for register blank email")
    public void userClickRegisterButtonBlankEmail() {
        registerBlankEmail.clickRegisterButton();
    }
    @Then("user on login page fail register blank email")
    public void userOnLoginPageAfterRegistBlankEmail() {
        registerBlankEmail.successLogin();
    }

    // ======================= Register Blank Password =======================
    @Given("user on login page for register blank password")
    public void userOnLoginPageForRegisterBlankPassword() {registerBlankPassword.onLoginPageForRegister();}
    @When("user click button for register blank password")
    public void userClickButtonRegisterBlankPassword() {
        registerBlankPassword.clickRegist();
    }
    @And("user input valid full name for register blank password")
    public void userInputValidFullNameBlankPassworda() {
        registerBlankPassword.inputName("Zulfa Syadiya");
    }
    @And("user input valid email for register blank password")
    public void userInputEmailBlankPassword() {registerBlankPassword.inputEmail("blankpassreg@mail.com");}
    @And("user input blank password for register")
    public void userInputValidPasswordBlankPassword() {registerBlankPassword.inputPassword("");}
    @And("user click register button for register blank password")
    public void userClickRegisterButtonBlankPassword() { registerBlankPassword.clickRegisterButton();}
    @Then("user on login page succes register blank password")
    public void userOnLoginPageAfterRegistBlankPassword() { registerBlankPassword.successLogin();}

    // ======================= Register Blank Data =======================
    @Given("user on login page for register blank data")
    public void userOnLoginPageForRegisterBlankData() {registerBlankData.onLoginPageForRegister();}
    @When("user click button for register blank data")
    public void userClickButtonRegisterBlankData() {
        registerBlankData.clickRegist();
    }
    @And("user input blank name for register blank data")
    public void userInputValidFullNameBlankData() {
        registerBlankData.inputName("");
    }
    @And("user input blank email for register blank data")
    public void userInputEmailBlankData() {
        registerBlankData.inputEmail("");
    }
    @And("user input blank password for register blank data")
    public void userInputValidPasswordBlankData() {
        registerBlankData.inputPassword("");
    }
    @And("user click register button for register blank data")
    public void userClickRegisterButtonBlankData() { registerBlankData.clickRegisterButton();}
    @Then("user on login page succes register blank data")
    public void userOnLoginPageAfterRegistBlankData() { registerBlankData.successLogin();}


    // ======================= Login Valid =======================
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        login.OnAltaShopPage();
    }
    @When("user clicks on Sign button")
    public void userClicksOnSignButton() {
        login.clickSignButton();
    }
    @And("user enters valid email")
    public void userEntersValidEmail() {
        login.inputEmail("samplelogin@mail.com");
    }
    @And("user enters valid password")
    public void userEntersValidPassword() {
        login.inputpassword("123qwe");
    }
    @And("they click the Login button")
    public void theyClickTheButton() {
        login.clickSubmitLogin();
    }
    @Then("they should be redirected to the home page")
    public void theyShouldBeRedirectedToTheHomePage() {
        System.out.println("user should be redirected to AltaShop homepage");
    }

    // ======================= Login Invalid Email =======================
    @Given("user on login page for login invalid email")
    public void userOnLoginPageForLoginInvalidEmail() {
        loginInvalidEmail.onLoginPageForLogin();
    }
    @When("user input invalid email")
    public void userInputInValidEmail() {
        loginInvalidEmail.inputEmail("sampleloginmail.commm@");
    }
    @And("user input valid password for login invalid email")
    public void userInputValidPasswordForLoginInvalidEmail() {
        loginInvalidEmail.inputPassword("123qwe");
    }
    @And("user click login button for login invalid email")
    public void userClickLoginButtonInvalidEmail() {
        loginInvalidEmail.clickLoginButton();
    }
    @Then("user on login page and see error message record not found")
    public void errorMessageInvalidEmail() {
        loginInvalidEmail.invalidLogin();
    }

    // ======================= Login Invalid Password =======================
    @Given("user on login page for login invalid password")
    public void userOnLoginPageForLoginInvalidPassword() {
        loginInvalidPassword.onLoginPageForLogin();
    }
    @When("user input valid email for login invalid password")
    public void userInputValidEmailForLoginInvalidPassword() {
        loginInvalidPassword.inputEmail("samplelogin@mail.com");}
    @And("user input invalid password")
    public void userInputInvalidPassword() {
        loginInvalidPassword.inputPassword("123abc");
    }
    @And("user click login button for login invalid password")
    public void userClickLoginButtonInvalidPassword() {
        loginInvalidPassword.clickLoginButton();
    }
    @Then("user on login page and user see error message record not found")
    public void successLoginInvalidPassword() {
        loginInvalidPassword.invalidLogin();
    }


    // ======================= Login Blank Email =======================
    @Given("user on login page for login blank email")
    public void userOnLoginPageForLoginBlankEmail() { loginBlankEmail.onLoginPageForLogin();}
    @When("user input valid email for login blank email")
    public void userInputValidEmailForLoginBlankEmail() {
        loginBlankEmail.inputEmail("");
    }
    @And("user input valid password for login blank email")
    public void userInputValidPasswordForLoginBlankEmail() {loginBlankEmail.inputPassword("123qwe");
    }
    @And("user click login button for login blank email")
    public void userClickLoginButtonBlankEmailvalidEmail() {
        loginBlankEmail.clickLoginButton();
    }
    @Then("user on login page and user see error message blank email")
    public void errorMessageBlankEmail() {loginBlankEmail.invalidLogin();
    }

    // ======================= Login Blank Password =======================
    @Given("user on login page for login blank password")
    public void userOnLoginPageForLoginBlankPassword() { loginBlankPassword.onLoginPageForLogin();}
    @When("user input valid email for login blank password")
    public void userInputValidEmailForLoginBlankPassword() {
        loginBlankPassword.inputEmail("cobadulu@mail.com");
    }
    @And("user input valid password for login blank password")
    public void userInputValidPasswordForLoginBlankPassword() {loginBlankPassword.inputPassword("");}
    @And("user click login button for login blank password")
    public void userClickLoginButtonBlankEmailvalidPassword() {
        loginBlankPassword.clickLoginButton();
    }
    @Then("user on login page and user see error message blank password")
    public void errorMessageBlankPassword() {loginBlankPassword.invalidLogin();}

    // ======================= Login Blank Data =======================
    @Given("user on login page for login blank data")
    public void userOnLoginPageForLoginBlankData() { loginBlankData.onLoginPageForLogin();}
    @When("user input valid email for login blank data")
    public void userInputValidEmailForLoginBlankData() {
        loginBlankData.inputEmail("cobadulu@mail.com");
    }
    @And("user input valid password for login blank data")
    public void userInputValidPasswordForLoginBlankData() {loginBlankData.inputPassword("");}
    @And("user click login button for login blank data")
    public void userClickLoginButtonBlankEmailvalidData() {
        loginBlankData.clickLoginButton();
    }
    @Then("user on login page and user see error message blank data")
    public void errorMessageBlankData() {loginBlankData.invalidLogin();}


    // ======================= Add To Cart =======================
    @Given("user on homepage AltaShop")
    public void userOnHomePage() {
        addToCart.OnAltaShopPage();
        addToCart.clickSignButton();
        addToCart.inputEmail("samplelogin@mail.com");
        addToCart.inputpassword("123qwe");
        addToCart.clickSubmitLogin();
    }
    @When("user click Buy on item to add to cart")
    public void userClickItem() {
        addToCart.clickbeli();
    }

    @And("user click shopping cart")
    public void userClickShoppingCart(){addToCart.clickShoppingCart();}

    @Then("user can see the products added to the cart")
    public void userShouldSeeTheProducts() {
        addToCart.CheckoutPage();
    }


    // ======================= Checkout Products =======================
    @Given("user on homepage AltaShop for checkout")
    public void userOnHomePageForCheckout() {
        checkout.OnAltaShopPage();
        checkout.clickSignButton();
        checkout.inputEmail("samplelogin@mail.com");
        checkout.inputpassword("123qwe");
        checkout.clickSubmitLogin();
    }
    @When("user click Buy on item to add to cart for checkout")
    public void userClickItemForCheckout() {
        checkout.clickbeli();
    }
    @And("user click shopping cart for checkout")
    public void userClickShoppingCartForCheckout(){checkout.clickShoppingCart();}
    @And("user click button bayar")
    public void userClickBtnBayar(){checkout.clickBtnBayar();}
    @Then("user can see page transactions")
    public void userShouldSeeTheProductsListPage() {
        checkout.TransactionPage();
    }

    // ======================= Select Category =======================
//    @Given("user on homepage AltaShop for select category")
//    public void userOnHomePageforselectcategory() {
//        selectCategory.OnAltaShopPage();
//        selectCategory.clickSignButton();
//        selectCategory.inputEmail("samplelogin@mail.com");
//        selectCategory.inputpassword("123qwe");
//        selectCategory.clickSubmitLogin();
//    }
//    @When("user click button category")
//    public void userClickCategory() {
//        selectCategory.clickCategory();
//    }
//
//    @And("user select category")
//    public void userClickselectCategory(){selectCategory.userSelectCategory();}
//
//    @Then("user can see the products by categories")
//    public void userShouldSeelistproductbycategory() {
//        selectCategory.categoryPage();
//    }
}
