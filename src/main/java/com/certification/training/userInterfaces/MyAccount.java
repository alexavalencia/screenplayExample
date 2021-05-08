package com.certification.training.userInterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MyAccount {

    public static final Target LABEL_MY_ACCOUNTS= Target.the("label my accounts").located(By.className("page-heading"));
    public static final Target NAME_TITLE= Target.the("name title").located(By.xpath("//a[@class='account']/span"));
}
