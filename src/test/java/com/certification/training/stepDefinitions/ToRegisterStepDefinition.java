package com.certification.training.stepDefinitions;

import com.certification.training.model.Register;
import com.certification.training.questions.TheMessage;
import com.certification.training.questions.TheUser;
import com.certification.training.tasks.OpenBrowser;
import com.certification.training.tasks.ToRegister;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class ToRegisterStepDefinition {

    @Given("^Alexa open the web$")
    public void alexaOpenTheWeb() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenBrowser.browser());
    }


    @When("^the Alexa record the data$")
    public void theAlexaRecordTheData(List<Register> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(ToRegister.withData(data.get(0)));

    }

    @Then("^he sees the message \"([^\"]*)\"$")
    public void heSeesTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheMessage.is(), Matchers.equalTo(message)));
    }

    @Then("^he sees the user name \"([^\"]*)\"$")
    public void heSeesTheUserName(String name) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheUser.is(), Matchers.equalTo(name)));
    }
}
