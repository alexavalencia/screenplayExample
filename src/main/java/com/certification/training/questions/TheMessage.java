package com.certification.training.questions;

import com.certification.training.userInterfaces.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MyAccount.LABEL_MY_ACCOUNTS.resolveFor(actor).getText();
    }

    public static TheMessage is(){
        return new TheMessage();
    }
}
