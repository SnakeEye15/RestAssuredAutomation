package ReqResAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class PutPatchDelete_Data {
    @Test
    public void UpdateUserDataWithPut_Test(){
        JSONObject data=new JSONObject();
        data.put("Name","Dheeraj Saini");
        data.put("job","QA");

        baseURI="https://reqres.in/api/users/2";

        given().
                header("x-api-key","reqres-free-v1").
                body(data.toJSONString()).
        when().
                put("/users/2").//:Here last ID will be keep changing as per post request
        then().
                statusCode(200).log().all();

    }
    @Test
    public void UpdateDataWithPatch_Test(){
        JSONObject data=new JSONObject();
        data.put("Name","Rushikesh");
        data.put("job","Dev");

        baseURI="https://reqres.in";

        given().
                header("x-api-key","reqres-free-v1").
                body(data.toJSONString()).
        when().
                patch("/api/users/2").
        then().
                statusCode(200).log().all();

    }

    @Test
    public void DeleteUserData_Test(){
        baseURI="https://reqres.in";
        given().
                header("x-api-key","reqres-free-v1").
        when().
                delete("/api/users/2").
        then().
                statusCode(204).
                log().all();
    }




}
