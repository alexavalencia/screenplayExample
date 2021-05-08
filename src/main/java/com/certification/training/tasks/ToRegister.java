package com.certification.training.tasks;

import com.certification.training.model.Register;
import com.certification.training.userInterfaces.InterfaceToRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ToRegister implements Task {
    private final Register register;

    public ToRegister(Register register) {
        this.register = register;
    }
    


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InterfaceToRegister.BUTTON_SIGN_IN),
                Enter.theValue(register.getEmail()).into(InterfaceToRegister.INPUT_EMAIL),
                Click.on(InterfaceToRegister.BUTTON_CREATE_ACCOUNT));
        actor.attemptsTo(Enter.theValue(register.getFirstName()).into(InterfaceToRegister.INPUT_FIRST_NAME),
                Enter.theValue(register.getLastName()).into(InterfaceToRegister.INPUT_LAST_NAME),
                Enter.theValue(register.getEmail()).into(InterfaceToRegister.INPUT_EMAIL_TO),
                Enter.theValue(register.getPassword()).into(InterfaceToRegister.INPUT_PASSWORD),
                SelectFromOptions.byValue(register.getDateDay()).from(InterfaceToRegister.SELECT_DAY),
                SelectFromOptions.byVisibleText(register.getDateMonth()+" ").from(InterfaceToRegister.SELECT_MONTH),
                SelectFromOptions.byValue(register.getDateYear()).from(InterfaceToRegister.SELECT_YEAR),
                Enter.theValue(register.getAddressName()).into(InterfaceToRegister.INPUT_FIRST_NAME_ADDRESS),
                Enter.theValue(register.getAddressLastName()).into(InterfaceToRegister.INPUT_LAST_NAME_ADDRESS),
                Enter.theValue(register.getAddressCompany()).into(InterfaceToRegister.INPUT_COMPANY),
                Enter.theValue(register.getAddress()).into(InterfaceToRegister.INPUT_ADDRESS),
                Enter.theValue(register.getAddressCity()).into(InterfaceToRegister.INPUT_CITY),
                SelectFromOptions.byVisibleText(register.getState()).from(InterfaceToRegister.SELECT_STATE),
                Enter.theValue(register.getPostalCode()).into(InterfaceToRegister.INPUT_ZIP_CODE),
                SelectFromOptions.byVisibleText(register.getCountry()).from(InterfaceToRegister.SELECT_COUNTRY),
                Enter.theValue(register.getCellPhone()).into(InterfaceToRegister.INPUT_MOBILE),
                Enter.theValue(register.getAddressReference()).into(InterfaceToRegister.INPUT_ADDRESS_REFERENCE),
                Click.on(InterfaceToRegister.BUTTON_REGISTER)

                );
    }

    public static ToRegister withData (Register register){
        return Tasks.instrumented(ToRegister.class, register);
    }

}
