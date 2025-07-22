package ReqResAPI;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleUser {
    @Test
    public void getSingleUser_Test1(){
        baseURI="https://reqres.in";
        given().
                get("/api/users/2").
                then().
                statusCode(200);

    }
    @Test
    public void singleUserNotFound_Test(){
        baseURI="https://reqres.in";
        given().
                get("/api/users/23").
                then().
                statusCode(404);

    }

}
