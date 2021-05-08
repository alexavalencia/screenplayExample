package com.certification.training.questions;

import com.certification.training.userInterfaces.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheUser implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MyAccount.NAME_TITLE.resolveFor(actor).getText();
    }

    public static TheUser is(){
        return new TheUser();
    }
}
