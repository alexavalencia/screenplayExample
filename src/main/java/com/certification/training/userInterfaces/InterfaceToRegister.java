package com.certification.training.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfaceToRegister {

    public static final Target BUTTON_SIGN_IN = Target.the("Select button sing in").located(By.className(("login")));
    public static final Target INPUT_EMAIL = Target.the("To writte email").located(By.id("email_create"));
    public static final Target BUTTON_CREATE_ACCOUNT = Target.the("create account").located(By.name("SubmitCreate"));
    public static final Target INPUT_FIRST_NAME = Target.the("Write first name").located(By.id("customer_firstname"));
    public static final Target INPUT_LAST_NAME = Target.the("To Write last name").located(By.id("customer_lastname"));
    public static final Target INPUT_EMAIL_TO = Target.the("To Write email").located(By.id("email"));
    public static final Target INPUT_PASSWORD = Target.the("To Write password").located(By.id("passwd"));
    public static final Target SELECT_DAY = Target.the("Select day").located(By.id("days"));
    public static final Target SELECT_MONTH = Target.the("Select montH").located(By.id("months"));
    public static final Target SELECT_YEAR = Target.the("Select year").located(By.id("years"));
    public static final Target INPUT_FIRST_NAME_ADDRESS = Target.the("To write first name by address").located(By.id("firstname"));
    public static final Target INPUT_LAST_NAME_ADDRESS = Target.the("To write last name by address").located(By.id("lastname"));
    public static final Target INPUT_COMPANY = Target.the("To write company").located(By.id("company"));
    public static final Target INPUT_ADDRESS = Target.the("To write address").located(By.id("address1"));
    public static final Target INPUT_CITY = Target.the("To write city").located(By.id("city"));
    public static final Target SELECT_STATE = Target.the("select state").located(By.id("id_state"));
    public static final Target INPUT_ZIP_CODE = Target.the("To write zip code").located(By.id("postcode"));
    public static final Target SELECT_COUNTRY = Target.the("select country").located(By.id("id_country"));
    public static final Target INPUT_MOBILE = Target.the("To write mobile").located(By.id("phone_mobile"));
    public static final Target INPUT_ADDRESS_REFERENCE = Target.the("To write address reference").located(By.id("alias"));
    public static final Target BUTTON_REGISTER = Target.the("Click on register").located(By.id("submitAccount"));


}
