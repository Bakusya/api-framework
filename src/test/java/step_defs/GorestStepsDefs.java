package step_defs;

import com.fasterxml.jackson.core.JsonProcessingException;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import pojos.UserResponseList;
import utilities.ObjectConverter;

public class GorestStepsDefs<CommonData> {

    private CommonData commonData;

    public GorestStepsDefs(CommonData commonData){
        this.commonData=commonData;

    }

    @Before
    public void setUp(){
        RestAssured.baseURI="https://gorest.co.in/public-api";
    }


    @When("^all users are requested$")
    public void all_users_are_requested() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.accept(ContentType.JSON);

    }


//
//    @Then("^(\\d+) users are returned$")
//    public void users_are_returned(int amountOfUsers) throws JsonProcessingException {
//        UserResponseList userResponse = ObjectConverter.convertJsonObjectToJavaObject(commonData.response.body().asString(),UserResponseList.class);
//        MatcherAssert.assertThat(userResponse.getUsers().size(), Matchers.is(amountOfUsers));
//
//
//    }

    @When("^the following users is created$")
    public void the_following_users_is_created(DataTable arg1)  {

    }


    @Then("^The following user is returned$")
    public void the_following_user_is_returned(DataTable arg1)  {

    }




}
