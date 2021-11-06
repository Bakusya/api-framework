package practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import pojos.User;


public class RestAPIDemo {

    public static void main(String[] args) {
        String uri = "https://gorest.co.in/public/v1/users";

        RequestSpecification requestSpecification;
        Response response = RestAssured
                .given()
                .baseUri(uri)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .request("GET");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void test1() {
        RestAssured.baseURI="https://reqres.in";
        RequestSpecification request = RestAssured.given();
        Response response = request.when().accept(ContentType.JSON).get("/api/users");
        System.out.println(response.getBody().prettyPrint());


//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try {
//            objectMapper.readValue(json,Car.class);
//        }
//        User user = new User();
   }


}

